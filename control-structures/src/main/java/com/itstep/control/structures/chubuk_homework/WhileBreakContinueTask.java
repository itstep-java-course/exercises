package com.itstep.control.structures.chubuk_homework;

public class WhileBreakContinueTask
{
    public static void main(String[] args)
    {
        int x=20;
        while (x>-100)
        {
            if(x%2!=0)
            {
                x--;
                continue;
            }
            else
            {
                System.out.println(x);
                if(x==2)
                {
                    break;
                }
                x--;

            }
        }

    }
}
