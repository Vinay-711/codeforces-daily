from pathlib import Path
import subprocess
import tempfile

source = Path(__file__).with_name('Main.java')
with tempfile.TemporaryDirectory() as directory:
    subprocess.run(['javac', '-d', directory, str(source)], check=True)
    for data, expected in [('4\n1 1\n100 100\n26 26\n999 999\n', '1 1 0 1')]:
        result = subprocess.check_output(['java', '-cp', directory, 'Main'], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
