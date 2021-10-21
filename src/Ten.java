class Six //learning about multi level inheritance.
{
    void collage()
    {
        System.out.println("I will go to collage next week.");
    }
}
class Seven extends Six
{
    void school()
    {
        System.out.println("I am going to go to school tomorrow.");
    }
}
public class Ten extends Seven
{
void nursery()
{
    System.out.println("I am going to nursery today.");
}

    public static void main(String[] args) {
        {
            System.out.println("We love learning.");
            Ten t1= new Ten();
            t1.nursery();
            t1.school();
            t1.collage();


        }
    }
}
