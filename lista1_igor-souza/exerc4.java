import java.util.Scanner;

public class exerc4 
{
    public static void main(String[] args)
    {
        int num[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números inteiros e descubra o maior e menor: ");
            for(int i = 0;i<3;i++)
            {
                num[i] = sc.nextInt();
            }
                int maior = num[0];
                int menor = num[0];
                if(num[1]>num[0] && num[1]>num[2])
                {
                    maior = num[1];
                }
                if(num[2]>num[0] && num[2]>num[1])
                {
                    maior = num[2];
                    menor = num[0];
                }
                if(num[1]<num[2] && num[1]<num[0])
                {
                    menor = num[1];
                }
                if(num[2]<num[1] && num[2]<num[0])
                {
                    menor = num[2];
                }
            System.out.println("O maior número foi: " + maior);
            System.out.println("O menor número foi: " + menor);
            sc.close();
           }
}
