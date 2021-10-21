public class Eight {
    void school(int a) {
        System.out.println("My first day at school");
    }
    static void school(double b, int a)
    {
        System.out.println("My second day of school");
    }
    static void school(char c, double b, int a)
    {
        System.out.println("My third day of school");
    }
    void school(int a, double b)
    {
        System.out.println("My fourth day of school");
    }
    void school(double b)
    {
        System.out.println("My fifth day of school");
    }

    public static void main(String[] args) {
        System.out.println("I love software testing");
        Eight e1= new Eight();
        e1.school(3);
        school(23.24, 2);
        school('a', 35.56, 4);
        e1.school(7,89.01);
        e1.school(34.56);
    }


}