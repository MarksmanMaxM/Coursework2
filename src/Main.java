public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 250000, "Отдел 1");
        employee[1] = new Employee("Семёнов Семён Семёнович", 255000, "Отдел 1");
        employee[2] = new Employee("Петров Пётр Петрович", 550000, "Отдел 3");
        employee[3] = new Employee("Владимиров Владимир Владимирович", 350000, "Отдел 5");
        employee[4] = new Employee("Сидоров Сидор Сидорович", 150000, "Отдел 2");
        employee[5] = new Employee("Гаврилов Гавриил Гаврилович", 750000, "Отдел 4");
        employee[6] = new Employee("Иванова Марфа Ивановна", 257000, "Отдел 5");
        employee[7] = new Employee("Светлова Светлана Фёдоровна", 355000, "Отдел 3");
        employee[8] = new Employee("Потёмкина Ольга Ивановна", 175000, "Отдел 1");
        employee[9] = new Employee("Сидоров Иван Иванович", 250000, "Отдел 1");

        for (Employee emp1 : employee) {
            System.out.println(emp1.toString());
        }

        ServiceEmployee serviceEmployee = new ServiceEmployee();
        System.out.printf("ФОТ за месяц: ");
        System.out.println(serviceEmployee.sumSalaryPerMounth(employee));

        int numberMinSalary = serviceEmployee.minSalary(employee);
        System.out.printf("Минимальная зарплата: ");
        System.out.println(employee[numberMinSalary].toString());

        int numberMaxSalary = serviceEmployee.maxSalary(employee);
        System.out.printf("Максимальная зарплата: ");
        System.out.println(employee[numberMaxSalary].toString());

        System.out.printf("Средняя зарплата за месяц: " + serviceEmployee.avrSalary(employee) + "\n");

        System.out.println("Список сотрудников: ");
        for (Employee emp1 : employee) {
            System.out.println(emp1.getFullName());
        }


    }
}
