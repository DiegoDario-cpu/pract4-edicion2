public class Main {
    public static void main(String[] args) {
        
        Catalogo miCatalogo = new Catalogo();

    
        Pelicula p1 = new Pelicula("Matrix", "Lana y Lilly Wachowski", 1999, "Ciencia Ficción", 136);
        Pelicula p2 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficción", 148);
        Pelicula p3 = new Pelicula("El Padrino", "Francis Ford Coppola", 1972, "Crimen", 175);

        
        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        
        System.out.println("--- LISTA COMPLETA DE PELÍCULAS ---");
        System.out.println(miCatalogo.getPeliculas());

        
        System.out.println("--- BÚSQUEDA DE PELÍCULA ---");
        miCatalogo.buscarPeliculaPorTitulo("Inception");
        
       
        System.out.println("\n--- PRUEBA DE MÉTODOS toString() ---");
        System.out.println(p1.toString());
        System.out.println(miCatalogo.toString()); 
    }
}

