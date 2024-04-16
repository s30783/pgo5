import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    ArrayList<String> tests;

    public Tester(String name, String lname, String address, String email, String PESEL, int year) {
        super(name, lname, address, email, PESEL, year);

        this.tests = new ArrayList<>();
    }

    public void addTestType(String testType){
        tests.add(testType);
    }

    public int calculateSalary() {
        int baseSalary = super.setSalary();
        return baseSalary + testTypes.size() * 300;
    }
}
