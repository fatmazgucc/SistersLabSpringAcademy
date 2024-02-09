package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library implements LibraryInterface {

    static Map<Integer,Book> books= new HashMap<>();

    public Library(){
        initializeLib();
    }

    @Override
    public void takeTheBook(int id){

            if(books.containsKey(id)){
        Book a = books.get(id);
        if(a.totalCountOfBookInTheLibrary <=0){
            System.out.println("Sorry, all the books have taken already!");
        }else{
            a.totalCountOfBookInTheLibrary = a.totalCountOfBookInTheLibrary-1;
            books.put(id,a);
            System.out.println("Congratulations!!! Enjoy your reading!");
        }
    }else {
        System.out.println("Sorry, we dont have the book you requested!");
    }
            }

    @Override
    public void giveBackTheBook(int id) {
        if(books.containsKey(id)){
            Book a = books.get(id);

                a.totalCountOfBookInTheLibrary = a.totalCountOfBookInTheLibrary+1;
                books.put(id,a);
                System.out.println("Thank you for bring back the book!");

        }else {
            System.out.println("Sorry, we dont have the book you requested!");
        }
    }

    @Override
    public void initializeLib() {
        books.put(1,new Book(1, "Gormek", "Jose Saramago", 350,5));

        books.put(2,new Book(2, "Ölüyordum, Geçerken Uğradım", "Can Gürses", 450,2));
        books.put(3,new Book(3, "Kabul Beauty School", "Deborah Rodriguez", 250,5));
        books.put(4,new Book(4, "Nutuk", "Mustafa Kemal Ataturk", 550,4));


    }
}
