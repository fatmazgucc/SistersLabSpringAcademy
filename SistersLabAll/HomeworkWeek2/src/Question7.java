/*
*
* Armstrong sayı mı kontrol eden program
*
* */

public class Question7 {


    public static void main(String[] args) {
        int armstorg = 510;




        String [] vals = (armstorg+"").split("");

        int length = vals.length;
        int total = 0;
        for (int i =0; i< length; i ++){

            total = total+ (int) Math.pow(Integer.parseInt(vals[i]) , length);



        }

        if(total == armstorg){
            System.out.println("THE VALUE "+armstorg + " IS A ARMSTRONG NUMBER");
        }else{
            System.out.println("THE VALUE "+armstorg + " IS NOT A ARMSTRONG NUMBER");
        }
    }

}
