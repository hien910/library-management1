package entity;

import statics.ReaderType;

import java.util.Scanner;

public class Reader extends Person {
    protected static int AUTO_ID = 10000;
    protected int id;
    protected ReaderType readerType;

    public Reader() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }

    @Override
    public String toString() {
        return "entity.Reader{" +
                "id=" + id +
                ", readerType=" + readerType.value +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public  void inputInfo(){
//        System.out.print("Nhập tên: ");
//        this.setName(new Scanner(System.in).nextLine());
//        System.out.print("Nhập địa chỉ: ");
//        this.setAddress(new Scanner(System.in).nextLine());
//        System.out.print("Nhập số điện thoại: ");
//        this.setPhone(new Scanner(System.in).nextLine());
        super.inputInfo();
        System.out.println("Nhập loại bạn đọc, vui long chọn 1 trong 3 loại sau: ");
        System.out.println("1. SINH VIÊN");
        System.out.println("2. HỌC VIÊN CAO HỌC");
        System.out.println("3. GIÁO VIÊN");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setReaderType(ReaderType.STUDENT);
                break;
            case 2:
                this.setReaderType(ReaderType.POST_STUDENT);
                break;
            case 3:
                this.setReaderType(ReaderType.TEACHER);
                break;
        }

    }
}
