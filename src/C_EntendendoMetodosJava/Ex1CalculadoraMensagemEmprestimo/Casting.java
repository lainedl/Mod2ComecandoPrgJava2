package C_EntendendoMetodosJava.Ex1CalculadoraMensagemEmprestimo;

public class Casting {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; //Downcast, ocasionará perda de informação. -24

        long l1;
        int i1 = 10;
        l1 = i1; //Upcast não houve perda de informação.

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; //Downcast, ocasionará perda de informação. -14866186482

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; //Downcast,mas não teve perda de informação.

        double d1;
        float f1 = 10.5F;
        d1 = f1; //Upcast, não teve perda de informação.

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; //Downcast sem perda de informação.
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3; //Downcast com perda de informação.

        int i4;
        float f4 = 11.5697F;
        i4 = (int) f4; //Downcast com perda de informação.

        System.out.println("b1: "+b1);
        System.out.println("l1: "+l1);
        System.out.println("i2: "+i2);
        System.out.println("i3: "+i3);
        System.out.println("d1: "+d1);
        System.out.println("f2: "+f2);
        System.out.println("f3: "+f3);
        System.out.println("i4: "+i4);

        b1 = (byte)  d3; //Downcast, com perda de informações. Downcast sempre explicito.

        System.out.println("b1: "+b1);

           }
}
