class Nine // learning about single level inheritance
{
    void school()
    {
        System.out.println("Learning inheritance");
    }
}
 public class Eleven extends Nine{
    void play()
    {
        System.out.println("Static method");
    }

     public static void main(String[] args) {
         System.out.println("We love software testing");
         Eleven e1= new Eleven();
         e1.play();
         e1.school();
     }
}
