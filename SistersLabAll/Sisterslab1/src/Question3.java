/*
*
*
* Not Hesaplama
Kullanicidan bir ogrencinin sinav notunu girmesini isteyen ve bu notun harf notunu hesaplayarak ekrana yazdiran bir Java programi yazin.
* (Ornegin, 90-100 arasi AA, 80-89 arasi BA, 70-79 arasi BB, 60-69 arasi CB, 50-59 arasi CC, 0-50 arasi FF)

*
*
*
* */


import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double note = scanner.nextDouble();

        if(note < 0 || note>100){
            System.out.println("You entered invalid note");
        }else if(note >=0 && note <50){
            System.out.println("Your grade is FF");
        }else if(note>=50 && note<60){
            System.out.println("Your grade is CC");
        }else if(note>=60 && note<70){
            System.out.println("Your grade is CB");
        }else if(note>=70&& note<80){
            System.out.println("Your grade is BB");
        }else if(note >=80 &&note <90){
            System.out.println("Your grade is BA");
        }else if(note>=90 && note <=100){
            System.out.println("Your grade is AA");
        }
    }

}
