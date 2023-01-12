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
