package ss5_accsess_modifer;

public class NhanVien {
    private String Name;
    private String PhoneNumber;
    private String position;
//    private ngăn chặn truy cập bên ngoài (name,phone,position)
    static String NameCompany;
    static {
        NameCompany = "MeuGau";
    }
//  static namecompany là thuộc tính dùng chung cho các đối tượng
}
