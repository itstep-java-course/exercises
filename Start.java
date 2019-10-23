import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Start
{
    public static void main(String[] args)
    {
        int x=10;
        System.out.println(x);
        int y=20;
        System.out.println(y);
        int z=30;
        System.out.println(z);
        double c=40.0;
        System.out.println(c);
        boolean a=true;
        System.out.println(a);
        char d='p';
        System.out.println(d);

        x = x + y;
        System.out.println(x);
        z = z - x;
        System.out.println(z);
        c = c * x;
        System.out.println(c);
        c = c / x;
        System.out.println(c);
        y = z % y;
        System.out.println(y);
        x++;
        System.out.println(x);
        y+=2;
        System.out.println(y);
        z-=5;
        System.out.println(z);
        c*=2;
        System.out.println(c);
        x/=2;
        System.out.println(x);
        y%=5;
        System.out.println(y);
        z--;
        System.out.println(z);

    }
}
