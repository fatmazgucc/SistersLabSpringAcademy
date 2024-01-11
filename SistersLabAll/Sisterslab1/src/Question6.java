/*
*
* if kullan
Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.
*
*
*
* */

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        System.out.println("Enter 3 values to be sorted!");

        Scanner scanner = new Scanner(System.in);

        double val1 = scanner.nextDouble();
        double val2 = scanner.nextDouble();
        double val3 = scanner.nextDouble();

        if(val1 >val2){
            if(val2>val3){
                System.out.println("First value > Second value > Third value");
            }else if(val3>val1){
                System.out.println("Third value > First value > Second value");

            }else{
                System.out.println("First value > Third value > Second value");
            }
        }else if(val2 > val1){
            if (val1> val3){
                System.out.println("Second value > First value > Third value");

            }else if(val3 > val2){
                System.out.println("Third value > Second value > First value");

            }else{
                System.out.println("Second value> Third value > First value");
            }
        }


    }

}
