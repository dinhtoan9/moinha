package JavaBasic.Bien_New;

public class Bientoancuc {
    String name = "Dinh";
    int age = 24;
    String adress = "Nam Định";

    public void getInfor() {    //phương thức
        System.out.println("lấy biến name xuống:" + name);
        System.out.println("lấy biến age xuống:" + age);
        System.out.println("lấy biến adress xuống:" + adress);

    }

    public static void main(String[] args) {
        Bientoancuc bienmoidat = new Bientoancuc();     //cách để gọi biến toàn cục xuống hàm main có static (khởi tạo đối tuowjng class)
        System.out.println("biến mới nhes:" + bienmoidat.name);

    }
}
