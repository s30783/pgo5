import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, String PESEL, int year) {
        super(firstName, lastName, address, email, PESEL, year);
        this.goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchieved()) {
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
    }
}
