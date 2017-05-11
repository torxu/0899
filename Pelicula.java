public class Pelicula extends ProductoMultimedia
{
    private int duracion;
    private int calidad;
    private double precio;
    
    public Pelicula(String titulo, int año, int duracionPelicula, int calidadPelicula)
    {
        super(titulo, año);
        duracion = duracionPelicula;
        if(getCalidad() == "FullHD")
        {
            precio = 10;
        }
        else
        {
            precio = 5;
        }
        if(getAno() < 2000)
        {
            precio = precio / 50;
        }
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
