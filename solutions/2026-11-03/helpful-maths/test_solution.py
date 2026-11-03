from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('3+2+1', '1+2+3'), ('1+1+3+1+3', '1+1+1+3+3'), ('2', '2'), ('3+3+3', '3+3+3'), ('2+1+2+1', '1+1+2+2')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')
