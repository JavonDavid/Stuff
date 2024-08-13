public class library {
    String[] book = new String[5];
    String[] author = new String[5];

    library(String[] book, String[] author) {
        this.book = book;
        this.author = author;
    }

    public String[] findBookAndAuthor(String[] book, String[] author) {
        System.out.println("Your book you are lookng for is:" + book);
        System.out.println("And the author is: ");
        return this.author;
    }

    public String[] getBook(String[] book) {
        return this.book;
    }

    public String[] getAuthor(String[] author) {
        return this.author;
    }
}
