package ss17_string_regex;

import java.util.Scanner;

public class Validate {
    private static final String VALIDATE_REGEX_EMAIL = "^[A-Za-z0-9][A-Za-z0-9]{0,32}@[A-Za-z0-9]{2,12}(\\.[A-Za-z0-9]{2,12})$";


    public static boolean checkRegexEmail(String email) {
        return email.matches(VALIDATE_REGEX_EMAIL) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputEmail;
        do {
            System.out.println("nhap dia chi gmail vao \n");
             inputEmail = sc.nextLine();
        }while (!checkRegexEmail(inputEmail));
        System.out.println("nhap thanh cong");
    }
}
