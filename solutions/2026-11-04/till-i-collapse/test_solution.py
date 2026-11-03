from pathlib import Path
import subprocess
import tempfile

source = Path(__file__).with_name('Main.java')
with tempfile.TemporaryDirectory() as directory:
    subprocess.run(['javac', '-d', directory, str(source)], check=True)
    for data, expected in [('5\n1 3 4 3 3\n', '4 2 1 1 1'), ('4\n1 1 1 1\n', '1 1 1 1'), ('4\n1 2 3 4\n', '4 2 2 1')]:
        result = subprocess.check_output(['java', '-cp', directory, 'Main'], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
