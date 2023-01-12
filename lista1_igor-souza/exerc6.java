import java.util.Scanner;

public class exerc6
{  
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de quilômetros percorridos: ");
    int km = sc.nextInt();
    System.out.println("Digite a quantidade de litros de gasolina gastos: ");
    double l = sc.nextDouble();
    double consumo_medio = km/l;
    System.out.println("O consumo médio foi de " + consumo_medio + " km/l");
    sc.close();
  } 
}