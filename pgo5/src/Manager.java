public class Manager extends Employee{

    class Goal{
        String name;
        int yy;
        int mm;
        int dd;
        int bonus;


        public void setBonus(){
            int newBonus;
            newBonus = salary + bonus;
        }
    }
    public Manager(String name, String lname, String address, String email, String PESEL, int salary) {
        super(name, lname, address, email, PESEL, salary);
    }


}
