package Entity;

public class DepartmentEntity {
    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
