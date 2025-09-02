public class Book {
    String title;
    String author;
    String ISBN;

    public void displayInfo() {
        System.out.println("-------=Books in the Library=-------");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("----------------------------------");
    }

}

class Library extends Book {
    String[] shelf = new String[10];
    int bookCount = 0;

    public void addBook(Book book) {

    }

    public void removeBook() {

    }

    public void displayBook() {
        System.out.println("");
    }
}
