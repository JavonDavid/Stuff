
public class settersAndGetters {
    private String name;
    private double salary;
    public settersAndGetters(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName(String name) {
        return this.name;
    }

    public double getSalary(int salary) {
        return this.salary;
    }
    public void account(){
        System.out.println("Your account " +  name + " and your salary " + salary );
    }
}
