
public class Libro extends ProductoMultimedia
{
    private int numPaginas;
    private boolean ficcion;
    private double precio;
    
    public Libro(String titulo, int año, int paginas, boolean ficcion)
    {
        super(titulo, año);
        numPaginas = paginas;
        this.ficcion = ficcion;
        int diferencia = 0;
        if(getAno() > 2010)
        {
            diferencia = getAno() - 2010;
        }
        precio = numPaginas / 100 * diferencia;
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
