/*
*
* Soru: Cift Sayilari Filtreleme
*
* Bir ArrayList icinde rastgele sayilari saklayin.
* Cift sayilari bir HashSet icine ekleyip, tek sayilari bir ArrayList icine ekleyen bir program yazin.
*
* */


import java.util.ArrayList;
import java.util.List;

public class Question2 {

    List<Integer> values = new ArrayList<Integer>();
    List<Integer> evenValues = new ArrayList<Integer>();

    public static void main(String[] args) {

        new Question2();

    }

    public Question2(){

        addRandomValues();
        printEvenValues();

    }


    public void addRandomValues(){
        for (int i = 0; i<30;i++){
            int nu = (int) (Math.random()* 200);
           // System.out.println(nu);
            values.add(nu);
        }
    }

    public void printEvenValues(){
        for (int i = 0; i< values.size(); i++){
            if (values.get(i)%2 ==0){
                evenValues.add(values.get(i));
                System.out.println(values.get(i));
            }
        }
    }

}
