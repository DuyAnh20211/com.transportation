package aptech.data.impl;

import aptech.data.IDocument;

import java.util.Scanner;

public class Book implements IDocument {
    private int id;
    private String bookName;
    private String authorName;
    private float price;

    public Book() {
    }

    public Book(int id, String bookName, String authorName, float price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("input book name: ");
        bookName = sc.nextLine();
        System.out.print("input author name: ");
        authorName = sc.nextLine();
        System.out.print("input price: ");
        price = sc.nextFloat();
    }

    @Override
    public void show() {
        System.out.printf("\n{id: %d, bookName: %s, authorName: %s, price: %.2f}\n", id, bookName, authorName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
