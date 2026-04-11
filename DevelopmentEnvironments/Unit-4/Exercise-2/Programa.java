import tienda.*;

/**
 * Clase para la ejecución del programa
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Programa
{
    public static void main(String[] args)
    {
        // Creación del sistema
        CarroCompra carro = new CarroCompra(5);
        carro.setProducto(new Producto(10f));
        carro.setProducto(new Producto(5.25f));
        carro.setProducto(new Producto(8.5f));

        SistemaVentas sistema = new SistemaVentas();
        sistema.setCarrito(1, carro);

        // Mostrando importe final del carrito en el sistema (llamada a getImporteCarrito de la clase SistemaVentas)
        System.out.printf("%.2f€\n", sistema.getImporteCarrito(1));
    }
}