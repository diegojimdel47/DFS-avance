# Avance del proyecto
[Volver al inicio](https://github.com/diegojimdel47/DFS-avance/tree/main)
## Diagrama
![alt text](Captura_diagrama.png)
## Explicación del diseño
Dentro de nuestro diagrama y posteriormente el reto final, tendremos cuatro clases:
- Library

    Esta clase es el centro del sistema, aqui se gestionan a los usuarios, los libros y los préstamos, se pueden registrar nuevos libros y usuarios, iniciar préstamos y gestionar las devoluciones.
- Book

    Aquí se represtan a los libros dentro de una biblioteca, contienen su información básica, se encargan de controlar si un libro esta dispible para un préstamo, y si una copia ha sido prestadada o devuelta.
- User

    Con esta clase representamos al un usuario de la biblioteca, almacenamos su información como con los libros, llevamos control de los prestamos activos, y verificamos si el usuario es apto para un préstamo.
- Loan

    Por último la clase de prestamo actúa como intermediario entre el usuario y el libro, además almacena información como la fecha del préstamo o de la devolución y su estado.
## Código
```java
import java.util.Scanner;
public class avance_reto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;

        do {

            System.out.println("Sistema de gestión de biblioteca");
            System.out.println("\nMenú Princial");
            System.out.println("1. Estado de la biblioteca");
            System.out.println("2. Menú de usuarios");
            System.out.println("3. Menú de libros");
            System.out.println("4. Menú de prestamos");
            System.out.println("5. Salir");

            System.out.print("\nEscoge una opción: ");
            opt = sc.nextInt();

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
                default:
                    System.out.println("Opción inválida, por favor intenta otra vez.");
            }
        }while(opt != 5);
    }
}
```
Salida:

![alt text](Captura_codigo.png)