import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));String a=in.readLine(),b=in.readLine();
System.out.println(Integer.signum(a.compareToIgnoreCase(b)));
 }
}
