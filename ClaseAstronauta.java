
package astronauta;

import java.util.Scanner;
//Los cambios están hechos con comentarios
public class ClaseAstronauta {
    
    public static void run(){
           
        double fuerza, peso;
        double GRAVEDADMARTE = 3.72; 
        double GRAVEDADVENUS = 8.87; 
        double GRAVEDADMERCURIO = 3.7; 
        double GRAVEDADJUPITER = 24.79;
        double GRAVEDADSATURNO = 10.44;
        String planeta= "";
        boolean i = true;
        char c;
        
        while(i){
            
            Scanner scan = new Scanner(System.in);
            //Introduce la masa no el peso
            System.out.println("Introduce la masa del astronauta: ");
            peso = scan.nextDouble();
            System.out.println("Introduce el planeta para saber la Fuerza que ejerce la gravedad con ese peso: \n venus\n marte\n mercurio\n jupiter\n saturno");
            planeta = scan.next();
            
            switch (planeta){
                case "venus": fuerza = peso*GRAVEDADVENUS;
                    System.out.println("El peso del astronauta en Venus es " + fuerza + " N");
                    break;
                case "marte": fuerza = peso*GRAVEDADMARTE;
                    System.out.println("El peso del astronauta en Marte es " + fuerza + " N");
                    break;
                case "mercurio": fuerza = peso*GRAVEDADMERCURIO;
                    System.out.println("El peso del astronauta en Mercurio es " + fuerza + " N");
                    break;
                case "jupiter": fuerza = peso*GRAVEDADJUPITER;
                    System.out.println("El peso del astronauta en Júpiter es " + fuerza + " N");
                    break;
                case "saturno": fuerza = peso*GRAVEDADSATURNO;
                    System.out.println("El peso del astronauta en Saturno es " + fuerza + " N");
                    break;
                default: System.out.println("error");
                    break;
            }

            System.out.println("¿Desea introducir un nuevo peso? Y/N: ");
            c = scan.next().charAt(0);
            
            if (c == 'N'){
                //Añadida línea
                System.out.println("¡Gracias por usar el programa!");
                System.out.println("Fin del programa.");
                scan.close();
                break;
            }
        }
    }    
}
