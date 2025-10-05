public class Text {
    public static void main(String[] args) {
        Sach SachNo1= new Sach();
        SachNo1.setMasach("N1");
        SachNo1.setTieuDe("Đắc nhân tâm");
        SachNo1.setTacgia("Dale Carnegia");
        SachNo1.setNamXuatBan(1936);
        SachNo1.setSoluong(1000);
        SachNo1.HienThiThongTin();
        Sach SachNo2= new Sach("N2","Lập trình cơ bản","Không biết",2000,1000);
        SachNo2.HienThiThongTin();
    }
    
}
