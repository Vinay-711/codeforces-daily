from pathlib import Path
import subprocess
import tempfile

cases = [('1\n0\n', '1'), ('3\n7 7 7\n', '0'), ('4\n0 1 2 3\n', '10')]
source = Path(__file__).with_name('Main.cpp')
with tempfile.TemporaryDirectory() as directory:
    executable = Path(directory) / 'solution'
    subprocess.run(['c++', '-std=c++17', '-O2', str(source), '-o', str(executable)], check=True)
    for data, expected in cases:
        output = subprocess.check_output([str(executable)], input=data.encode(), timeout=10)
        assert output.decode().split() == expected.split()
