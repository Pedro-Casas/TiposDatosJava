package modelo;

public class TiposDatosJava
{
    public static void main(String[] args)
    {
        //Tipos de datos primitivos
        int x = 12;
        short w = 2;
        String c = "@";
        double y = 2.45;
        boolean esta = true;
        System.out.print("Tipos de datos primitivos");
        System.out.println("X =" + x);

        //Tipos de datos referenciados
        String s = "UIS SOCORRO";
        int[] a = new int[12];
        Punto p1 = new Punto (2,3);
        System.out.println("ti`ps de datos referenciados: ");
        System.out.println("Punto" + p1);

    }
}