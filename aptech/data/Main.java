package aptech.data;

import aptech.data.impl.Book;
import aptech.data.manager.DocumentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Book books = new Book();
//        books.input();
//        books.show();

        int choine;
        DocumentManager dm = new DocumentManager();

        do {
            System.out.println("1. Add new document");
            System.out.println("2. Display all document");
            System.out.println("3. search books author name");
            System.out.println("4. exit");

            System.out.print("Nhập vào lựa chọn: ");
            choine = sc.nextInt();

            switch (choine) {
                case 1:
                    dm.addDocument();
                    break;
                case 2:
                    dm.displayAllDocument();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("search author name: ");
                    String authorName = sc.nextLine();
                    dm.searchByAuthorName(authorName);
                    break;
                case 4:
                    System.out.println("exit app");
                    break;
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }

        } while (choine != 4);
    }
}
