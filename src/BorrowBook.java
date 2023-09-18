import entity.Reader;

import java.util.Scanner;

public class BorrowBook {
    protected Book bookBorrow;
    protected Reader readerBorrw;
    protected int quantityBorrow;


    public BorrowBook(Book bookBorrow, Reader readerBorrw, int quantityBorrow) {
        this.bookBorrow = bookBorrow;
        this.readerBorrw = readerBorrw;
        this.quantityBorrow = quantityBorrow;
    }

    @Override
    public String toString() {
        return "BorrowBook{" +
                "bookBorrow=" + bookBorrow +
                ", readerBorrw=" + readerBorrw +
                ", quantityBorrow=" + quantityBorrow +
                '}';
    }

    public Book getBookBorrow() {
        return bookBorrow;
    }

    public void setBookBorrow(Book bookBorrow) {
        this.bookBorrow = bookBorrow;
    }

    public Reader getReaderBorrw() {
        return readerBorrw;
    }

    public void setReaderBorrw(Reader readerBorrw) {
        this.readerBorrw = readerBorrw;
    }

    public int getQuantityBorrow() {
        return quantityBorrow;
    }

    public void setQuantityBorrow(int quantityBorrow) {
        this.quantityBorrow = quantityBorrow;
    }


    public BorrowBook() {
    }

//    public static void banDocMuon(Reader[] reader, BorrowBook[] borrowBook, Book[] book) {
////        System.out.print("Nhập số lượng bạn đọc muốn mượn sách:");
////        int numReader = new Scanner(System.in).nextInt();
////        for (int i = 1; i <= numReader; i++) {
//
//        for (int k = 10000; k < reader.length + 100; k++) {
//            System.out.print("Nhập mã bạn đọc muốn mượn sách: ");
//            int id = new Scanner(System.in).nextInt();
//            if (id == reader[k].getId()) {
////                    System.out.println(reader[j]);
////                    for (int k = 0; k < borrowBook.length; k++) {
////                        if (borrowBook[k]==null){
////                            borrowBook[k].setReader(reader[j]);
////                            break;
////                        }
////                    }
//                break;
//            }
//        }
////            System.out.println();
////        }
//
//    }

    public  void sachMuon(Book[] book, BorrowBook[] borrowBook, Reader[] reader) {
        System.out.print("Nhập mã bạn đọc muốn mượn sách: ");
        int idReader = new Scanner(System.in).nextInt();
        for (int k = 10000; k < reader.length + 100; k++) {

            if (idReader == reader[k].getId()) {
                break;
            }

            System.out.print("Nhập số đầu sách bạn đọc muốn mượn: ");
            int idBook;
            do {
                idBook = new Scanner(System.in).nextInt();
                if (idBook <= 5 && idBook > 0) {
                    break;
                }
                System.out.println("Quá giới hạn đầu sách cho mượn, vui lòng nhập lại:");
            } while (true);
            for (int i = 1; i <= idBook; i++) {
                System.out.println("Đầu sách thứ" + i + "bạn muốn mượn là: ");
                System.out.print("Nhập tên sách: ");
                int idSach = 0;
//            int idsach= new Scanner(System.in).nextInt();
                for (int m = 10000; m < book.length + 100; m++) {
                    do {
                        idSach = new Scanner(System.in).nextInt();
                        if (idSach == book[m].getIdBook()) {
//                        System.out.println("Sách bạn đọc mượn: "+book[j]);
                            break;
                        }
                    } while (true);
                }
                    System.out.print("Nhập số lượng sách để mượn:");
                    int numBook;
                    do {
                        numBook = new Scanner(System.in).nextInt();
                        if (numBook <= 3 && numBook > 0) {
                            break;
                        }
                        System.out.println("Quá giới hạn số lượng sách mỗi đầu sách cho mượn, vui lòng nhập lại:");
                    } while (true);

                    for (int j = 0; j < borrowBook.length; j++) {
                        if (borrowBook[j].readerBorrw == null) {
                            borrowBook[j].readerBorrw.setId(idReader);
                            borrowBook[j].readerBorrw.setName(reader[idReader].getName());
                            borrowBook[j].bookBorrow.setIdBook(idSach);
                            borrowBook[j].bookBorrow.setNameBook(book[idBook].getNameBook());
                            borrowBook[j].setQuantityBorrow(numBook);
                        }
                    }
                }



        }


    }

}
