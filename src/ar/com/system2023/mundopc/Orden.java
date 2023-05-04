
package ar.com.system2023.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[];
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrden;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
public void agregarComputadora (Computadora computadora){    
if (this.contadorComputadora < Orden.MAX_COMPUTADORAS){
    this.computadora[this.contadorComputadora++] = computadora;
        }
else {
      System.out.print ("Has superado el Limite: "+Orden.MAX_COMPUTADORAS);
}
    }
public void mostrarOrden(){
    System.out.println("Orden #: "+this.idOrden);
    System.out.println("Computadoras de la orden #: "+this.idOrden);
    for (int i = 0; i < this.contadorComputadora; i++){
         System.out.println(this.computadora[i]);
    }
}
}