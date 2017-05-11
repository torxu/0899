public class Pelicula extends ProductoMultimedia
{
    private int duracion;
    private int calidad;
    
    public Pelicula(String titulo, int año, int duracionPelicula, int calidadPelicula)
    {
        super(titulo, año);
        duracion = duracionPelicula;
        if(calidadPelicula == 480 || calidadPelicula == 1080)
        {
            calidad = calidadPelicula;
        }
    }
    
    public int getDuracion()
    {
        return duracion;
    }
    
    public String getCalidad()
    {
        String calidadPelicula = "";
        if(calidad == 1080)
        {
            calidadPelicula = "FullHD";
        }
        else
        {
            calidadPelicula = "HD";
        }
        return calidadPelicula;
    }
}
