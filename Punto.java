package modelo;

public class Punto
{
    //
    //atributos
    // 

    private int x;
    private int y;
    
    //
    //metodos
    //

    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;

    }
    public void setx(int x)
    {
        this.x = x;

    }
    public void sety(int y)
    {
        this.y = y;

    }
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}