import java.util.Scanner;
public class avance_reto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de gestión de biblioteca");
        System.out.println("\nMenú Princial");
        System.out.println("1. Estado de la biblioteca");
        System.out.println("2. Menú de usuarios");
        System.out.println("3. Menú de libros");
        System.out.println("4. Menú de prestamos");
        System.out.println("5. Salir");

        System.out.print("\nEscoge una opción: ");
        int opt = sc.nextInt();

        switch(opt) {
            case 1: 
                System.out.println("Estado de la biblioteca en proceso de creación...");
                break;
            case 2:
                System.out.println("Menú de usuarios en proceso de creación...");
                break;
            case 3:
                System.out.println("Menú de libros en proceso de creación...");
                break;
            case 4:
                System.out.println("Menú de prestamos en proceso de creación...");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
        }
    }
}