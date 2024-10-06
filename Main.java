import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    Scanner sc = new Scanner (System.in);
    System.out.println("First String?");
    String s1 = sc.nextLine();
    System.out.println("Second String?");
    String s2 = sc.nextLine();
    System.out.println("First/Last n ?");
    int n = sc.nextInt();
    System.out.println(lastFirstN(s1,s2,n));
    sc.nextLine();

    System.out.println("First String?");
    s1 = sc.nextLine();
    System.out.println("Second String?");
    s2 = sc.nextLine();
    stringManip(s1, s2);
    sc.close();
  }
  public static String lastFirstN(String s1, String s2, int n){
    return s1.substring(s1.length() - n, s1.length()) + s2.substring(0, n);
  }
  public static void stringManip(String x, String y){
    String a = x.toUpperCase();
    String b = y.substring(0,1);
    b = b.toUpperCase();
    b = b + y.substring(1, y.length());
    System.out.println(a + "\n" + b);
  }
}
