from pathlib import Path
import subprocess
import tempfile

source = Path(__file__).with_name('Main.java')
with tempfile.TemporaryDirectory() as directory:
    subprocess.run(['javac', '-d', directory, str(source)], check=True)
    for data, expected in [('4 4\n1 2 3 4\n1 1 4\n2 1 4\n1 2 4\n2 1 3\n', '17 12'), ('1 3\n1000000000\n2 1 1\n1 1 1\n2 1 1\n', '1000000000 1000000001')]:
        result = subprocess.check_output(['java', '-cp', directory, 'Main'], input=data.encode(), timeout=10)
        assert result.decode().split() == expected.split()
