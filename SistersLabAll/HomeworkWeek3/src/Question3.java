/*
*
* Soru: Oyuncu Puanlari

Bir oyuncu puan sistemini simule eden bir program yazin.
* Oyuncularin isimlerini anahtar, puanlarini deger olarak kullanarak bir HashMap icinde saklayin.
*  Oyunculara puan eklemek ve puanlarini goruntulemek gibi islemleri gerceklestiren bir program yazin.
*
*
* */


import java.util.HashMap;





    public class Question3 {
        static HashMap<String, Double> gamers = new HashMap<>();

        public static void main(String[] args) {


            gamers.put("Fatma", Double.valueOf(80.0));
            gamers.put("Can", Double.valueOf(81.0));
            gamers.put("Melise", Double.valueOf(82.0));
            gamers.put("Asya", Double.valueOf(83.0));
            gamers.put("Hatice", Double.valueOf(100.0));
            gamers.put("Süeda", Double.valueOf(90.0));
            gamers.put("Mihriban", Double.valueOf(91.0));
            gamers.put("Başak", Double.valueOf(92.0));


            getNoteOfGamer("Fatma");
            addGamerToMap("Buse", 45);
            addPointToGamer("Fatma", 5.0);


        }

        public static Double getNoteOfGamer(String name){
            return gamers.get(name);
        }

        public static void addGamerToMap(String name, double point){
            gamers.put(name, Double.valueOf(point));
        }


        public static void addPointToGamer(String name, double point){
            gamers.put( name,gamers.get(name)+point);
                }
    }




