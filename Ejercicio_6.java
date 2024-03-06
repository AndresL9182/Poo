
package ejercicios_clase;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);        
  System.out.println("Ingresar numero de la tabla");
          int tabla = teclado.nextInt();
                        
            int cont = 0;            
            do   {
                
            //mul = (tabla*cont);
            System.out.println(tabla+"x"+cont+"="+tabla*cont);
            cont++;
            
            }while (cont<10);
    
    
 }
     }