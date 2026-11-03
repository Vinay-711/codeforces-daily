from pathlib import Path
import subprocess
import tempfile

with tempfile.TemporaryDirectory() as tmp:
    subprocess.run(["javac", "--release", "21", "-d", tmp, str(Path(__file__).with_name("Main.java"))], check=True)
    for data, expected in [('5 4\n1 2 2 3 3\n1 5 2\n1 5 3\n2 3 2\n4 4 5\n', '-1 2 2 3')]:
        result = subprocess.check_output(["java", "-cp", tmp, "Main"], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
