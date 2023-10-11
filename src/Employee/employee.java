package Employee;

public class employee {
    private String name;
    private int age;
    private String department;

    public String getname() {
        return name;

    }
    public int getage() {
        return age;
    }
    public String getdepartment() {
        return department;
    }
    public void setname(String name) {
            this.name = name;
            System.out.println(name);
        }
    public void setage(int age) {
        this.age = age;
        System.out.println(age);
    }
    public void setdepartment(String department) {
        this.department = department;
        System.out.println(department);
    }

}
