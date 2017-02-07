package epn;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		int opcion, opciones;
		do{
			Object[] botones={"Lista de Alumnos", "lista de Compras"};
			opciones=JOptionPane.showOptionDialog(null, "Que Lista desea","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,botones, botones[0]);
			
			switch(opciones){
			case 0:{
		// **************************Aplicación para Alumnos****************************/
			
				ListaAlumnos x = new ListaAlumnos();
				
				// Añdiendo datos a la lista
				System.out.println("\nLista de Estudiantes:");
				x.AgregarAlumno(new Alumno("Mary", "0501598411"));
				x.AgregarAlumno(new Alumno("Tony", "0501801468"));
				x.AgregarAlumno(new Alumno("Criss", "1723464465"));
				System.out.print(x.toString() + "\n");
				
				// Buscando y Agregando datos repetidos
				System.out.println("Agregando dato repetido...");
				Alumno a1 = new Alumno("Mary", "0501598411");
				System.out.println(a1.toString());
				System.out.println("Buscando estudiante...");
				if (x.BuscarAlumno(a1.getCedula()) == null) {
					System.out.println("No hay registros con C.I: " + a1.getCedula() + "\n");
					x.AgregarAlumno(a1);
					System.out.println("Lista actual:\n" + x.toString() + "\n");
				} else {
					System.out.println("Estudiante con C.I: " + a1.getCedula() + " ya está registrado\n");
					System.out.println("Lista actual:\n" + x.toString() + "\n");
				}
			
				// Agregando un dato nuevo
				
				System.out.println("\nAgregndo un nuevo dato:");
				Alumno a2 = new Alumno("Jessy", "1725404355");
				System.out.println(a2.toString());
				if (x.BuscarAlumno(a2.getCedula()) == null) {
					System.out.println("No hay registros con C.I: " + a2.getCedula() + "\n");
					x.AgregarAlumno(a2);
					System.out.println("Lista actual:\n" + x.toString() + "\n");
				} else {
					System.out.println("Estudiante con C.I: " + a2.getCedula() + " ya está registrado\n");
					System.out.println("Lista actual:\n" + x.toString() + "\n");
				}
				break;
			}
			
			
			case 1:{
 
							// **************************Aplicación para Compras****************************/
				ListaCompras listaCircular = new ListaCompras();

				listaCircular.insertarAlFinal("2,Vasos");
				listaCircular.insertarAlFinal("5,Leche");
				listaCircular.insertarAlFinal("8,Cola");
				listaCircular.insertarAlFinal("9,Cereal");
				listaCircular.insertarAlFinal("10,Queso");
				listaCircular.insertarAlFinal("3,Aceite");
				listaCircular.insertarAlFinal("7,Galletas");
				listaCircular.insertarAlFinal("6,Escoba");
				listaCircular.insertarAlFinal("4,Detergente");
				listaCircular.insertarAlFinal("13,Yogurt");

				System.out.println("********************************************");
				System.out.println("********************************************");
				System.out.println("LISTA DE PRODUCTOS EN LA TIENDA");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				listaCircular.imprimir();
				System.out.println("********************************************");

				System.out.println("********************************************");
				System.out.println("Lista de productos a comprar ");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("   [CANT/PRODUCTO]\n");
				listaCircular.comprar("3,Yogurt");
				listaCircular.comprar("4,Cola");
				listaCircular.comprar("2,Pan");
				listaCircular.comprar("5,Escoba");
				listaCircular.comprar("3,Queso");
				listaCircular.comprar("4,Aceite");
				System.out.println(listaCircular.productosComprados());
				System.out.println("********************************************");

				System.out.println("********************************************");
				System.out.println("INVENTARIO ACTUAL");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				listaCircular.imprimir();
				System.out.println("********************************************");
				
				break;
			}
				
			} 
			opcion=JOptionPane.showConfirmDialog(null, "Volver a seleccionar otra lista", "Continuar",JOptionPane.YES_NO_OPTION);
		}while(opcion==JOptionPane.YES_NO_OPTION);	

	}

}
