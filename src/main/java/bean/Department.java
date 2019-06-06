package bean;

public class Department {
    private int did;
    private String deptName;
    private String address;
    private String tel;

    public Department() {
    }

    public Department(String deptName, String address, String tel) {
        this.deptName = deptName;
        this.address = address;
        this.tel = tel;
    }

    public Department(int did, String deptName, String address, String tel) {
        this.did = did;
        this.deptName = deptName;
        this.address = address;
        this.tel = tel;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}