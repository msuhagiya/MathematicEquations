class One //learning about hybrid level inheritance.
{
    void animal()
    {
        System.out.println("Eating");
    }
}
class Two extends One
{
    void Dog()
    {
        System.out.println("Barking");
    }
}
class Three extends Two
{
    void babyDog()
    {
        System.out.println("Baby dog is cute");
    }
}
public class Four extends One{
    void cat()
    {
        System.out.println("Cat is running");
    }

    public static void main(String[] args) {
        System.out.println("Animals are playing");
        Four f1= new Four();
        f1.cat();
        f1.animal();
        Three t1= new Three();
        t1.babyDog();
        t1.Dog();
        t1.animal();
    }

}
