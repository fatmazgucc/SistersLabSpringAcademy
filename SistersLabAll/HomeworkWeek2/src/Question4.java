/*
*
*  Girilen sayıyı asal mı kontrol eden program
*
* */

public class Question4 {

    public static void main(String[] args) {

        int value = 41;

        boolean isAsal = true;

        for (int i = 2 ; i  <value/2; i++ ){

            if(value%i ==0){
                isAsal = false;
            }

        }

        System.out.println("ASAL DURUM : " + isAsal);

    }

}
