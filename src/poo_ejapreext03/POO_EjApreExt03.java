package poo_ejapreext03;

import entidades.Raiz;
import servicios.ServiciosRaiz;


public class POO_EjApreExt03 {

  
    public static void main(String[] args) {
        
        ServiciosRaiz srv = new ServiciosRaiz();
        
        Raiz raiz = srv.crearRaiz();
        
        double discri = srv.getDiscriminante(raiz);
        
        System.out.println("El valor del discriminante es: "+srv.getDiscriminante(raiz));
        
        boolean tiene = srv.tieneRaiz(discri);
        
        boolean tiene2 = srv.tieneRaices(discri);
        
        srv.obtenerRaiz(tiene);
        
        srv.obtenerRaices(tiene2);
        
        
    }
    
}
