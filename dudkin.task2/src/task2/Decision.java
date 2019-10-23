package task2;

public class Decision
{
    public static void main(String[] args)
    {
        char a='Y',b='R';
              if(bossCalled()||(gotUpOnTime((int)a)&&itIsntRainy((int)b)))
                  goToWork();
              else
                  stayHome();
    }
    public static boolean gotUpOnTime(int b)
    {
        if(b==89)
            return true;
        else
            return false;
    }
    public static boolean itIsntRainy(int a)
    {
         if(a!=82)
             return true;
         else
             return false;
    }
    public static boolean bossCalled()
    {return false;}
    public static void goToWork()
    {System.out.println("OK,let's go to work!");}
    public static void stayHome()
    {System.out.println("Nothing important didn't happened so I can stay home.");}
}
