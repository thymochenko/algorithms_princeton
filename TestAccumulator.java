public class TestAccumulator{

  @Deprecated
  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    VisualAccumulator a = new VisualAccumulator(T,1.0);
    for (int i=0;i < T ;i++ ) {
      a.addDataValue(StdRandom.random());
      StdOut.println(a);
    }
  }

}
