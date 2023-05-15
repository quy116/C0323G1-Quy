package ss7_abstract_class_interface;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        ArrayList<Book> bookArrayList = new ArrayList<>();
        NaturalBook naturalBook = new NaturalBook("tu tien", "china", "2021", "1000");
        SocialBook socialBook = new SocialBook("conan","japan","1994");
        NaturalBook naturalBook1 = new NaturalBook("tu tien1", "china", "2021", "1000");
        NaturalBook naturalBook2 = new NaturalBook("tu tien3", "china", "2021", "1000");
        Book[] arr = {naturalBook,naturalBook1,naturalBook2,socialBook};
//        bookArrayList.add(naturalBook2);
//        bookArrayList.add(naturalBook);
//        bookArrayList.add(naturalBook1);
//        bookArrayList.add(socialBook);
        for (Book e: arr) {
            System.out.println(e.toString());
        }
    }
}
