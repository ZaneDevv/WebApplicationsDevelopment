package tienda;

public class Producto
{
    private float precio = 0;

    /**
     * Crea un nuevo producto con el precio dado
     * @param precio Precio del producto
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public Producto(float precio)
    {
        this.precio = precio;
    }

    /**
     * Obtiene el precio del producto
     * @return Precio del producto
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public float getPrecio()
    {
        // Entrego el precio del producto a la otra clase (en este caso CarroProducto) que llama a este método
        return this.precio;
    }
}