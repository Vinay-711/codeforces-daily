import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);int n=in.nextInt(),x=0;while(n-->0)x+=in.next().charAt(1)=='+'?1:-1;System.out.println(x);
 }
}
