import java.util.Scanner;

public class Book {
    protected int idBook;
    protected static int ID_AUTO_BOOK = 10000;
    protected String nameBook;
    protected String authorBook;
    protected SpecializedBook specializedBook;
    protected int publishingYear ;
    protected int quantity;

    public Book(){
        this.idBook= ID_AUTO_BOOK;
        ID_AUTO_BOOK++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", specializedBook=" + specializedBook +
                ", publishingYear=" + publishingYear +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public static int getIdAutoBook() {
        return ID_AUTO_BOOK;
    }

    public static void setIdAutoBook(int idAutoBook) {
        ID_AUTO_BOOK = idAutoBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getNameBook(String nameBook) {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public SpecializedBook getSpecializedBook() {
        return specializedBook;
    }

    public void setSpecializedBook(SpecializedBook specializedBook) {
        this.specializedBook = specializedBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void infoBook(){
        System.out.print("Nhập tên sách: ");
        this.setNameBook(new Scanner(System.in).nextLine());
        System.out.print("Nhập tên tác giả: ");
        this.setAuthorBook(new Scanner(System.in).nextLine());
        System.out.print("Nhập năm xuất bản: ");
        this.setPublishingYear(new Scanner(System.in).nextInt());
        System.out.println("Nhập chuyên ngành sách, chọn 1 trong 3 loại sau:");
        System.out.println("1. KHOA HỌC TỰ NHIÊN");
        System.out.println("2. VĂN HỌC - NGHỆ THUẬT");
        System.out.println("3. ĐIỆN TỬ VIỄN THÔNG");
        System.out.println("4. CÔNG NGHỆ THÔNG TIN");
        int typeBook = new Scanner(System.in).nextInt();
        switch (typeBook){
            case 1:
                this.setSpecializedBook(SpecializedBook.KHOA_HOC_TU_NHIEN);
                break;
            case 2:
                this.setSpecializedBook(SpecializedBook.VAN_HOC_NGHE_THUAT);
                break;
            case 3:
                this.setSpecializedBook(SpecializedBook.DIEN_TU_VIEN_THONG);
                break;
            case 4:
                this.setSpecializedBook(SpecializedBook.CONG_NGHE_THONG_TIN);
                break;
        }

    }
}
