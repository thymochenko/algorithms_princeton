/*
tinyT.txt [23, 50, 10, 99, 18, 23, 98, 84, 11,
 10, 48, 77, 13, 54, 98, 77, 77, 68]

tinyW.txt [01 (23) (98) (84) (11) 02 03
 04 05 06 07 08 09 100 200 300 400]

 saida: 50 10 99 18 10 48 77 13 54 77 77 68

O algoritmo de busca binária compara o conteudo do arquivo tinyW com o tinyT
oara verificar quais são os números que não se repetem no arquivo tinyT.
somente os números não repetidos em tinyt serão exibidos, enquanto que os números
não repetidos de tinyW permanecem os mesmos.


*/

import java.util.Arrays;

public class BinarySearch {
	public static int rank(int key, int[] list){
		int count = 0;
		int hi = list.length - 1;
		while(count <= hi){
			int meioDaLista =  count + (hi - count) / 2;
			if (key < list[meioDaLista]) hi = meioDaLista - 1;
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
