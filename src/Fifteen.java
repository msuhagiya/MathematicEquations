class Thirteen //learning about hierarchical inheritance.
{
        void playschool()
        {
                System.out.println("I am going to school");
        }
        }
        class Fourteen extends Thirteen
        {
                void school()
                {
                        System.out.println("I love learning");
                }
        }
public class Fifteen extends Thirteen
{
        void play()
        {
                System.out.println("I am learning");
        }

        public static void main(String[] args) {
                {
                        System.out.println("I love software testing");
                        Fifteen f1= new Fifteen();
                        f1.play();
                        f1.playschool();
                        Fourteen f2= new Fourteen();
                        f2.school();
                        f2.playschool();
                }
        }
}

