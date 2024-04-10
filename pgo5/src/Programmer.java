import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee{

    List<String> technologies; //premia za kazda znana technologie

    public Programmer(String name, String lname, String address, String email, String PESEL, int salary) {
        super(name, lname, address, email, PESEL, salary);
        this.technologies = new ArrayList<>();
    }
}
