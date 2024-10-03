public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    System.out.println(lastFirstN("behemoth", "emaculate",4));
    stringManip("tuvalu", "australia");
  }
  public static String lastFirstN(String s1, String s2, int n){
    return s1.substring(s1.length() - n, s1.length()) + s2.substring(0, s2.length() - (n+1));
  }
  public static void stringManip(String x, String y){
    String a = x.toUpperCase();
    String b = y.substring(0,1);
    b = b.toUpperCase();
    b = b + y.substring(1, y.length());
    System.out.println(a + "\n" + b);
  }
}
