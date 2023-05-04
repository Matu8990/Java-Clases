
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPc {
    public static void main (String [] args){
       Monitor monitorHP = new Monitor ("HP",13); 
       Teclado tecladoHP = new Teclado ("Bluetooth","HP");
       Raton ratonHp = new Raton ("Bluetooth","Hp");
       Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP,tecladoHP,ratonHp);
    
       Monitor monitorGamer = new Monitor ("Gamer",32); 
       Teclado tecladoGamer = new Teclado ("Bluetooth","Gamer");
       Raton ratonGamer = new Raton ("Bluetooth","Gamer");
       Computadora computadoraGamer = new Computadora ("Computadora Gamer", monitorGamer,tecladoGamer,ratonGamer);   
       
       Monitor monitorSamsung = new Monitor ("Samsung",40); 
       Teclado tecladoSamsung = new Teclado ("Cable","Samsung");
       Raton ratonSamsung = new Raton ("Cable","Samsung");
       Computadora computadoraSamsung = new Computadora ("Computadora Samsung", monitorSamsung,tecladoSamsung,ratonSamsung);   
      
       Monitor monitorAcer = new Monitor ("Acer",15); 
       Teclado tecladoAcer = new Teclado ("Integrado","Acer");
       Raton ratonAcer = new Raton ("Integrado","Acer");
       Computadora computadoraAcer = new Computadora ("Computadora Acer", monitorAcer,tecladoAcer,ratonAcer); 
       
       Monitor monitorLenovo = new Monitor ("Lenovo",32); 
       Teclado tecladoLenovo = new Teclado ("Bluetooth","Lenovo");
       Raton ratonLenovo = new Raton ("Bluetooth","Lenovo");
       Computadora computadoraLenovo = new Computadora ("Computadora Lenovo", monitorLenovo,tecladoLenovo,ratonLenovo); 
       
       Monitor monitorExo = new Monitor ("Exo",16); 
       Teclado tecladoExo = new Teclado ("Bluetooth","Exo");
       Raton ratonExo = new Raton ("Bluetooth","Exo");
       Computadora computadoraExo = new Computadora ("Computadora Exo", monitorExo,tecladoExo,ratonExo);
       
       Monitor monitorEscritorio = new Monitor ("Escritorio",24); 
       Teclado tecladoEscritorio = new Teclado ("Cable","Escritorio");
       Raton ratonEscritorio = new Raton ("Cable","Escritorio");
       Computadora computadoraEscritorio = new Computadora ("Computadora Escritorio", monitorEscritorio,tecladoEscritorio,ratonEscritorio);
       
       Monitor monitorAsus = new Monitor ("Asus",24); 
       Teclado tecladoAsus = new Teclado ("Cable","Asus");
       Raton ratonAsus = new Raton ("Cable","Asus");
       Computadora computadoraAsus = new Computadora ("Computadora Asus", monitorAsus,tecladoAsus,ratonAsus);
       
       Monitor monitorDell = new Monitor ("Dell",30); 
       Teclado tecladoDell = new Teclado ("Bluetooth","Dell");
       Raton ratonDell = new Raton ("Bluetooth","Dell");
       Computadora computadoraDell = new Computadora ("Computadora Dell", monitorDell,tecladoDell,ratonDell);
       
       Monitor monitorMSI = new Monitor ("MSI",40); 
       Teclado tecladoMSI = new Teclado ("Cable","MSI");
       Raton ratonMSI = new Raton ("Cable","MSI");
       Computadora computadoraMSI = new Computadora ("Computadora MSI", monitorMSI,tecladoMSI,ratonMSI);
       
       
       
       Orden orden1 = new Orden();
       orden1.agregarComputadora(computadoraHP);
       orden1.agregarComputadora(computadoraGamer);
       orden1.agregarComputadora(computadoraAcer);
       orden1.agregarComputadora (computadoraSamsung);
       orden1.agregarComputadora(computadoraLenovo);
       orden1.agregarComputadora(computadoraExo);
       orden1.agregarComputadora(computadoraEscritorio);
       orden1.agregarComputadora(computadoraAsus);
       orden1.agregarComputadora(computadoraDell);
       orden1.agregarComputadora(computadoraMSI);
       orden1.mostrarOrden();
       
    }
}