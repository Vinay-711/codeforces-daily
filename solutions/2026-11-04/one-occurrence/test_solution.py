from pathlib import Path
import subprocess
import tempfile

with tempfile.TemporaryDirectory() as tmp:
    subprocess.run(["javac", "--release", "21", "-d", tmp, str(Path(__file__).with_name("Main.java"))], check=True)
    for data, expected in [('4\n2 2 3 3\n3\n1 4\n1 1\n2 3\n', '0 2 3'), ('1\n500000\n1\n1 1\n', '500000')]:
        result = subprocess.check_output(["java", "-cp", tmp, "Main"], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
