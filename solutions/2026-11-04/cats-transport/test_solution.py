from pathlib import Path
import subprocess
import tempfile

source = Path(__file__).with_name('Main.java')
with tempfile.TemporaryDirectory() as directory:
    subprocess.run(['javac', '-d', directory, str(source)], check=True)
    for data, expected in [('2 3 1\n4\n1 0\n2 4\n2 7\n', '6'), ('2 2 3\n8\n2 0\n1 7\n', '0')]:
        result = subprocess.check_output(['java', '-cp', directory, 'Main'], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
