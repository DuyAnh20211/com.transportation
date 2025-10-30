package aptech.data.manager;

import aptech.data.impl.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManager {
    private List<Book> book;

    public DocumentManager() {
        book = new ArrayList<>();
    }

    public DocumentManager(List<Book> book) {
        this.book = book;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public void addDocument() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập book " + (i + 1));
            Book books = new Book();
            books.input();
            book.add(books);
        }
    }

    public void displayAllDocument() {
        System.out.println("-----Danh sách book-----");
        for (Book bk : book) {
            System.out.println(bk.toString());
        }
    }

    public void searchByAuthorName(String authorName) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getAuthorName().equals(authorName)) {
                System.out.println(book.get(i).toString());
            } else {
                System.out.println("Ko có " + authorName + " này trong danh sách");
            }
        }
    }
}
