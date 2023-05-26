import java.util.Scanner;
public class cabe{
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args []){
        int num1;
        int num2;
        int soma;
        System.out.print("digite o primeiro numero:");
        num1= leia.nextInt();
        System.out.print("digite o segundo numero:");
        num2= leia.nextInt();
        soma= leia.nextInt();
        soma= num1+num2;
        System.out.print("a soma é:"+soma);
    }
}