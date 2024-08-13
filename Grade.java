public class Grade {
    char letter;

    public void grade(char letter) {
        System.out.println("Your grade is: " + letter);
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char getLetter(char letter) {
        return this.letter;
    }

}
