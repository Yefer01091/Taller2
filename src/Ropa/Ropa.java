
package Ropa;


public class Ropa {
    
    //Variables
    public int numeroBotones;
    public String marca; 
    public double talla;
    public float numColores;
    public double precio; 
    
    //Metodos
    public int colocar(){
        System.out.println("Se coloco la prenda");
        return 0;
    }
    
    public String quitar(){
        System.out.println("Se quito la prenda");
        return null;
    }
    
    public void lavar(){
        System.out.println("Lavo la prenda con jabon");
    }
    
    public float limpiar(){
        System.out.println("Limpio la prenda un paño humedo");
        return 0;
    }
    
    public double pintar(){
        System.out.println("Pinto de color negro la prenda");
        return 0;
    }
}
