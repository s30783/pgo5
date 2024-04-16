import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee{

    ArrayList<Technology> technologies; 
    
    public Programmer(String name, String lname, String address, String email, String PESEL, int year) {
        super(name, lname, address, email, PESEL, year);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology tech) {
        knownTechnologies.add(tech);
    }

    public int calculateSalary() {
        int baseSalary = super.setSalary();
        int bonus = 0;
        for (Technology tech : knownTechnologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
