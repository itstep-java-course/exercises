package task2;

public class Course
{
    public static void main(String[] args)
    {
        char a='Y';
        System.out.println((goodMood((int) a))? "I think today I can have learn everything.":"Nooo,I don't want to study now so I better go to the gym!");
    }
    public static boolean goodMood (int a)
    {
        if(a==89)
            return true;
        else
            return false;
    }
}
