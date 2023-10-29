public class Employee {
    private String fullName;
    private double salary;
    private String department;
    private int id;
    private static int count = 1;


    public Employee(String fullName, double salary, String department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = count;
        idCount();
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getId() {
        return this.id;
    }

    public void idCount() {
        count++;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", з/п: " + salary +
                ", " + department;
    }
}