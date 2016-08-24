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
