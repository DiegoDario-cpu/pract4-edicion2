public class Pelicula{
    private String titulo;
    private String director;
    private int añoEstreno;
    private String genero;
    private int duracion;

    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getInformacion(){
        return "Título: " + titulo + ", Director: " + director + 
               ", Año: " + añoEstreno + ", Género: " + genero + 
               ", Duración: " + duracion + " min.";
    }
    public boolean esClasico(){
        int añoActual=2026;
        return (añoActual - añoEstreno)>25;
    }

    public String getTitulo(){
        return titulo;
    }

    
    @Override
    public String toString() {
        return "Pelicula [" + getInformacion() + " | ¿Es clásica?: " + (esClasica() ? "Sí" : "No") + "]";
    }
}