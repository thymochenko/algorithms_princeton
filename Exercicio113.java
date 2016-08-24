public class Exercicio113{
	@Deprecated
  public static void main(String[] args){
    int count = 0;
    System.out.println("Informe três números!");
    int[] list = new int[3];
    boolean listNotEqual = false;
    String msg = "",msg2 ="";
    
    while(count <= 2){
        System.out.println("Numero : " + count);
        int myArgs = StdIn.readInt();
        list[count] = myArgs;
        if(list[count] == list[count]){
           msg = "lista contendo numeros iguais";
        }
        else{
          listNotEqual = true;
          msg2 = "lista contendo numeros diferentes";
        }
        count++;
   }

   if(listNotEqual){
     System.out.println(msg2);
   }
   else{
     System.out.println(msg);
   }
  }
}
