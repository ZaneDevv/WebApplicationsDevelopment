package tienda;

import java.util.HashMap;

/**
 * Clase para el sistema de ventas
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class SistemaVentas
{
    private HashMap<Integer, CarroCompra> carritos = new HashMap<>();

    /**
     * Agrega un carrito al sistema
     * @param codigo Código identificador del carrito a agregar
     * @param carrito Instancia del carrito a agregar
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public void setCarrito(int codigo, CarroCompra carrito)
    {
        this.carritos.put(codigo, carrito);
    }


    /**
     * Obtiene el importe del carrito dado
     * @param codCarrito Código identificador del carrito a obtener su importe
     * @return Importe del carrito. Si el resultado es -1, no existe carrito con el código aportado
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public float getImporteCarrito(int codCarrito)
    {
        float importe = -1;
        CarroCompra carrito = this.carritos.get(codCarrito);

        if (carrito != null)
        {
            // Llamo al método calcularImporte en la clase CarroCompra
            importe = carrito.calcularImporte();
        }

        return importe;
    }
}