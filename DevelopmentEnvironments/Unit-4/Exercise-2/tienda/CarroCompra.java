package tienda;

import java.util.HashSet;

/**
 * Clase para un carro de compra
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class CarroCompra
{
    private HashSet<Producto> productos = new HashSet<>();

    private float descuento = 0;

    /**
     * Crea un nuevo carrito de la compra con un descuento atribuido
     * @param descuento Descuento de la compras a realizar con el carrito
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public CarroCompra(float descuento)
    {
        this.descuento = Math.min(Math.abs(descuento) / 100f, 1);
    }

    /**
     * Calcula el importe total de los productos del carrito
     * @return Importe total con descuento
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public float calcularImporte()
    {
        float importe = 0;

        for (Producto producto : this.productos)
        {
            // Llamo al método getPrecio de la clase Producto en bucle (una vez por cada producto)
            importe += producto.getPrecio();
        }

        // Le doy a la clase que llama este método (en este caso SistemaVentas) el importe total calculado
        return importe * (1 - this.descuento);
    }

    /**
     * Agrega un producto nuevo al carrito
     * @param producto Producto a añadir
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void setProducto(Producto producto)
    {
        this.productos.add(producto);
    }
}