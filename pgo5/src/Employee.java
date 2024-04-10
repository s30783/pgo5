public class Employee {
    String name;
    String lname;
    String address;
    String email;
    String PESEL;
    int year;
    int salary = 3000;

    public Employee(String name, String lname, String address, String email, String PESEL, int salary) {
        this.name = name;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.salary = salary;
    }

    public void setSalary(){
        int newSalary;
        if(year==0) {
            newSalary = salary;
        } else if (year>0) {
            newSalary = salary*year;
        }else{
            System.out.println("Year can't be in negative number");
        }
    }
}

