package ss9_danh_sach.validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Regex {
    public static final String REGEXNAME = "^[a-zA-Z ]+$";
    public static final String REGEXDAY = "^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$";
    public static boolean regexName (String name){
        return name.matches(REGEXNAME) ? true : false;
    }
    public static boolean regexxDay(String date) {
        return date.matches(REGEXDAY) ? true : false;
    }


}
