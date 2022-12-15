package polymorphism;

public class MainPolymorphism {

    public static void main(String[] args) {

        Employee employee = new Employee("Agus");
        Manager manager = new Manager("Budi");
        VicePresident vicePresident = new VicePresident("Diego");

        // call method
//        employee.sayHello();
//        manager.sayHello();
//        vicePresident.sayHello();

        sayHello(vicePresident);
        sayHello(manager);

    }
    public static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);
        }else {
            System.out.println("Hello Employee "+ employee.name);
        }
    }

}
