from collections import deque
from pathlib import Path
import random
import subprocess
import tempfile


def check(executable, lines, expected):
    output = subprocess.check_output(
        [str(executable)], input="\n".join(lines).encode(), timeout=10
    )
    assert list(map(int, output.split())) == expected


def main():
    source = Path(__file__).with_name("Main.cpp")
    with tempfile.TemporaryDirectory() as temporary:
        executable = Path(temporary) / "solution"
        subprocess.run(
            ["c++", "-std=c++17", "-O2", str(source), "-o", str(executable)],
            check=True,
        )
        check(executable, ["5 4", "1 2", "2 3", "2 4", "4 5", "2 1", "2 5", "1 2", "2 5"], [0, 3, 2])
        randomizer = random.Random(342)
        for n in range(2, 90):
            graph = [[] for _ in range(n)]
            lines = [f"{n} 100"]
            red = {0}
            expected = []
            for v in range(1, n):
                u = randomizer.randrange(v)
                graph[u].append(v)
                graph[v].append(u)
                lines.append(f"{u + 1} {v + 1}")
            for _ in range(100):
                u = randomizer.randrange(n)
                if randomizer.randrange(4) == 0 and u not in red:
                    red.add(u)
                    lines.append(f"1 {u + 1}")
                    continue
                lines.append(f"2 {u + 1}")
                queue = deque([(u, 0)])
                seen = {u}
                while queue:
                    v, distance = queue.popleft()
                    if v in red:
                        expected.append(distance)
                        break
                    for neighbor in graph[v]:
                        if neighbor not in seen:
                            seen.add(neighbor)
                            queue.append((neighbor, distance + 1))
            check(executable, lines, expected)
        n = 100_000
        lines = [f"{n} 3", *(f"{i} {i + 1}" for i in range(1, n)), f"2 {n}", f"1 {n - 1}", f"2 {n}"]
        check(executable, lines, [n - 1, 1])


if __name__ == "__main__":
    main()
