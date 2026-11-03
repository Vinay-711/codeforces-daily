import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);String s=in.next();boolean[] seen=new boolean[26];int unique=0;for(char c:s.toCharArray())if(!seen[c-'a']){seen[c-'a']=true;unique++;}System.out.println(unique%2==0?"CHAT WITH HER!":"IGNORE HIM!");
 }
}
