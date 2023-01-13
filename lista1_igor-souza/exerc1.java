/* 1. Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2
notas de um aluno. Calcule a média ponderada do aluno, sabendo que a nota A tem
peso 3.5 e a nota B tem peso 7.5. A soma dos pesos é 11. Assuma que cada nota
pode ir de O até 10.0, sempre com uma casa. */


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
