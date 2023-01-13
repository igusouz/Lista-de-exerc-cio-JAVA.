/* 9. Faça um programa que receba via teclado o tempo de duração de um evento em
uma fábrica em uma a variável do tipo inteira (int) expressa em segundos e mostre-o
expresso em horas, minutos e segundos. */
import java.util.Scanner;

public class exerc9 
{  
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o tempo de duração de um evento em segundos: ");
      int seg_dura = sc.nextInt();
      int hora = seg_dura/3600;
      int min = (seg_dura % 3600)/60;
      int seg = (seg_dura % 3600)%60;
    System.out.println("O tempo do evento foi de "+hora+":"+min+":"+seg);
    sc.close();
  } 
}
