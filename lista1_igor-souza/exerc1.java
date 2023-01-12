import java.util.Scanner;

public class exerc1 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a N1 do aluno: ");
        double na = sc.nextDouble();
      System.out.println("Agora, digite a N2 do aluno: ");
        double nb= sc.nextDouble();
        double media = (na+nb)/2 ;
      System.out.println("A media registrada foi: " + media);
      sc.close();
    }
}