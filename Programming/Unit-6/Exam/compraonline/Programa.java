/*
Álvaro Fernández Barrero
1º DAW BIL
26/02/2026
*/
package compraonline;

import java.util.Scanner;


public class Programa
{
	public static void main(String[] args)
	{
		// Creación de variables y objetos
		
		Scanner input = new Scanner(System.in);
		
		String nombrePlataforma = "";
		String nombreProducto = "";
		
		
		try
		{
			// Creando productos

			Producto bicicleta = new Producto("Bicicleta", "Canyon", "23/02/2026");
			Producto patines = new Producto("Patines", "Toys", "23/02/2026");
			Producto gafas = new Producto("Gafas", "RayBam", "23/02/2026");
			
			// Creando vendedores
		
			Vendedor vendedor1 = new Vendedor("Luis");
			Vendedor vendedor2 = new Vendedor("Ana");
			
			// Añadiendo productos a vendedores
			
			vendedor1.anadirProducto(bicicleta);
			vendedor1.anadirProducto(patines);
			
			vendedor2.anadirProducto(gafas);
			
			// Creando plataforma
			
			System.out.print("\nIndica el nombre de su plataforma: ");
			nombrePlataforma = input.nextLine();
			
			PlataformaDeVenta plataforma = new PlataformaDeVenta(nombrePlataforma);
			
			// Registrando vendedores
			
			plataforma.registrarVendedor(vendedor1);
			plataforma.registrarVendedor(vendedor2);
			
			// Mostrando vendedores registrados en la plataforma
			
			System.out.println("\nVENDEDORES REGISTRADOS:");
			System.out.println(plataforma.listarVendedores());
			
			// Mostrando productos en venta
			
			System.out.println("\n\nPRODUCTOS A LA VENTA:\n");
			System.out.println(plataforma.listarProductos());
			
			// Buscando producto
			
			System.out.print("Inserte el nombre del producto que quiera buscar: ");
			nombreProducto = input.nextLine();
			
			System.out.println(plataforma.buscarProducto(nombreProducto));
			
			// Eliminando un producto
			
			vendedor1.eliminarProducto(patines);
			System.out.print("\nProducto patines eliminado\n");
			
			// Mostrando productos en venta
			
			System.out.println("\n\nPRODUCTOS A LA VENTA:\n");
			System.out.println(plataforma.listarProductos());
		}
		catch (Exception excepcion)
		{
			System.out.println(excepcion);
		}
		
		
		input.close();
	}
}