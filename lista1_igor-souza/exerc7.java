import java.util.Scanner;

public class exerc7
{  
  public static void main(String args[]) 
  { 
    int cem, cinquenta, vinte, dez, cinco, dois;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int valor = sc.nextInt();
      int troco = valor;
      cem = troco/100;
      troco = troco-(cem *100);
      cinquenta = troco/50;
      troco = troco-(cinquenta*50);
      vinte = troco/20;
      troco = troco-(vinte*20);
      dez = troco/10;
      troco = troco-(dez*10);
      cinco = troco/5;
      troco = troco-(cinco*5);
      dois = troco/2;
      troco = troco-(dois*2);
    System.out.println("R$ " + valor);
    System.out.println("Nota(s) de R$ 100,00 -> " + cem);
    System.out.println("Nota(s) de R$ 50,00 -> " + cinquenta);
    System.out.println("Nota(s) de R$ 20,00 -> " + vinte);
    System.out.println("Nota(s) de R$ 10,00 -> " + dez);
    System.out.println("Nota(s) de R$ 5,00 -> " + cinco);
    System.out.println("Nota(s) de R$ 2,00 -> " + dois);
    System.out.println("Nota(s) de R$ 1,00 -> " + troco);
    sc.close();
  } 
}