public class Employee {

    private int departamentNumber;
    private int salaryEmployee;
    private String fullNameEmployee;

    private Integer id;
    private static int counter;

    public Employee (String fullNameEmployee, int departamentNumber, int salaryEmployee) {
        this.fullNameEmployee = fullNameEmployee;
        this.departamentNumber = departamentNumber;
        this.salaryEmployee = salaryEmployee;
        this.id = counter++;

    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public Integer getId() {
        return id;
    }

    public int getDepartamentNumber() {
        return departamentNumber;
    }

    public void setDepartamentNumber(int departamentNumber) {
        this.departamentNumber = departamentNumber;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "отдел=" + departamentNumber +
                ", зарплата=" + salaryEmployee +
                ", ФИО='" + fullNameEmployee + '\'' +
                '}';
    }
}





