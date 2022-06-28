import java.util.Objects;

public class EmployeeClass {
    private final String empName;
    private final int empNumber;

    public EmployeeClass(String empName, int empNumber) {
        this.empName = empName;
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "empName='" + empName + '\'' +
                ", empNumber=" + empNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return empNumber == that.empNumber && Objects.equals(empName, that.empName);
    }
}
