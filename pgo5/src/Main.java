import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        Programmer p1 = new Programmer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        //Technology t=new Technology("Java", 800); dev.addTechnology(t);

        employees.add(p1);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        //tester.addTestType("UI/UX");
        employees.add(tester);
        Manager manager = new Manager ("Bob", "Johnson","Chicago", "bob@johnson.com", "1122334455", 2019);

        //Manager.Goal g=new Manager.Goal(2018, 10, 15, "Implementing FB login", 1000);
        //manager.addGoals(g);

        employees.add(manager);
        int totalAmount=0;

        //for (Employee employee : employees) totalAmount = totalAmount + employee.setSalary();
            System.out.println("Total amount to be paid this month: "+ totalAmount + "USD");
    }
}