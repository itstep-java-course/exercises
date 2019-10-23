package task2;

public class LogicalOperatorsTask
{
    public static boolean GetupInTime()
{return false;}
public static boolean IsntRainy()
{return true;}
public static boolean BossCalled()
{return false;}

    public static void main(String[] args)
    {
        if((GetupInTime()&&IsntRainy())||BossCalled())
            System.out.println("I will go to work!");
        else
        System.out.println("I will not go anywhere because i don't want");
    }
    
}
