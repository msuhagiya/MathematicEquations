class Employee {
    float salary = 40000;
}
    public class Programmer extends Employee{

    int bonus=10000;

    public static void main(String[] args) {
        Programmer p1= new Programmer();
        System.out.println("Programmer salary:-" + p1.salary);
        System.out.println("bonus of programmer:-" + p1.bonus);
    }
}
