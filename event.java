public class event {
    String name;
    String date;

    public void eventPlanner(String name, String date) {
        System.out.println("Name is: " + name + " " + "Date is: " + date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate(String date) {
        return this.date;
    }

    public String getName(String name) {
        return this.name;
    }
}
