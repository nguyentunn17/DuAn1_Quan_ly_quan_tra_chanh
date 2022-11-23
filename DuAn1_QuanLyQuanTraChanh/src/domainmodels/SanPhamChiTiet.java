package domainmodels;

public class SanPhamChiTiet {
//    Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
//	IdKT UNIQUEIDENTIFIER ,
//	IdSP UNIQUEIDENTIFIER,
//	IdTL UNIQUEIDENTIFIER,
//	IdKM UNIQUEIDENTIFIER,
//	DonGiaBan DECIMAL(20,0) DEFAULT 0 ,
//	DonGiaNhap DECIMAL(20,0) DEFAULT 0,
//	DonViTinh NVARCHAR(20),
//	MoTa NVARCHAR(50) DEFAULT NULL,
//	Anh NVARCHAR(50) DEFAULT NULL,
//	TrangThai INT DEFAULT 0,
    private String id;   
    private String IdKT;
    private String IdSP;
    private String IdTL;
    private String IdKM;
    private Double donGiaBan;
    private Double donGiaNhap;
    private String donViTinh;
    private String moTa;
    private String anh;
    private int trangThai;

    public SanPhamChiTiet(String id, String IdKT, String IdSP, String IdTL, String IdKM, Double donGiaBan, Double donGiaNhap, String donViTinh, String moTa, String anh, int trangThai) {
        this.id = id;
        this.IdKT = IdKT;
        this.IdSP = IdSP;
        this.IdTL = IdTL;
        this.IdKM = IdKM;
        this.donGiaBan = donGiaBan;
        this.donGiaNhap = donGiaNhap;
        this.donViTinh = donViTinh;
        this.moTa = moTa;
        this.anh = anh;
        this.trangThai = trangThai;
    }

    public SanPhamChiTiet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdKT() {
        return IdKT;
    }

    public void setIdKT(String IdKT) {
        this.IdKT = IdKT;
    }

    public String getIdSP() {
        return IdSP;
    }

    public void setIdSP(String IdSP) {
        this.IdSP = IdSP;
    }

    public String getIdTL() {
        return IdTL;
    }

    public void setIdTL(String IdTL) {
        this.IdTL = IdTL;
    }

    public String getIdKM() {
        return IdKM;
    }

    public void setIdKM(String IdKM) {
        this.IdKM = IdKM;
    }

    public Double getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(Double donGiaBan) {
        this.donGiaBan = donGiaBan;
    }

    public Double getDonGiaNhap() {
        return donGiaNhap;
    }

    public void setDonGiaNhap(Double donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
