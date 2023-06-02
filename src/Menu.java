public class Menu {
    public static void main(String[] args) {
        Libros libro1 = new Libros("La vaca Lola", "Alan Po", 5, 2010, 10);
        Libros libro2 = new Libros("Don Quijote", "Agusto Valentine", 8, 2000, 50);
        Libros libro3 = new Libros("El bien y el mal", "Alberto Cruz", 7, 2014, 45);
        Libros libro4 = new Libros("La inocente", "Mora", 1, 2021, 5);
        Libros libro5 = new Libros("Donde esta la Esperanza", "Cataña Dennis", 9, 2000, 2);


        System.out.println("A continuacion datos del libro 1: ");
       //libro1.imprimir_Datos();
        System.out.println("A continuacion datos del libro 2: ");
       // libro2.imprimir_Datos();
        System.out.println("A continuacion datos del libro 3: ");
        //libro3.imprimir_Datos();
        System.out.println("A continuacion datos del libro 4: ");
        //libro4.imprimir_Datos();
        System.out.println("A continuacion datos del libro 5: ");
        //libro5.imprimir_Datos();

    }
}
