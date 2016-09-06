public class VisualAccumulator extends Accumulator {

  public VisualAccumulator(int trials, double max){
    StdDraw.setXscale(0, trials);
    StdDraw.setYscale(0, max);
    StdDraw.setPenRadius(.005);
  }

  public void addDataValue(double val){
    super.addDataValue(val);
    StdDraw.setPenColor(StdDraw.DARK_GRAY);
    StdDraw.point(N, val);
    StdDraw.setPenColor(StdDraw.RED);
    StdDraw.point(N, mean());
  }
}
