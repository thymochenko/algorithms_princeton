public class Stats {
  public static void main(String[] args) {
    Bag<Double> numbers = new Bag<Double>();
      //le os números de um txt e adiciona na bag
   numbers.add(10.1);
   numbers.add(10.2);
      //coloca  o total da bag na variável N
    int N = numbers.size();
    double sum = 0.0;
    //soma todos os números na bag e armazena em sum
    for(double x : numbers){
      sum += x;
      //soma total dividida pelo total de numeros na bag = mean
       double mean = sum / N;
        for (double y : numbers){
            //numeros da bag - meio da lista * numero da bag - meio da lista += totalsoma
            sum += (y - mean) * (y - mean);
            //raiz quadrada de sum dividido por (N:total de elementos - 1)
            double std = Math.sqrt(sum/(N-1));

		
    StdOut.printf("Mean : %.2f\n", mean);
    StdOut.printf("Std dev : %.2f\n", std);
        }
	
    }
	
  }
}
