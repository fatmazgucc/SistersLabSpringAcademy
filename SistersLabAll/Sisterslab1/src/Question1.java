
/*Soru1:
        Switch-case kullanmadan gerekiyorsa if kullan

        kullanicidan alinan para degerinin KDV'li fiyatini ve KDV tutarini hesaplayip ekrana bastiran programi yazin.

        KDV tutarini 30%

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 13;

        KDV tutari = 3;*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the price to be calculated! ");

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        if(value <= 0 ){
            System.out.println("You entere invalid value");
        }else{

            double kdvTutarı =  (value*30)/100 ;

            double totalValue = value + kdvTutarı;

            System.out.println("Kdv tutarı is "+kdvTutarı);

            System.out.println("Total price + kdv : "+totalValue);

        }
    }
}
