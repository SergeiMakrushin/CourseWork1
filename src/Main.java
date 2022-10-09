public class Main {
    private static Employee[] employees = new Employee[10];

    public static void listEmployees(Employee[] information) {
        for (int i = 0; i < information.length; i++)
            if (information[i] != null) {
                System.out.println("Информация о сотруднике " + information[i]);
            }
    }

    public static int salarySum(Employee[] sulary) {
        int sum = 0;
        for (int i = 0; i < sulary.length; i++)
            if (sulary[i] != null) {
                sum = sum + sulary[i].getSalaryEmployee();
            }
        return sum;
    }

    public static void mediumSulary(Employee[] information, int sum) {
        int b = 0;
        int medium = 0;
        for (int i = 0; i < information.length; i++) {
            if (information[i] != null) {
                b++;
            }
        }
        medium = sum / b;
        System.out.println("Средняя зарплата  = " + medium);
    }

    public static void employeeMinSalary(Employee[] information) {
        int minSalary = 100000000;
        for (int i = 0; i < information.length; i++) {
            if (information[i] != null) if (information[i].getSalaryEmployee() < minSalary) {
                minSalary = information[i].getSalaryEmployee();
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary);
    }

    public static void employeeMaxSalary(Employee[] information) {
        int maxSalary = -1;
        for (int i = 0; i < information.length; i++) {
            if (information[i] != null) if (information[i].getSalaryEmployee() > maxSalary) {
                maxSalary = information[i].getSalaryEmployee();
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary);
    }

    public static void fullnameEmployees(Employee[] information) {
        for (int i = 0; i < information.length; i++)
            if (information[i] != null) {
                System.out.println("Ф. И. О. сотрудника: " + information[i].getFullNameEmployee());
            }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee = new Employee("Ivanov Oleg Michailovich", 1, 30000);
        Employee employee2 = new Employee("Sidorov Ivan Olegovich", 2, 40000);
        Employee employee3 = new Employee("Petrov Michail Ivanovich", 3, 50000);
        Employee employee4 = new Employee("Esenin Sergei Alexandrovich", 4, 60000);
        Employee employee5 = new Employee("Puchkin Alexandr Segeevich", 5, 70000);

        employees[0] = employee;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[5] = employee5;

        listEmployees(employees);

        int sumSalary = salarySum(employees);
        System.out.println("Затраты на зарплаты в месяц = " + sumSalary);

        mediumSulary(employees, sumSalary);

        employeeMinSalary(employees);

        employeeMaxSalary(employees);

        fullnameEmployees(employees);

    }

}