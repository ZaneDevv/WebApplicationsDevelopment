package compraonline;


/**
 * @author Álvaro Fernández Barrero
 */
public class PlataformaDeVenta
{
	// --------------------------
	// Atributos
	// --------------------------
	
	private String nombre;
	private Vendedor[] vendedores;
	
	// --------------------------
	// Constructor
	// --------------------------
	
	public PlataformaDeVenta(String nombre)
	{
		this.nombre = nombre.trim();
		this.vendedores = new Vendedor[10];
	}
	
	// --------------------------
	// Métodos
	// --------------------------
	
	public boolean registrarVendedor(Vendedor vendedor)
	{
		boolean sePuedeAnadir = this.vendedores[this.vendedores.length - 1] == null;
		boolean seAnadio = false;
		
		if (sePuedeAnadir)
		{			
			for (int i = 0; i < this.vendedores.length && !seAnadio; i++)
			{
				if (this.vendedores[i] == null)
				{
					seAnadio =  true;
					this.vendedores[i] = vendedor;
				}
			}
		}
		
		return sePuedeAnadir;
	}
	
	
	public String buscarProducto(String nombre)
	{
		nombre = nombre.trim();
		
		StringBuilder texto = new StringBuilder();
		String resultado = "Producto no disponible";
		
		boolean recorrioTodosLosVendedores = false;
		boolean recorrioTodosLosProductos = false;
		boolean encontroProducto = false;
		
		Vendedor vendedor;
		Producto[] productos;
		
		// Recorriendo todos los vendedores mientras no  se haya encontrado aún el producto
		for (int i = 0; !encontroProducto && (i < this.vendedores.length && !recorrioTodosLosVendedores); i++)
		{
			vendedor = this.vendedores[i];
			
			if (vendedor != null)
			{
				productos = this.vendedores[i].getProductosEnVenta();
				recorrioTodosLosProductos = false;
				
				// Recorriendo todos los productos del vendedor mientras no se haya encontrado aún el producto
				for (int j = 0; !encontroProducto && (j < productos.length && !recorrioTodosLosProductos); j++)
				{
					if (productos[j] != null)
					{
						if (productos[j].getNombre().equalsIgnoreCase(nombre))
						{
							encontroProducto = true;
							
							texto.append("Nombre del vendedor: ");
							texto.append(vendedor.getNombre());
							
							texto.append("\nID del vendedor: ");
							texto.append(vendedor.getId());
							texto.append("\n\n");
							
							texto.append(productos[j]);
							
							resultado = texto.toString();
						}
					}
					else
					{
						recorrioTodosLosProductos = true;
					}
				}
			}
			else
			{
				recorrioTodosLosVendedores = true;
			}
		}
		
		return resultado;
	}
	
	
	public String listarVendedores()
	{
		StringBuilder texto = new StringBuilder();
		boolean recorrioTodosLosVendedores = false;
		
		for (int i = 0; i < this.vendedores.length && !recorrioTodosLosVendedores; i++)
		{
			if (this.vendedores[i] != null)
			{
				texto.append("\n");
				texto.append(this.vendedores[i].getNombre());
			}
			else
			{
				recorrioTodosLosVendedores = true;
			}
		}
		
		return texto.toString();
	}
	
	
	public String listarProductos()
	{
		StringBuilder informacion = new StringBuilder();
		
		boolean recorrioTodosLosVendedores = false;
		boolean recorrioTodosLosProductos = false;
		
		Producto[] productos;
		
		for (int i = 0; i < this.vendedores.length && !recorrioTodosLosVendedores; i++)
		{
			if (this.vendedores[i] != null)
			{
				productos = this.vendedores[i].getProductosEnVenta();
				recorrioTodosLosProductos = false;
				
				for (int j = 0; j < productos.length && !recorrioTodosLosProductos; j++)
				{
					if (productos[j] != null)
					{
						informacion.append(productos[j]);
						informacion.append("\n*********************************************\n");
					}
					else
					{
						recorrioTodosLosProductos = true;
					}
				}
			}
			else
			{
				recorrioTodosLosVendedores = true;
			}
		}
		
		return informacion.toString();
	}
}