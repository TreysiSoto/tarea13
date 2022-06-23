package Tarea13;

public class Animal {
    protected String raza;
    protected String nombre;
    protected double edad;

    protected Animal(String nombre, String raza, double edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

 protected String getRaza() {
 	return this.raza;
 }

 protected void setRaza(String raza) {
 	this.raza = raza;
 }


   protected  String getNombre() {
    	return this.nombre;
    }
    protected  void setNombre(String nombre) {
    	this.nombre = nombre;
    }


    protected  double getEdad() {
    	return this.edad;
    }
    protected  void setEdad(double edad) {
    	this.edad = edad;
    }

protected void comer(){
    
}
    
}
