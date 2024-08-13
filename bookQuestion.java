public class bookQuestion {
    private String title;
    private String author;

    public bookQuestion(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void reading() {
        System.out.println("You are reading " + title + " " + author);
    }

}
