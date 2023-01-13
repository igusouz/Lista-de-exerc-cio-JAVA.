/* 8. Elabore um programa que permita calcular o Imposto de Renda (IR) de um casal
a partir das rendas do Homem (RH) e da Mulher (RM). O imposto é calculado sobre
a renda conjunta (RC=RH+RM) de acordo com a tabela abaixo: */

import java.util.Scanner;

public class exerc8 
{  
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite, em R$, a renda do homem: ");
      double rh = sc.nextDouble();
    System.out.println("Digite, em R$, a renda da mulher: ");
      double rm = sc.nextDouble();
      double rc = rh+rm;
      double ir = 0;
      double sl = rc - ir;  
        if(rc <= 900)
        {
          System.out.println("Renda conjunta em R$ " + rc);
          System.out.println("Alíquota: ISENTA");
          System.out.println("Valor do imposto de renda: R$ " + ir);
          System.out.println("Salário liquído: R$ " + sl);
        }
        else if( 900 < rc && rc <= 1500)
        {
          ir = (rc*10)/100;
          sl = rc - ir;
          System.out.println("Renda conjunta em R$ " + rc);
          System.out.println("Alíquota: 10%");
          System.out.println("Valor do imposto de renda: R$ " + ir);
          System.out.println("Salário liquído: R$ " + sl);
        }
    else if( 1500 < rc && rc <= 2500)
        {
          ir = (rc*15)/100;
          sl = rc - ir;
          System.out.println("Renda conjunta em R$ " + rc);
          System.out.println("Alíquota: 15%");
          System.out.println("Valor do imposto de renda: R$ " + ir);
          System.out.println("Salário liquído: R$ " + sl);
        }
    else
        {
          ir = (rc*25)/100;
          sl = rc - ir;
          System.out.println("Renda conjunta em R$ " + rc);
          System.out.println("Alíquota: 25%");
          System.out.println("Valor do imposto de renda: R$ " + ir);
          System.out.println("Salário liquído: R$ " + sl);
        }
    sc.close();      
  } 
}
