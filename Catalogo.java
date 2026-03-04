import java.util.ArrayList;

public class Catalogo {
    
    private ArrayList<Pelicula> peliculas;

    
    public Catalogo() {
        this.peliculas = new ArrayList<>();
    }

    
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

   
    public String getPeliculas() {
        if (peliculas.isEmpty()) {
            return "El catálogo está vacío.";
        }
        
        StringBuilder lista = new StringBuilder();
        for (Pelicula p : peliculas) {
            lista.append(p.getInformacion()).append("\n");
        }
        return lista.toString();
    }

    
    public void buscarPeliculaPorTitulo(String titulo) {
        boolean encontrada = false;
        for (Pelicula p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Película encontrada: " + p.getInformacion());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró ninguna película con el título: " + titulo);
        }
    }

    
    @Override
    public String toString() {
        return "Objeto Catalogo [Total de películas registradas: " + peliculas.size() + "]";
    }
}