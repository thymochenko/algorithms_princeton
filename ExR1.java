public class ExR1 {

  public static String exR1method (int n){
    if(n <= 0) return "";
    return exR1method(n-3) + n + exR1method(n-2) + n;
  }

  public static void main(String[] args) {
    System.out.println(exR1method(10));
  }
}
