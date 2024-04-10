import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    List<String> tests;
    int bonus=300;

    public Tester(String name, String lname, String address, String email, String PESEL, int salary) {
        super(name, lname, address, email, PESEL, salary);

        this.tests = new ArrayList<>();
        this.bonus = bonus;
    }

    public void setBonus(int value){
        if(tests.size()>0){
            value = tests.size()*bonus;
        }
    }
}
