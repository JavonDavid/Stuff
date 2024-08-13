import java.util.*;

public class gradeMarksDriver {
    Scanner in = new Scanner(System.in);
    String name;
    double[] grade = new double[5];

    public gradeMarksDriver(String name, double i, double j, double k, double l, double m) {
        grade[0] = i;
        grade[1] = j;
        grade[2] = k;
        grade[3] = l;
        grade[4] = m;
        this.name = name;

    }

    public void setGrade(double[] grade) {
        this.grade = grade;
    }

    public double[] getGrade(double[] grade) {
        return this.grade;
    }

    public String getName(String name) {
        return this.name;
    }

    public void gradesOfYourclasses() {

        System.out.println("Your name is " + this.name + " and your grades are " + Arrays.toString(this.grade));

    }
}
