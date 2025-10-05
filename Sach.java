public class Sach{
    private String Masach;
    private String TieuDe;
    private String Tacgia;
    private int NamXuatBan;
    private int Soluong;
    public Sach()
    {
        Masach="";
        TieuDe="";
        Tacgia="";
        NamXuatBan=0;
        Soluong=0;
    }
    public Sach(String Masach, String TieuDe, String Tacgia, int NamXuatBan, int Soluong)
    {
        this.Masach= Masach ;
        this.TieuDe= TieuDe;
        this.Tacgia= Tacgia;
        this.NamXuatBan= NamXuatBan;
        this.Soluong= Soluong;
    }
    public void HienThiThongTin()
    {
        System.out.println("--------------------");
        System.out.println("Mã sách: "+Masach);
        System.out.println("Tiêu đề: "+TieuDe);
        System.out.println("Tác giả: "+Tacgia);
        System.out.println("năm Xuất bản: "+NamXuatBan);
        System.out.println("Số lượng"+Soluong);
        System.out.println("--------------------\n");
    }
    public String getMasach() {
        return Masach;
    }
    public String getTieuDe() {
        return TieuDe;
    }
    public String getTacgia() {
        return Tacgia;
    }
    public int getNamXuatBan() {
        return NamXuatBan;
    }
    public int getSoluong() {
        return Soluong;
    }
    public void setMasach(String masach) {
        this.Masach = masach;
    }
    public void setTieuDe(String tieuDe) {
        this.TieuDe = tieuDe;
    }
    public void setTacgia(String tacgia) {
        this.Tacgia = tacgia;
    }
    public void setNamXuatBan(int namXuatBan) {
        this.NamXuatBan = namXuatBan;
    }
    public void setSoluong(int soluong) {
        this.Soluong = soluong;
    }
}
