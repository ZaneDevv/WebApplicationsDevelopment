package compraonline;


/**
 * @author Álvaro Fernández Barrero
 */
public class Vendedor
{
	// --------------------------
	// Atributos
	// --------------------------
	
	private String nombre;
	private int idVendedor;
	private Producto[] productosEnVenta;
	
	private static int cantidadVendedores = 0;
	
	// --------------------------
	// Constructor
	// --------------------------
	
	public Vendedor(String nombre)
	{
		Vendedor.cantidadVendedores++;
		
		this.nombre = nombre.trim();
		this.idVendedor = Vendedor.cantidadVendedores;
		this.productosEnVenta = new Producto[5];
	}
	
	// --------------------------
	// Métodos
	// --------------------------
	
	public boolean anadirProducto(Producto producto)
	{
		boolean sePudoAnadirProducto = false;
		boolean seAnadio = false;
		
		if (this.productosEnVenta[4] == null)
		{
			sePudoAnadirProducto = true;
			
			for (int i = 0; i < this.productosEnVenta.length && !seAnadio; i++)
			{
				if (this.productosEnVenta[i] == null)
				{
					this.productosEnVenta[i] = producto;
					seAnadio = true;
				}
			}
		}
		
		return sePudoAnadirProducto;
	}
	
	
	public boolean eliminarProducto(Producto producto)
	{
		boolean seElimino = false;
		
		for (int i = 0; i < this.productosEnVenta.length && !seElimino; i++)
		{
			if (this.productosEnVenta[i] == producto)
			{
				seElimino = true;
				
				for (int j = i + 1; j < this.productosEnVenta.length; j++)
				{
					this.productosEnVenta[j - 1] = this.productosEnVenta[j];
				}
				this.productosEnVenta[this.productosEnVenta.length - 1] = null;
			}
		}
		
		return seElimino;
	}
	
	
	public Producto buscarProducto(String nombre)
	{
		Producto producto = null;
		boolean sePuedeEncontrar = true;
		
		for (int i = 0; i < this.productosEnVenta.length && producto == null && sePuedeEncontrar; i++)
		{
			if (this.productosEnVenta[i] == null)
			{
				sePuedeEncontrar = false;
			}
			else if (this.productosEnVenta[i].getNombre().equalsIgnoreCase(nombre))
			{
				producto = this.productosEnVenta[i];
			}
		}
		
		return producto;
	}
	
	
	public String listarProductos()
	{
		boolean terminaronProductos = false;
		StringBuilder lista = new StringBuilder();
		
		for (int i = 0; i < this.productosEnVenta.length && !terminaronProductos; i++)
		{
			Producto producto = this.productosEnVenta[i];
			
			if (producto != null)
			{
				lista.append("\n\n");
				lista.append(producto);
			}
			else
			{
				terminaronProductos = true;
			}
		}
		
		return lista.toString();
	}
	
	
	public String toString()
	{

		StringBuilder text = new StringBuilder();
		
		text.append("Nombre: ");
		text.append(this.nombre);
		text.append("\nID: ");
		text.append(this.idVendedor);
		text.append(this.listarProductos());
		
		return text.toString();
	}
	
	// --------------------------
	// Getters & setters
	// --------------------------
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getId()
	{
		return this.idVendedor;
	}
	
	public Producto[] getProductosEnVenta()
	{
		return this.productosEnVenta;
	}
}