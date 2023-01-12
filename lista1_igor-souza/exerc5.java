import java.util.Scanner;

public class exerc5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números inteiros");
            int num[] = new int[3];
            for(int i = 0;i<3;i++)
            {
                num[i] = sc.nextInt();
            }
        sc.close();
    }
}
