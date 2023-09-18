import entity.Reader;
import statics.ReaderType;

import java.util.Scanner;

public class Main {
    private static Reader[] readers = new Reader[100];
    private static Book[] books = new Book[1000];
    protected static BorrowBook[] borrowBooks = new BorrowBook[1000];



    public static void main(String[] args) {
        while (true){
            printMenu();
            int functionChoice = chooseFunction();
            switch (functionChoice){
                case 1:
                   inputReader();
                   break;
                case 2:
                    showReader();
                    break;
                case 3:
                    inputBook();
                    break;
                case 4:
                    showBook();
                    break;
                case 5:
                    borrowBooks[1].readerBorrw.setId(11111);
                    borrowBooks[1].readerBorrw.setName("hien");

                    System.out.println(borrowBooks[1]);
//                    for (int i = 0; i <borrowBooks.length ; i++) {
//                        if (borrowBooks[i]==null){
//                            borrowBooks[i].sachMuon(books,borrowBooks,readers);
//                            break;
//                        }
//                    }



                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    return;
            }
        }

    }


    private static void inputBorrowBook() {

    }


    private static void inputBook() {
        System.out.println("Có bao nhiêu sách mới: ");
        int bookNumber= new Scanner(System.in).nextInt();
        for (int i = 0; i < bookNumber; i++) {
            System.out.println("Nhập thông tin cho cuốn sách thứ "+(i+1));
            Book book = new Book();
            book.infoBook();
            saveBook(book);
        }
    }

    private static void saveBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if(books[i]==null){
                books[i]=book;
                break;
            }
        }
    }
    private static void showBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i]!=null) {
                System.out.println(books[i]);
            }
        }
    }


    private static void inputReader() {
        System.out.print("Có bao nhiêu bạn đọc mới: ");
        int readerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < readerNumber; i++) {
            System.out.println("Nhập thông tin cho bạn đọc thứ "+(i+1));
            Reader reader = new Reader();
            reader.inputInfo();
            saveReader(reader);
        }

    }

    private static void saveReader(Reader reader) {
        for (int j = 0; j < readers.length; j++) {
            if(readers[j]==null){
                readers[j]= reader;
                break;
            }
        }
    }
    private static void showReader() {
        for (int i = 0; i <readers.length; i++) {
            if (readers[i]!=null){
                System.out.println(readers[i]);
            }
        }
    }

    private static int chooseFunction() {
        System.out.println("Xin mời lựa chọn chức năng: ");
        int functionChoice;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice>=1 && functionChoice<=9){
                break;
            }
            System.out.println("Chức năng không hợp lệ, vui long chọn lại");
        }while (true);
        return functionChoice;
    }

    private static void printMenu() {
        System.out.println("------PHẦN MỀM QUẢN LÝ THƯ VIỆN------");
        System.out.println("1. Nhập bạn đọc mới");
        System.out.println("2. In thông tin bạn đọc");
        System.out.println("3. Nhập sách mới");
        System.out.println("4. In danh sách các cuốn sách");
        System.out.println("5. Lập bảng mượn sách");
        System.out.println("6. In danh sách mượn sách");
        System.out.println("7. Sắp xếp danh sách mượn sách");
        System.out.println("8. Tìm kiếm trong danh sách mượn sách");
        System.out.println("9. Thoát!");

    }

}
