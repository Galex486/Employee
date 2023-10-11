import Employee.employee;

public class Main {
    public static void main(String[] args) {

        employee man  = new employee();
        man.name = "Ion";
        man.age = 24;
        man.department = "Chisinau";

        System.out.println(man.name + " are " + man.age + " de ani si locuieste in municipiul " + man.department + ".");
    }
}