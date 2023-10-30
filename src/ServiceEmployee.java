import static java.lang.Integer.*;

public class ServiceEmployee {


    public double sumSalaryPerMounthPerDepartment(Employee employee[], int numberDepartment) {
        double sum = 0;
        int numberDep;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberDep = numberDep(employee[i]);

                if (numberDep == numberDepartment) {
                    sum += employee[i].getSalary();
                }
            }
        }

        return sum;
    }

    public double avrSalaryPerDepartment(Employee employee[], int numberDepartment) {
        int numberDep;
        int personPerDepartment = 0;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberDep = numberDep(employee[i]);

                if (numberDep == numberDepartment) {
                    personPerDepartment++;
                }
            }
        }
        double avrSal = sumSalaryPerMounthPerDepartment(employee, numberDepartment) / personPerDepartment;
        return avrSal;
    }

    public void changeSalary(Employee employee[], double index) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() * index / 100);
            }
        }
    }

    public int minSalaryPerDepartment(Employee employee[], int numberDepartment) {
        double min = 0;
        int number = -1;
        int numberDep;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberDep = numberDep(employee[i]);

                if (min == 0 && numberDep == numberDepartment) {
                    min = employee[i].getSalary();
                    number = i;
                    continue;
                }

                if (min > employee[i].getSalary() && numberDep == numberDepartment) {
                    min = employee[i].getSalary();
                    number = i;
                }
            }
        }

        return number;

    }

    public int maxSalaryPerDepartment(Employee employee[], int numberDepartment) {
        double max = 0;
        int number = -1;
        int numberDep;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberDep = numberDep(employee[i]);

                if (max == 0 && numberDep == numberDepartment) {
                    max = employee[i].getSalary();
                    number = i;
                    continue;
                }

                if (max < employee[i].getSalary() && numberDep == numberDepartment) {
                    max = employee[i].getSalary();
                    number = i;
                }
            }
        }

        return number;

    }

    public void changeSalaryDepartment(Employee employee[], double index, int numberDepartment) {
        int numberDep;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberDep = numberDep(employee[i]);

                if (numberDep == numberDepartment) {
                    employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() * index / 100);
                }
            }
        }
    }

    public int numberDep(Employee employee) {
        String department;
        int numberDep = -1;
        if (employee != null) {
            department = employee.getDepartment().substring(employee.getDepartment().length() - 1);
            numberDep = parseInt(department);
        }

        return numberDep;

    }


}




