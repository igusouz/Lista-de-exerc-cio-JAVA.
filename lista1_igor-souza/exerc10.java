import java.util.Scanner;

class Main 
{  
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite, em dias, a idade de uma pessoa: ");
      int dias_i = sc.nextInt();
      int ano = dias_i/365;
      int mes = (dias_i%365)/30;
      int dias = ((dias_i%365)%30);
    System.out.println(ano + " ano(s)");
    System.out.println(mes + " mês(es)");
    System.out.println(dias + " dia(s)");
    sc.close();
  } 
}