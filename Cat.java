/*
*
O  programa Cat mostrado à esquerda é uma amostra
de teste. cliente de In and Out que usa vários fluxos de entrada
para concatenar vários arquivos de entrada em uma única saída
e colocar em outro arquivo(out.txt). As classes de Entrada e de Saída também contêm estática
Isto évmétodos para leitura de arquivos contendo valores que são
um minúsculo tudo int, duplos ou tipos String em uma matriz (ver
teste.
*
*/
public class Cat{
  @Deprecated
  public static void main(String[] args) {
    //pega todos os arquivos passados como parametro, menos o último
    Out out = new Out(args[args.length-1]);
    //percorre todos menos o último
    for(int i = 0; i < args.length -1; i++){
      In in = new In(args[i]);
      //lê todo o conteudo
      String s = in.readAll();
      //joga as strings contidas no arquivo na sauda (out.txt)
      out.println(s);
      in.close();
    }
    out.close();
  }
}
