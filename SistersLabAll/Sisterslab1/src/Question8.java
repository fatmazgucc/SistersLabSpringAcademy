/*
*
*
* Switch-case kullan
Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpa islemlerinden birisini sectigi bir hesap makinesi uygulamasi yapin

----------------------
*
* */


import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        System.out.println("Enter value 1");
        Scanner scanner = new Scanner(System.in);
        double val1 = scanner.nextDouble();
        System.out.println("Enter value 2");
        double val2= scanner.nextDouble();
        System.out.println("Enter 1 for addition, 2 for substraction, 3 for multiplication and 4 for over");
        int islem = scanner.nextInt();

        if (islem ==1){
            System.out.println("value1 + value 2 is : "+ (val1+val2));
        }     else   if (islem ==2){
            System.out.println("value1 - value 2 is : "+ (val1-val2));
        }     else   if (islem ==3){
            System.out.println("value1 * value 2 is : "+ (val1*val2));
        }     else    if (islem ==4 && val2 != 0.0){
            System.out.println("value1 / value 2 is : "+ (val1/val2));
        }else {
            System.out.println("You entered a wrong value");
        }
    }

}
