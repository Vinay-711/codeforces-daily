from pathlib import Path
import subprocess
import tempfile

cases = [('5 5\n4 4 9 4 9\n1 2\n1 3\n2 4\n2 5\n1 2\n2 2\n3 2\n1 3\n1 6\n', '2 1 0 1 0')]
source = Path(__file__).with_name('Main.cpp')
with tempfile.TemporaryDirectory() as directory:
    executable = Path(directory) / 'solution'
    subprocess.run(['c++', '-std=c++17', '-O2', str(source), '-o', str(executable)], check=True)
    for data, expected in cases:
        output = subprocess.check_output([str(executable)], input=data.encode(), timeout=10)
        assert output.decode().split() == expected.split()
