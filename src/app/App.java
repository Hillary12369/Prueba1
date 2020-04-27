package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Operaciones op = new Operaciones();
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        int opcion; 
        
        System.out.println("Elige la operacion que deseaa realizar: ");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("5.- Salir");
        opcion = sc.nextInt();

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
            case 5:
                 System.out.println("Gracias por usar nuestro sistema......");
                break;
                }

    }
}