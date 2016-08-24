import java.util.Arrays;

public class Historogram {
   public  static int[] history(int[] parans, int m){
     int[] hist = new int[3];
     int[] transport = new int[3];
     int c =  0;
     for(int i =0; i < parans.length; i++){
       if(parans[i] == m){
         transport[c] = parans[i];
         hist[c] = transport[c];
         c++;
       }
     }

     for(int h :hist){
       System.out.println("Lista organizada : " + h);
     }
     return hist;
   }

   public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7,3, 5, 5};
    int[] mresult = history(array,5);
    String result = Arrays.toString(mresult);
    System.out.println(result);
   }
}
