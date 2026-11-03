from pathlib import Path
import subprocess
import tempfile

with tempfile.TemporaryDirectory() as tmp:
    subprocess.run(["javac", "--release", "21", "-d", tmp, str(Path(__file__).with_name("Main.java"))], check=True)
    for data, expected in [('4 2\n0 9 9 9\n9 0 9 9\n9 9 0 9\n9 9 9 0\n', '18'), ('2 2\n0 7\n7 0\n', '0'), ('2 1\n0 7\n7 0\n', '7')]:
        result = subprocess.check_output(["java", "-cp", tmp, "Main"], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
