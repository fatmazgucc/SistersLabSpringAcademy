/*
*
* - Palindrom kontrolü yapan metod:
*
* */


public class Question2 {

    public static void main(String[] args) {

        int number =5005;

        String valStr = number+"";
        int length = valStr.length();
        String [] valArray = valStr.split("");
        boolean isPalindrom = true;
        int counter = 0;
        for (int i =length-1; i >=length/2 ;i--){
            if (!valArray[i].equals(valArray[counter]) ){
                isPalindrom=false;
                break;
            }
        counter++;

        }

        System.out.println("Palindrom status : "+isPalindrom);


    }

}
