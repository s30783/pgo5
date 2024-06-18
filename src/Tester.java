import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String PESEL, int year) {
        super(firstName, lastName, address, email, PESEL, year);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        return baseSalary + testTypes.size() * 300;
    }
}
