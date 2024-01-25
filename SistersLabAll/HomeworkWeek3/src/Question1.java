/*
* Soru: Ogrenci Notlari
*
Bir ogrenci not takip sistemi yazin.
* Her ogrencinin adini anahtar, notunu deger olarak iceren bir HashMap kullanarak,
*  kullaniciya ogrenci eklemesini ve bir ogrencinin notunu sorgulamasini saglayan bir program yapin.
*
* */


import java.util.HashMap;

public class Question1 {
    static HashMap<String, Double> studentMaps = new HashMap<>();

    public static void main(String[] args) {


        studentMaps.put("Fatma", Double.valueOf(80.0));
        studentMaps.put("Can", Double.valueOf(81.0));
        studentMaps.put("Melise", Double.valueOf(82.0));
        studentMaps.put("Asya", Double.valueOf(83.0));
        studentMaps.put("Hatice", Double.valueOf(100.0));
        studentMaps.put("Süeda", Double.valueOf(90.0));
        studentMaps.put("Mihriban", Double.valueOf(91.0));
        studentMaps.put("Başak", Double.valueOf(92.0));


        getNoteOfStudent("Fatma");
        addStudentToMap("Buse", 45);


    }

    public static Double getNoteOfStudent(String name){
        return studentMaps.get(name);
    }

    public static void addStudentToMap(String name, double note){
        studentMaps.put(name, Double.valueOf(note));
    }


}

