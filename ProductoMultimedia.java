public class ProductoMultimedia extends Producto
{
    private String titulo;
    private int añoCreacion;
    
    public ProductoMultimedia(String titulo, int año)
    {
        super();
        this.titulo = titulo;
        añoCreacion = año;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public int getAno()
    {
        return añoCreacion;
    }
}
