package JavaBasic.Bien_New;

import org.w3c.dom.ls.LSOutput;

public class Thongtindegoibienstatic {
    public static void main(String[] args) {

        System.out.println("lấy tên biến từ class Bienstatic:"+ Bienstatic.ten);    //cách gọi của biến static, không
                                                                                    // cần khởi tạo, gọi TenClass.tenBien
        System.out.println("lấy tuổi biến từ class Bienstatic:"+ Bienstatic.age);
        System.out.println("lấy công ty biến từ class Bienstatic:"+ Bienstatic.company);


    }



}
