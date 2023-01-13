/* 3. Faça um programa que lê o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o total a receber no final
do mês, com duas casas decimais. */

import java.util.Scanner;

public class exerc3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário fixo do vendedor: ");
            double salario_fixo = sc.nextDouble();
        System.out.println("Digite o valor em R$ que o vendedor conseguiu fazer: ");
            double vendas = sc.nextDouble();
            double salario_final = salario_fixo + ((vendas * 15)/100);
        System.out.println("O salário final é de R$ " + salario_final);
        sc.close();
    }
}
