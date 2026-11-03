import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);int ans=0;for(int r=0;r<5;r++)for(int c=0;c<5;c++)if(in.nextInt()==1)ans=Math.abs(r-2)+Math.abs(c-2);System.out.println(ans);
 }
}
