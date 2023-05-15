package ss8_clean_code;

public class CleanCode {
    public int sum(int inputNumber1, int inputNumber2, int inputNumber3) {
        return inputNumber1 + inputNumber2 + inputNumber3;
    }

    EmloyeeDetails emloyeeDetails = new EmloyeeDetails();
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}
