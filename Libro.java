
public class Libro extends ProductoMultimedia
{
    private int numPaginas;
    private boolean ficcion;
    
    public Libro(String titulo, int año, int paginas, boolean ficcion)
    {
        super(titulo, año);
        numPaginas = paginas;
        this.ficcion = ficcion;
    }
    
    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    
    public boolean getFiccion()
    {
        return ficcion;
    }
}
