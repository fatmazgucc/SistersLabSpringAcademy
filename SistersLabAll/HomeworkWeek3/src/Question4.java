/*
*
*
Soru: Satis Takibi

Bir sirketin satislarini takip eden bir program yazin.
* Her musterinin adini anahtar, satis miktarini deger olarak iceren bir HashMap kullanin. T
* Toplam satis miktarini hesaplayarak en cok satis yapan musteriyi bulan bir program yazin.
*
*
* */


import java.util.HashMap;

public class Question4 {
    double max = 1;
    String nameOfMaxCustomer="";

    static HashMap<String, Double> customers = new HashMap<>();

    public static void main(String[] args) {
        customers.put("Fatma", Double.valueOf(80.0));
        customers.put("Can", Double.valueOf(81.0));
        customers.put("Melise", Double.valueOf(82.0));
        customers.put("Asya", Double.valueOf(83.0));
        customers.put("Hatice", Double.valueOf(100.0));
        customers.put("Süeda", Double.valueOf(90.0));
        customers.put("Mihriban", Double.valueOf(91.0));
        customers.put("Başak", Double.valueOf(92.0));
        new Question4();
    }
    public Question4(){
  printCustomerWithHighestValue();
    }


    public void printCustomerWithHighestValue(){
        customers.forEach((customer,val)->{
            if(val> max){
                max = val;
                nameOfMaxCustomer = customer;
            }
        });

        System.out.println("The customer with highest sale is : "+nameOfMaxCustomer+" with sale : "+max);
    }
}
