/*
	Álvaro Fernández Barrero
	1º DAW BIL
*/

import java.util.Scanner;

import web.LayoutWeb;
import web.componentes.*;

public class Programa
{
	public static void main(String[] args)
	{
		// Variables
		
		Scanner input = new Scanner(System.in);
		
		boolean finalizarPrograma = false;
		int opcionMenuEscogida = 0;
		
		
		// Escribiendo programa por defecto
		
		LayoutWeb layout = new LayoutWeb();
		
		try
		{
			Componente componenteMultimedia0 = new ComponenteMultimedia("Banner Principal", "#id-001", 1200f, 400f, "https://images.com/banner.png");
			Componente componenteTexto0 = new ComponenteTexto("Caja de Contenidos", "#nav-002", 450f, 0f, "Escribe aquí...");
			
			layout.aniadirComponente(componenteMultimedia0);
			layout.aniadirComponente(componenteTexto0);
		}
		catch (Exception exception)
		{
			System.out.println("Ha ocurrido un error a la hora de insertar los componentes por defecto:");
			System.out.println(exception.getMessage());
		}
		
		layout.listarMaquetacion();

		
		// Menu
		
		do
		{
			System.out.println();
			System.out.println("1. Alta de Componentes");
			System.out.println("2. Limpiar Invisibles");
			System.out.println("3. Actualizar Dimensiones");
			System.out.println("4. Salir");
			System.out.println("Opcion:");
			
			try
			{
				opcionMenuEscogida = input.nextInt();
				
				switch (opcionMenuEscogida)
				{
					case 1:
						Componente nuevoComponente = null;
					
						System.out.println("*** NUEVO COMPONENTE ***");
						
						System.out.print("Nombre: ");
						input.nextLine();
						String nombre = input.nextLine();
						
						System.out.print("idCss: ");
						String idCss = input.nextLine();
						
						System.out.print("Alto: ");
						float alto = input.nextFloat();
						
						System.out.print("Ancho: ");
						float ancho = input.nextFloat();
						
						System.out.print("(1) Componente multimedia\n(2) Componente texto\nOpcion: ");
						int tipoComponente = input.nextInt();
					
						input.nextLine();
						try
						{
							if (tipoComponente == 1)
							{
								System.out.print("urlOrigen: ");
								String urlOrigen = input.nextLine();
								
								nuevoComponente = new ComponenteMultimedia(nombre, idCss, alto, ancho, urlOrigen);
							}
							else if (tipoComponente == 2)
							{
								System.out.print("Texto de contenido: ");
								String texto = input.nextLine();
								
								nuevoComponente = new ComponenteTexto(nombre, idCss, alto, ancho, texto);
							}
						}
						catch (Exception exception)
						{
							System.out.println("\nNo se pudo crear este componente:");
							System.out.println(exception.getMessage());
							System.out.println();
						}
					
						if (nuevoComponente != null)
						{
							layout.aniadirComponente(nuevoComponente);
						}
						layout.listarMaquetacion();
					
						break;
						
					case 2:
						System.out.println("*** LIMPIANDO INVISIBLES ***");
						
						layout.limpiarInvisibles();
						layout.listarMaquetacion();
						
						break;
						
					case 3:
						System.out.println("*** ACTUALIZANDO DIMENSIONES ***");
						
						System.out.print("idCSS: ");
						input.nextLine();
						String idCssABuscar = input.nextLine();
						
						System.out.print("Nuevo alto: ");
						float nuevoAlto = input.nextFloat();
					
						System.out.print("Nuevo ancho: ");
						float nuevoAncho = input.nextFloat();
						
						try
						{
							boolean seRedimensiono = layout.redimensionarComponente(idCssABuscar, nuevoAncho, nuevoAlto);
							
							if (!seRedimensiono)
							{
								System.out.println("\nEl componente no ha sido encontrado\n");
							}
						}
						catch (Exception exception)
						{
							System.out.println("\nNo se pudo redimensionar el componente:");
							System.out.println(exception.getMessage());
							System.out.println();
						}
						layout.listarMaquetacion();
						
						break;
						
					case 4:
						finalizarPrograma = true;
						break;
					
					default:
						System.out.println("\nOpción desconocida, escoge otra:");
				}
			}
			catch (Exception exception)
			{
				System.out.println("No se ha podido reconocer ese input, vuelva a intentarlo");
				input.nextLine();
			}
		}
		while (!finalizarPrograma);
		
		
		// Fin del programa
		
		System.out.println("El programa ha finalizado exitosamente");
		input.close();
	}
}