/*
* 1- Fibonacci sayılarını özyinelemeli (recursive) olarak bulan program
*
* */


public class Question1 {
    public static void main(String[] args) {
        int valueToFindFibonacciTill = 45;
        int fibonacci = 1;
        int fibonacciNext=1;
        System.out.print("Fibonaccis are : 1  1  ");
        while (fibonacci < valueToFindFibonacciTill && fibonacciNext <valueToFindFibonacciTill){


            if(fibonacci < fibonacciNext){
                fibonacci = fibonacci+ fibonacciNext;
                System.out.print("  "+fibonacci);



            }else{
                fibonacciNext = fibonacciNext+fibonacci;
                System.out.print("  "+fibonacciNext);


            }



        }

    }

}
