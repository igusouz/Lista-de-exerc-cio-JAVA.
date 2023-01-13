/* 10. Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias. */

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
