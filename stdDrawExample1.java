public class StdDrawExample2 {
	public static void main(){
		int N = 100;
		StdDraw.setXScale(0,N);
		StdDraw.setYScale(0,N*N);
		StdDraw.setPenRadius(.01);
		for(int i = 0; i <= N; i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.long(i));
		}
	}
}