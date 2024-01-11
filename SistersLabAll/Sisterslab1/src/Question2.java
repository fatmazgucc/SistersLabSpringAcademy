import java.util.Scanner;

/**
 *


 Soru2:
 Switch-case kullanmadan gerekiyorsa if kullan
 Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 , tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.

 *
 *
 */



public class Question2 {


    public static void main(String[] args) {
        System.out.println("Enter the price to be calculated! ");

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        if(value <= 0 ){
            System.out.println("You entere invalid value");
        }else if(value <1000 && value>0){

            double kdvTutarı =  (value*10)/100 ;

            double totalValue = value + kdvTutarı;

            System.out.println("Kdv tutarı is "+kdvTutarı);

            System.out.println("Total price + kdv : "+totalValue);

        }else {
            double kdvTutarı =  (value*22)/100 ;

            double totalValue = value + kdvTutarı;

            System.out.println("Kdv tutarı is "+kdvTutarı);

            System.out.println("Total price + kdv : "+totalValue);
        }
    }


}
