public class GooglePlay
{
    private Usuario[] usuarios;
    private Producto[] productos;
    
    public GooglePlay()
    {
        usuarios = new Usuario[10];
        productos = new Producto[10];
    }
    
    public void addUsuario(Usuario usuario)
    {
        boolean buscando = true;
        for(int i = 0; i < usuarios.length; i++)
        {
            if(usuarios[i] == null && buscando == true)
            {
                usuarios[i] = usuario;
                buscando = false;
            }
        }
    }
    
    public void addProducto(Producto producto)
    {
        boolean buscando = true;
        for(int i = 0; i < productos.length; i++)
        {
            if(productos[i] == null && buscando == true)
            {
                productos[i] = producto;
                buscando = false;
            }
        }
    }
    
    public int comprar(String usuario, String nombre)
    {
        
        return -1;
    }
    
    public int getNumeroUsuarios()
    {    
        int numero = 0;
        boolean buscando = true;
        for(int i = 0; i < usuarios.length; i++)
        {
            if(usuarios[i] == null && buscando == true)
            {
                buscando = false;
                numero = i;
            }
        }    
        return numero;
    }
    
    public int getNumeroProductos()
    {
        int numero = 0;
        boolean buscando = true;
        for(int i = 0; i < productos.length; i++)
        {
            if(productos[i] == null && buscando == true)
            {
                buscando = false;
                numero = i;
            }
        }    
        return numero;
    }
}
