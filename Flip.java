public class Flip {
  public static Counter max(Counter x, Counter y){
    if(x.tally() > y.tally()){
      return x;
    }
    else{
      return y;
    }
  }

  public static void main(String[] args) {
    //argumento passado via termina (int)
    int T = Integer.parseInt(args[0]);
    //cria dois objetos "Counter"
    Counter heads = new Counter("heads");
    Counter tails = new Counter("tails");
    //Itera sobre T
    for(int t = 0; t < T; t++)
      //retorna um número aleatório
      if(StdRandom.bernoulli(0.5))
        //incrementa o primeiro objeto
        heads.increment();
        //incrementa  o segundo
        else tails.increment();
    StdOut.println(heads);
    StdOut.println(tails);
    //subtrai a contagem total de instâncias por objeto
    int d = heads.tally() - tails.tally();
    //retorna o número absoluto de d
    StdOut.println("delta : " + Math.abs(d));

    if(heads.tally() == tails.tally()){
      StdOut.println("Tie");
    } else{
      StdOut.println(max(heads,tails) + " wins ");
    }
  }
}
