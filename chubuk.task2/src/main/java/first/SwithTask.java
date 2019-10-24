package first;

public class SwithTask {
    public static void main(String[] args) {
        defineCarByFeatures("length 4415");
        defineCarByFeatures("max speed 169");
        defineCarByFeatures("front drive type");
        defineCarByFeatures("body type hatchback");
        defineCarByFeatures("engine volume 1349");
    }
static int interest=0, a=0;

    private static void defineCarByFeatures(String choice) {
        switch (choice) {
            case "length 4415":
                interest++;
                System.out.println("the criterion length is suitable");
                break;
            case "engine volume 1349":
                interest++;
                System.out.println("the criterion engine is suitable");
                break;
            case "max speed 169":
                interest++;
                System.out.println("the criterion speed is suitable");
                break;
            case "body type hatchback":
                interest++;
                System.out.println("the criterion body type is suitable");
                break;
            case "back drive type":
                interest++;
                System.out.println("the criterion drive type is suitable");
                break;
        }
        a++;
        if (a>4)
        {
            if (interest>=4)
            {
                System.out.println("buy");
            }
        else
            System.out.println("do not do this");
        }
        }

}
