package Tarea13;

public class Perro extends Animal {
    protected String color;
    protected Perro(String nombre, String raza, double edad)
    {
        super(nombre, raza, edad); 

    }
    protected String getColor() 
    {
 	    return this.color;
    }

    protected void setColor(String color) 
    {
        this.color = color;
    }
    @Override

    protected void comer()
    {
        System.out.println("Mi comida favorita es la carne...");
    }
}
