import org.apache.commons.lang3.StringUtils;

public class Employee {

    private int departamentNumber;
    private int salaryEmployee;
    private String nameEmployee;
    private String surnameEmployee;

    private Integer id;
    private static int counter;

    public Employee(String nameEmployee, String surnameEmployee, int departamentNumber, int salaryEmployee) {

        setNameEmployee(nameEmployee);
        setSurnameEmployee(surnameEmployee);
        setDepartamentNumber(departamentNumber);
        this.salaryEmployee = salaryEmployee;
        this.id = counter++;

    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee) {
        if (surnameEmployee != null || StringUtils.isNotEmpty(surnameEmployee) ||
                StringUtils.isNotBlank(surnameEmployee) ||
                StringUtils.isAlphaSpace(surnameEmployee)) {
            this.surnameEmployee = StringUtils.capitalize(surnameEmployee);
        } else {
            throw new RuntimeException("400 Bad Request");
        }

    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        if (nameEmployee != null || StringUtils.isNotEmpty(nameEmployee) ||
                StringUtils.isNotBlank(nameEmployee) ||
                StringUtils.isAlphaSpace(nameEmployee)) {
            this.nameEmployee = StringUtils.capitalize(nameEmployee);
        } else {
            throw new RuntimeException("400 Bad Request");

        }
    }

    public Integer getId() {
        return id;
    }

    public int getDepartamentNumber() {
        return departamentNumber;
    }

    public void setDepartamentNumber(int departamentNumber) {
        if (departamentNumber == 0) {

        } else {
            this.departamentNumber = departamentNumber;
        }

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
                "departamentNumber=" + departamentNumber +
                ", salaryEmployee=" + salaryEmployee +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", surnameEmployee='" + surnameEmployee + '\'' +
                ", id=" + id +
                '}';
    }
}





