/*
*
if kullan
Kullanicidan bir sayi girmesini isteyen ve girilen sayinin tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.
*
* */

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value");

        int value = scanner.nextInt();
        if(value%2==0){
            System.out.println("It is even number. CIFT");
        }else {
            System.out.println("It is odd number. TEK");
        }
    }

}
