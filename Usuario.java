public class Usuario
{
    private String correoUsuario;
    private Producto[] productosComprados;
    
    public Usuario(String correo)
    {
        correoUsuario = correo;
        productosComprados = new Producto[10];
    }
    
    public String getNombreCuenta()
    {
        return correoUsuario;
    }
}
