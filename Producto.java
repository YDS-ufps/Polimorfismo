public abstract class Producto
{
    protected double precio;

    public Producto(){  
    }
    
    public Producto(double precio){
        this.precio = precio;
    }

    public abstract void mostrarDetalles();
}
