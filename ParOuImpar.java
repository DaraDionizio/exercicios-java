import java.util.Scanner;

public class ParOuImpar {
     public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in); //informando que irei utlilzar o Scanner
      System.out.print("Digite um numero para saber se é par ou impar: ");

      int numeroTeste = myObj.nextInt();
      if (numeroTeste % 2 == 0) {
         System.out.println("O número concedido é par");
      } else {
         System.out.println("O número concedido é impar");
      }

      myObj.close(); // fechando para poupar recursos de processamento após o uso kkkkk
   }
}


