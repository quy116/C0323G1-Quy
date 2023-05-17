package ss7_abstract_class_interface;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        ArrayList<Book> bookArrayList = new ArrayList<>();
        Book naturalBook = new NaturalBook("tu tien", "china", "2021", "1000");
        Book socialBook = new SocialBook("conan", "japan", "1994");
        Book naturalBook1 = new NaturalBook("tu tien1", "china", "2021", "1000");
        Book naturalBook2 = new NaturalBook("tu tien3", "china", "2021", "1000");
        Book[] arr = {naturalBook, naturalBook1, naturalBook2, socialBook};
//        bookArrayList.add(naturalBook2);
//        bookArrayList.add(naturalBook);
//        bookArrayList.add(naturalBook1);
//        bookArrayList.add(socialBook);
        for (Book e : arr) {
            e.display();
        }
    }
}
