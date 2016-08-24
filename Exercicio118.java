public class Exercicio118 {
  public static void main(String[] args) {
     int cordenadas[][] = new int[10][10];
     int distancias[][] = new int[10][10];
     int percurso[][] = new int[5][5];

     for(int i =0; i < cordenadas.length; i++){
       for(int j = 0; j < distancias.length; j++){
            cordenadas[i][j] = (int) Math.random() * 101;
            distancias[i][j] = ((cordenadas[i][j] * 120) / 2) - 3;
              percurso[i][j] = distancias[i][j] * 2;
             StdOut.println(percurso[i][j]);
       }

     }
  }
}
