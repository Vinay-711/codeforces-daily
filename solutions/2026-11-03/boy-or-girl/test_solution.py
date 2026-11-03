from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
cases=[('wjmzbmr', 'CHAT WITH HER!'), ('xiaodao', 'IGNORE HIM!'), ('sevenkplus', 'CHAT WITH HER!'), ('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', 'IGNORE HIM!'), ('ab', 'CHAT WITH HER!')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
  assert result.stdout.strip()==want.strip(),(data,result.stdout,want)
print(str(len(cases))+' sample and original edge-case checks passed')
