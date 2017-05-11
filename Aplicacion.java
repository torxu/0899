public class Aplicacion extends Producto
{
    private String nombreProducto;
    private double mBProducto;
    private Categoria categoria;
    private int vecesVendida;
    
    public Aplicacion(String nombre, double mb , Categoria categoria)
    {
        super();
        nombreProducto = nombre;
        mBProducto = mb;
        this.categoria = categoria;
    }
    
    public String getNombre()
    {
        return nombreProducto;
    }
    
    public double getTamanoEnMB()
    {
        return mBProducto;
    }
    
    public String getCategoria()
    {
        String cadena = String.valueOf(categoria);
        
        String mayuscula = cadena.substring(0, 1).toUpperCase();
        String minusculas = cadena.substring(1).toLowerCase();
        String categoria = "";
        categoria += mayuscula + minusculas;
        
        return categoria;
    }
}
