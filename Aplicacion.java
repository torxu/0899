public class Aplicacion extends Producto
{
    private String nombreProducto;
    private double mBProducto;
    private Categoria categoria;
    private int vecesVendida;
    private double precio;
    
    public Aplicacion(String nombre, double mb , Categoria categoria)
    {
        super();
        nombreProducto = nombre;
        mBProducto = mb;
        this.categoria = categoria;
        precio = 0.99;
        switch(categoria)
        {
            case JUEGOS:
            precio = 5;
            break;
            
            case PRODUCTIVIDAD:
            precio = 10;
            break;
            
            case MULTIMEDIA:
            precio = 2;
            break;
            
            case COMUNICACIONES:
            precio = 2;
            break;
        }
        
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
