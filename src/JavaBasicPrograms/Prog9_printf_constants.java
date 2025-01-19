package JavaBasicPrograms;

import java.io.PrintStream;

public class Prog9_printf_constants {
    public static void main(String[] args) {
        //Printf
        int a = 1019328738;
        System.out.println();
        System.out.printf("Your variable name is  %d",a);
        /* %d -> int, byte, long, short - data
           %s
           %f float,
           %b boolean

         */

        byte by = 100;
        System.out.println();
        System.out.printf("%d",by);

        float f = 1666.177F;
        System.out.println();
        System.out.printf("%f",f);

        boolean b1 = true ;
        System.out.println();
        System.out.printf(String.valueOf(b1));


        final int c = 1001;
        //int  c= 150;     Not possible to change values for Final
        System.out.println(c);

        final float pi = 3.14f;
        // pi=190;
        System.out.println(pi);
    }
}
