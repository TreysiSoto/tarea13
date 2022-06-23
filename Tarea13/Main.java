package Tarea13;

public class Main {
    public static void main(String args[]) {
        Perro perro = new Perro("Britz", "Pitbull", 1.5);
        perro.setColor("Blanco");
        System.out.println("Nombre: "+perro.getNombre());
        System.out.println("Raza: "+perro.getRaza());
        System.out.println("edad: "+perro.getEdad());
        System.out.println("color: "+perro.getColor());

        perro.comer();


       
    
    } 
    
}
