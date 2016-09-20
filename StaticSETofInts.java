import java.util.Arrays;

public class StaticSETofInts {
  private int[] a;

  public StaticSETofInts(int keys[]){
    a = new int[keys.length];
    for (int i =0;i < keys.length; i++ ) {
      a[i] = keys[i];
      Arrays.sort(a);
    }
  }

  public boolean contains(int key){
    return rank(key) != -1;
  }

  private int rank(int key){
    int lo = 0;
    int hi = a.length - 1;
    while(lo <= hi){
      //obtem-se o meio da lista
      int mid = lo + (hi - lo) /2;
      //se a chave é menor que o meio da lista:
      //subtrai o meio da lista menos
      // 1 e atribui ao valor do tamanho total do array
      if (key < a[mid]) hi = mid - 1;
      //se a chave for maior
      //soma o meio com 1 e atribui ao contador
      else if (key < a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }
}
