package BTLTHDT;
public class Test {
    public static void main(String[] args) {
        Sach sach1 = new Sach();
        sach1.setMaSach("s1");
        sach1.setTieuDe("BTLTHDT");
        sach1.setTacGia("Nguyen Nhuan Tri");
        sach1.setNamXuatBan(2025);
        sach1.setSoLuong(10);

        System.out.println("Ma sach la : " + sach1.getMaSach());
        System.out.println("Tieu de la : " + sach1.getTieuDe());
        System.out.println("Tac gia la : " + sach1.getTacGia());
        System.out.println("Nam xuat ban : " + sach1.getNamXuatBan());
        System.out.println("So luong : " + sach1.getSoLuong());
    }
}
 