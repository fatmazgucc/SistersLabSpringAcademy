/*
*
*
*
Soru7:
Switch-case kullan

Kullaniciya bir hava durumu kodu girmesini isteyin. Girdigi koda gore hava durumunu ekrana yazdirin.
*
*
* */


import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        System.out.println("Enter the code!");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();

        switch (code){
            case "CL":
                System.out.println("CLOUDY");
                break;
            case "SN":
                System.out.println("SUNNY");
                break;
            default:
                System.out.println("RAINY");
        }
    }

}
