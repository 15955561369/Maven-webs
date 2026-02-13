package entity;

public class MemberEntityInfo {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberEntityInfo{" +
                "address='" + address + '\'' +
                '}';
    }
}
