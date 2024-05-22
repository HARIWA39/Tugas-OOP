/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;
/**
 *
 * @author HARIWA
 * HARI PUTRA MAHA DEWA
 * 2201010683 / L
 * 18/5/2024
 * 
 */
public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Perpustakaan Penuh!!!");
        }
    }

    public void displayBooks() {
        System.out.println("======================================================================");
        System.out.printf("%-20s %-20s %-15s %-5s%n", "Judul", "Pengarang", "ISBN", "Tahun Terbit");
        System.out.println("======================================================================");
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("%-20s %-20s %-15s %-5d%n", books[i].getTitle(), books[i].getAuthor(), books[i].getIsbn(), books[i].getYear());
        }
        System.out.println("======================================================================");
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void updateBook(String title, Book newBookData) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i] = newBookData;
                System.out.println("Buku Berhasil Diperbaharui");
                return;
            }
        }
        System.out.println("Buku Tidak Ditemukan");
    }

    public void deleteBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("Buku Berhasil Dihapus");
                return;
            }
        }
        System.out.println("Buku Tidak Ditemukan");
    }
}
