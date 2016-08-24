public class StringTest {
  public static void main(String[] args) {
    String a = "now is ";
    String b = "the time ";
    String c = "to to to to";
    StdOut.println(a.length());
    StdOut.println(a.charAt(4));
    StdOut.println(a.concat(c));
    StdOut.println(a.indexOf("is"));
    StdOut.println(a.substring(2,5));
    StdOut.println(a.split(" ")[0]);
    StdOut.println(a.split(" ")[1]);
    StdOut.println(a.equals(c));


  }
}
