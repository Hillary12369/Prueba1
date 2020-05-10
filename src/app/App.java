package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Operaciones op = new Operaciones();
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        String teclado = null;
        do{
        System.out.println("Menu de Opciones");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println();
        System.out.println("Ingrese opcion: ");
        int opcion; 
        opcion = sc.nextInt();
        System.out.println("Aqui ingresara los dos numeros a operar:")
        System.out.println("Ingresar n1:" );
        double a = sc.nextDouble();
        System.out.println("Ingresar n2:" );
        double b = sc.nextDouble();
        
        switch(opcion){
            case 1:
                System.out.println("La suma es: "+ op.suma(a, b));
                break;
            case 2:
                System.out.println("La resta es: " + op.resta(a, b));
                break;
            case 3:
                System.out.println("La multiplicación es: " + op.multiplicacion(a, b));
                 break;
            case 4:
                System.out.println("La división es: " + op.division(a, b));
                break;
            default:
                System.out.println("Ingrea una opcion del 1 a 4: "); 
            }  
                 System.out.println("\n¿Desea regresar al Menu de Opciones?, Presione S para confirmar.\n");
                 teclado = new Scanner(System.in).nextLine();
          }while(teclado.equals("s") || teclado.equals("S"));
      }
}
