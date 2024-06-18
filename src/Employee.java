import java.math.BigDecimal;
import java.time.Year;
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

    public double calculateSalary(){
        double salary = 3000;
        int yearsWorked = Year.now().getValue() - year;
        return salary + yearsWorked * 1000;
    }

}
