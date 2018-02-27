/*
    Taller 2
    26-02-2018
    Yeferson Patarroyo
*/


package Principal;

import Computador.Computador;
import Moto.Moto;
import Ropa.Ropa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        //Llamado a mi clase Moto
        Moto moto1 = new Moto();
        moto1.numeroCambios = 5;
        moto1.marca = "YAMAHA MT-09";
        moto1.peso = 193; 
        moto1.cilindraje = 847;
        moto1.potencia = 113.4; 
        
        Moto moto2 = new Moto();
        moto2.numeroCambios = 6;
        moto2.marca = "PULSAR 200 NS";
        moto2.peso = 145; 
        moto2.cilindraje = (float) 199.5;
        moto2.potencia = 23.5;
                    
        Moto moto3 = new Moto();
        moto3.numeroCambios = 6;
        moto3.marca = "Honda CBR 250R C ABS";
        moto3.peso = 167; 
        moto3.cilindraje = (float) 249.6;
        moto3.potencia = 25.07;        
        
        Moto moto4 = new Moto("PULSAR 180", 200);    
        //Llamado a mi clase ropa
        Ropa ropa1 = new Ropa();
        ropa1.numeroBotones = 3;
        ropa1.marca = "Diesel";
        ropa1.talla = 30;
        ropa1.numColores = 1;        
        ropa1.precio = 80.000;       
                
        Ropa ropa2 = new Ropa();
        ropa2.numeroBotones = 2;
        ropa2.marca = "Polo";
        ropa2.talla = 28;
        ropa2.numColores = 3;       
        ropa2.precio = 50.000;
        
        Ropa ropa3 = new Ropa();
        ropa3.numeroBotones = 6;
        ropa3.marca = "Canada Goose";
        ropa3.talla = 32;
        ropa3.numColores = 2;       
        ropa3.precio = 140.000;         
        
    
        //Llamado a mi clase computador
        Computador computador1 = new Computador();
        computador1.numeroPartes = 4;
        computador1.modelo = "HP";
        computador1.largo =  13.7;      
        computador1.velocidadProcesador = (float) 2.4;
        computador1.ancho = 9.6;
                
        Computador computador2 = new Computador();
        computador2.numeroPartes = 5;
        computador2.modelo = "Lenovo";
        computador2.largo = 14.2;       
        computador2.velocidadProcesador = (float) 3.2;   
        computador2.ancho = 11.3;
        
        Computador computador3 = new Computador();
        computador3.numeroPartes = 6;
        computador3.modelo = "Asus";
        computador3.largo = 10.4;        
        computador3.velocidadProcesador = (float) 3.6;
        computador3.ancho = 8.5;
        
        Scanner leer = new Scanner(System.in);
        
        while(true){
                System.out.print("CLASES \n"
                        + "1.Moto\n"
                        + "2.Ropa\n"
                        + "3.Computador\n"
                        + "4.Salir\n"
                        + "opcion: ");
                int opcion = leer.nextInt();

                switch(opcion){
                    case 1: while(true){
                                System.out.print("MOTO \n"
                                        + "1.Moto1\n"
                                        + "2.Moto2\n"
                                        + "3.Moto3\n"
                                        + "4.Metodos\n"
                                        + "5.Salir\n"
                                        + "opcion: ");
                                int opcion1 = leer.nextInt();

                                switch(opcion1){
                                    case 1: System.out.println("El numero de cambios de la moto 1 es: "+moto1.numeroCambios);
                                            System.out.println("La marca de la moto 1 es: "+moto1.marca);
                                            System.out.println("El peso de la moto 1 es: "+moto1.peso);
                                            System.out.println("El cilindraje de la moto 1 es: "+moto1.cilindraje);
                                            System.out.println("La potencia de la moto 1 es: "+moto1.potencia);
                                    break;
                                    case 2: System.out.println("El numero de cambios de la moto 2 es: "+moto1.numeroCambios);
                                            System.out.println("La marca de la moto 2 es: "+moto2.marca);
                                            System.out.println("El peso de la moto 2 es: "+moto2.peso);
                                            System.out.println("El cilindraje de la moto 2 es: "+moto2.cilindraje);
                                            System.out.println("La potencia de la moto 2 es: "+moto2.potencia);
                                    break;
                                    case 3: System.out.println("El numero de cambios de la moto 3 es: "+moto3.numeroCambios);
                                            System.out.println("La marca de la moto 3 es: "+moto3.marca);
                                            System.out.println("El peso de la moto 3 es: "+moto3.peso);
                                            System.out.println("El cilindraje de la moto 3 es: "+moto3.cilindraje);
                                            System.out.println("La potencia de la moto 3 es: "+moto3.potencia);
                                    break;   
                                    case 4: System.out.println("moto4");
                                    break;    
                                    case 5: moto1.acelerar();
                                            moto2.frenar();
                                            moto3.girar();
                                            moto1.retroceder();
                                            moto2.encender();
                                    break;    
                                }    
                            }
                    
                    case 2: while(true){
                                System.out.print("ROPA \n"
                                        + "1.Prenda1\n"
                                        + "2.Prenda2\n"
                                        + "3.Prenda3\n"
                                        + "4.Metodos\n"
                                        + "5.Salir\n"
                                        + "opcion: ");
                                int opcion2 = leer.nextInt();

                                switch(opcion2){
                                    case 1: System.out.println("El numero de botones de la prenda 1 es: "+ropa1.numeroBotones);
                                            System.out.println("La marca de la prenda 1 es: "+ropa1.marca);
                                            System.out.println("La talla de la prenda 1 es: "+ropa1.talla);
                                            System.out.println("El numero de colores de la prenda 1 es: "+ropa1.numColores);
                                            System.out.println("El precio de la prenda 1 es: "+ropa1.precio);
                                    break;
                                    case 2: System.out.println("El numero de botones de la prenda 2 es: "+ropa2.numeroBotones);
                                            System.out.println("La marca de la prenda 2 es: "+ropa2.marca);
                                            System.out.println("La talla de la prenda 2 es: "+ropa2.talla);
                                            System.out.println("El numero de colores de la prenda 2 es: "+ropa2.numColores);
                                            System.out.println("El precio de la prenda 2 es: "+ropa2.precio);
                                    break;
                                    case 3: System.out.println("El numero de botones de la prenda 3 es: "+ropa3.numeroBotones);
                                            System.out.println("La marca de la prenda 3 es: "+ropa3.marca);
                                            System.out.println("La talla de la prenda 3 es: "+ropa3.talla);
                                            System.out.println("El numero de colores de la prenda 3 es: "+ropa3.numColores);
                                            System.out.println("El precio de la prenda 3 es: "+ropa3.precio);
                                    break; 
                                    case 4: ropa1.colocar();
                                            ropa2.quitar();
                                            ropa3.lavar();
                                            ropa1.limpiar();
                                            ropa2.pintar();
                                    break;    
                                }    
                            }     
                    
                    case 3: while(true){
                                System.out.print("COMPUTADOR \n"
                                        + "1.Computador1\n"
                                        + "2.Compuador2\n"
                                        + "3.Computador3\n"
                                        + "4.Metodos\n"
                                        + "5.Salir\n"
                                        + "opcion: ");
                                int opcion3 = leer.nextInt();

                                switch(opcion3){
                                    case 1: System.out.println("El numero de partes del PC 1 es: "+computador1.numeroPartes);
                                            System.out.println("El modelo del PC 1 es: "+computador1.modelo);
                                            System.out.println("El largo del PC 1 es: "+computador1.largo);
                                            System.out.println("La velocidad del procesador del PC 1 es: "+computador1.velocidadProcesador);
                                            System.out.println("El ancho del PC 1 es: "+computador1.ancho);
                                    break;
                                    case 2: System.out.println("El numero de partes del PC 2 es: "+computador2.numeroPartes);
                                            System.out.println("El modelo del PC 2 es: "+computador2.modelo);
                                            System.out.println("El largo del PC 2 es: "+computador2.largo);
                                            System.out.println("La velocidad del procesador del PC 2 es: "+computador2.velocidadProcesador);
                                            System.out.println("El ancho del PC 2 es: "+computador2.ancho);
                                    break;
                                    case 3: System.out.println("El numero de partes del PC 3 es: "+computador3.numeroPartes);
                                            System.out.println("El modelo del PC 3 es: "+computador3.modelo);
                                            System.out.println("El largo del PC 3 es: "+computador3.largo);
                                            System.out.println("La velocidad del procesador del PC 3 es: "+computador3.velocidadProcesador);
                                            System.out.println("El ancho del PC 3 es: "+computador3.ancho);
                                    break; 
                                    case 4: computador1.buscar();
                                            computador2.escribir();
                                            computador3.jugar();
                                            computador1.mostrar();
                                            computador2.reproducir();
                                    break;        
                            }
                    break;
        }      
    }   
}