package Entity;

public class MemberEntity {
    /**
     * 成员姓名
     */
    private String name;
    /**
     * 成员地址
     */
    private String address;
    /**
     * 成员部门
     */
    private DepartmentEntity department = new DepartmentEntity();

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                '}';
    }
}
