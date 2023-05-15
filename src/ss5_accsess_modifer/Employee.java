package ss5_accsess_modifer;

public class Employee {
    private String name;
    private String phoneNumber;
    private String position;
//   private thể hiện tính báo đóng. ngăn chặn truy cập bên ngoài (name,phone,position)
    static private String nameCompany;
    static {
        nameCompany = "MeuGau";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static String getNameCompany() {
        return nameCompany;
    }

    public static void setNameCompany(String nameCompany) {
        Employee.nameCompany = nameCompany;
    }
    //  static nameCompany là thuộc tính dùng chung cho các đối tượng
}
