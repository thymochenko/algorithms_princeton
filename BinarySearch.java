/*
tinyW.txt [ (01) [23] [98] [84] [11] (02 03 04 05 06 07 08 09)]

tinyT.txt [23 50 10 99 18 {23 98 84 11} 10 48 77 13 54 98 77 77 68]

 java BinarySearch tinyW.txt < tinyT.txt
 //efetua busca dos números de tinyT com os de tinyW
 saida: 50 10 99 18 10 48 77 13 54 77 77 68

O algoritmo de busca binária compara o conteudo do arquivo tinyW com o tinyT
Todo o conteúdo do arquivo tinyT é analisado primeiro, e cada elemento
é verificado da seguinte forma: Se existe um número que se repete no tinyt (23)
e no tinyW, só iremos exibir os números que não se repetem em tinyT.
a comparação de valores repetidos é no sentido de TinyT -> compareTo -< tinyW

somente os números não repetidos em tinyt serão exibidos, enquanto que os números
não repetidos de tinyW permanecem os mesmos.

*/
import java.util.Arrays;

public class BinarySearch {
	public static int rank(int key, int[] list){
		int count = 0;
		//pega o tamanho da lista e subtrai 1
		int hi = list.length - 1;
		//enquanto total de elementos é menor que contador
		while(count <= hi){
			//cont + total da lista menos contador dividido por dois = meio da lista
			int meioDaLista =  count + (hi - count) / 2;
			//se a chave é menor que o elemento que esta no meio da lista
			//subtrai a posição de meio da lista por 1 e atribui ao valor total
			//de elementos da lista
			if(key < list[meioDaLista]) hi = meioDaLista - 1;
			//se não (se key for maior que meio da lista)
			//soma 1 ao meio da lista e atribui ao contador
			else if (key > list[meioDaLista]) count = meioDaLista + 1;
			else return meioDaLista;
 		}
		return -1;
	}

	@Deprecated
	public static void main(String[] args){
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(! StdIn.isEmpty()){
			int key = StdIn.readInt();
			if(rank(key, whitelist) == -1){
				StdOut.println(key);
			}
		}
	}
}
