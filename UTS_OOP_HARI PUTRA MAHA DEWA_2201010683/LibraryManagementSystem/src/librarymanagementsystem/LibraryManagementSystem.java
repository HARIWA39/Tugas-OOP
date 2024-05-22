package librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(100);

        while (true) {
            System.out.println("Selamat Datang Di Sistem Manajemen Buku Perpustakaan Hariwa ");
            System.out.println("Menu Yang Tersedia;:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Edit Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihanmu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukan Judul: ");
                    String title = scanner.nextLine();
                    System.out.print("masukan Pengarang: ");
                    String author = scanner.nextLine();
                    System.out.print("Masukan ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Masukan Tahun Terbit: ");
                    int year = scanner.nextInt();
                    Book newBook = new Book(title, author, isbn, year);
                    library.addBook(newBook);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Masukan Judul Buku Untuk Melakukan Update: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Masukan Judul Baru: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Masukan Pengarang Baru: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Masukan ISBN Baru: ");
                    String newIsbn = scanner.nextLine();
                    System.out.print("Masukan Tahun Terbit Baru: ");
                    int newYear = scanner.nextInt();
                    Book updatedBook = new Book(newTitle, newAuthor, newIsbn, newYear);
                    library.updateBook(updateTitle, updatedBook);
                    break;
                case 4:
                    System.out.print("Masukan Judul Buku Untuk Menghapusnya: ");
                    String deleteTitle = scanner.nextLine();
                    library.deleteBook(deleteTitle);
                    break;
                case 5:
                    System.out.println("Aplikasi Berakhir");
                    System.exit(0);
                default:
                    System.out.println("Pilihan Tidak Ditemuakn");
            }
        }
    }
}
