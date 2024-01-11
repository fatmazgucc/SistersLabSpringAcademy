/*
*
* Soru9:
Switch-case kullan
Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun. Ardindan,
*  secilen sekle gore gerekli bilgileri alarak alani hesaplayin. (1-Dikdortgen, 2-Kare, 3-Ucgen)
*
*
* */


import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Enter 1 for dikdortgen, 2 for kare, 3 for ucgen");
        Scanner scanner = new Scanner(System.in);
        int sekil = scanner.nextInt();

        if (sekil==1){
            System.out.println("Enter 2 value. 1 for x 1 for y");
            double val1 = scanner.nextDouble();
            double val2 = scanner.nextDouble();
            System.out.println("Alan for dikdortgen = "+ (val1*val2));
        }else if(sekil==2){
            System.out.println("Enter 1 value for kare kenarı");
            double val1 = scanner.nextDouble();
            System.out.println("Alan for kare = "+ (val1*val1));
        }else if (sekil==3){
            System.out.println("Enter 2 value. 1 for taban alanı. 1 for yukseklik");
            double val1 = scanner.nextDouble();
            double val2 = scanner.nextDouble();
            System.out.println("Alan for ucgen = "+ (val1*val2)/2);
        }else{
            System.out.println("You entered wrong value!");
        }
    }
}
