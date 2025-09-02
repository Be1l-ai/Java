public class Book_Main {
    public static void main(String[] args) {
        Book book = new Book();
        Library library = new Library();

        library.addBook(book);
        library.displayBook();
    }
}
