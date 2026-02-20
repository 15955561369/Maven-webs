package entity;

public class MemberEntity {
    private String name;
    private String password;
    private MemberEntityInfo memberEntityInfo;

    public MemberEntity(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public MemberEntity() {//json进行反序列创建出对象时需要用到无参构造方法

    }

    public MemberEntityInfo getMemberEntityInfo() {
        return memberEntityInfo;
    }

    public void setMemberEntityInfo(MemberEntityInfo memberEntityInfo) {
        this.memberEntityInfo = memberEntityInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", memberEntityInfo=" + memberEntityInfo +
                '}';
    }
}
