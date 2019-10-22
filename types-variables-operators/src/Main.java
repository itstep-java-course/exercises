public class Main {

    private static boolean isTrue;
    private static byte    bOneByte;                   //8 bits
    private static short   sSomeShort;                 //16 bits
    private static int     iSomeInteger;               //32 bits
    private static long    lSomeLong;                  //64 bits

    private static float   fSomeFloat;                 //32 bits
    private static double  dSomeDouble;                //64 bits

    private static char    chSomeCharacter;            //16 bits, 1 UTF-16 character


    public static void main(String[] args) {

        iSomeInteger = 10 + 7;
        System.out.println("10 + 7 = " + iSomeInteger);

        iSomeInteger = iSomeInteger - 10;
        System.out.println("17 - 10 = " + iSomeInteger);

        iSomeInteger = 2 * 10;
        System.out.println("2 * 10 = " + iSomeInteger);

        iSomeInteger = iSomeInteger / 3;
        System.out.println("20 / 3 = " + iSomeInteger);

        dSomeDouble = 20.0 / 3;
        System.out.println("20.0 / 3 = " + dSomeDouble);

        iSomeInteger = 10 % 3;
        System.out.println("10 % 3 = " + iSomeInteger);

        do {
            sSomeShort++;
            System.out.println(sSomeShort);
        } while (sSomeShort < 10);

        do {
            sSomeShort--;
            System.out.println(sSomeShort);
        } while (sSomeShort > 0);

        iSomeInteger = 8 + 5 * 7;
        System.out.println("8 + 5 * 7 = " + iSomeInteger);

        iSomeInteger = (8 + 5) * 7;
        System.out.println("(8 + 5) * 7 = " + iSomeInteger);

        iSomeInteger = 10 / 5 * 2;
        System.out.println("10 / 5 * 2 = " + iSomeInteger);

        for (chSomeCharacter = 0; chSomeCharacter < 256; chSomeCharacter++) {
            System.out.println(chSomeCharacter);
        }

    }

}
