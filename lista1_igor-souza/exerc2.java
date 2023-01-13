/* 2. Escreva um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário. A
seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

import java.util.Scanner;

public class exerc2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de identificação do funcionário: ");
            int num_funcionario = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas pelo funcionário: ");
            int horas = sc.nextInt();
        System.out.println("Digite o valor ganho por hora pelo funcionário: ");    
            double valor_hora = sc.nextDouble();    
            double salario = valor_hora * horas;
        System.out.println("O funcionário número " + num_funcionario + " possui um salário de R$ " + salario);
        sc.close();
    }
}
