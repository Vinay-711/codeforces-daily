from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
cases=[('1\n++X', '1'), ('2\nX++\n--X', '0'), ('4\n--X\nX--\nX++\n++X', '0'), ('150\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\nX--\n', '-150')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
  assert result.stdout.strip()==want.strip(),(data,result.stdout,want)
print(str(len(cases))+' sample and original edge-case checks passed')
