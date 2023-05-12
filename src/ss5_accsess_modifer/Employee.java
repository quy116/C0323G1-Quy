package ss5_accsess_modifer;

public class Employee {
    private String name;
    private String phoneNumber;
    private String position;
//   private thể hiện tính báo đóng. ngăn chặn truy cập bên ngoài (name,phone,position)
    static String nameCompany;
    static {
        nameCompany = "MeuGau";
    }
//  static nameCompany là thuộc tính dùng chung cho các đối tượng
}
