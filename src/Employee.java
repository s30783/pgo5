import java.math.BigDecimal;

public class Employee {
    String name;
    String lname;
    String address;
    String email;
    String PESEL;
    int year;

    public Employee(String name, String lname, String address, String email, String PESEL, int year) {
        this.name = name;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.year = year;
    }

    public double setSalary(){
        double salary = 3000;
        int yearsWorked = Math.max(0, getCurrentYear() - year);
        return salary + year * 1000;
    }

    private int getCurrentYear() {
        return 2024;
    }
}