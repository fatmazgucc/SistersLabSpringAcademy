/*
*
* Basit Hesap Makinesi
* Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde toplama, cikarma, carpma ve bolme islemlerini gerceklestiren bir Java programi yazin.
*
* */


import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        double value1 = scanner.nextDouble();

        System.out.println("Enter the second value");
        double value2 = scanner.nextDouble();

        System.out.println("Sum of values is "+ (value1+value2));
        System.out.println("Sub of values is "+ (value1-value2));
        System.out.println("Multiplication of values is "+ (value1*value2));

        if (value2 != 0.0) {
            System.out.println("value1/value2 is " + (value1/value2));
        }

    }


}
