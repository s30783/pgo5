import java.util.ArrayList;

class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, String PESEL, int year) {
        super(firstName, lastName, address, email, PESEL, year);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology tech) {
        technologies.add(tech);
    }

    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
