package com.mycompany.practicabryanlonda;
import clases.Carrito;
import clases.Pedido;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		//Se crea una variable para el bucle, se instancia la clase Producto y se crea el ArrayList producto y total
		//Estas se usan mas adelante en el oodigo
		int val=1;
		int total=0;
		ArrayList<String> producto=new ArrayList<>();
		//Bucle while para poder repetir el menu
		
		while(val==1) {
			System.out.println("-------Menu---------------");
			System.out.println("| 1. Registrarse   |");
			System.out.println("| 2. Salir               |");
			System.out.println("--------------------------");
			System.out.println();
			//Se solicita una entrada mediante la clase Scanner
			System.out.print("Ingrese la opcion a realizar:");
			Scanner e=new Scanner(System.in);
			int ent=e.nextInt();
			System.out.println();
			//Se utilizan varios if's para cada opcion del menu 
			//En caso de poner una opcion que no esta en el menu, se muestra un mensaje de error 
			if(ent<1||ent>2) {
				System.out.println("Error, presione Enter para continuar");
				System.out.println();
			}
			if(ent==1) {
				//Se instancia un nuevo usuario, luego se nombran sus atributos
				Usuario usuarioUno= new Usuario();
			
				System.out.println("Nombre:");
				Scanner n1 = new Scanner(System.in);
				String nombre = n1.nextLine();
				usuarioUno.setNombre(nombre);
				
				System.out.println("Edad:");
				Scanner e1=new Scanner(System.in);
				Integer edad = e1.nextInt();
				usuarioUno.setEdad(edad);
				
				System.out.println("Usuario:");
				Scanner p1=new Scanner(System.in);
				String usuario = p1.nextLine();
				usuarioUno.setUsuario(usuario);
				//Una vez nombrados se instancia un carrito
				Carrito c1=new Carrito();
				//Se agrega el usuario al ArrayList de usuarios en el carrito
				c1.setNombreU(usuario);
				val=2;
				//Este ArrayList se encuentra en la clase carrito, asi que se usa el metodo de esa clase
				//para buscarlo dentro del ArrayList
				int user=c1.buscarUsuario(usuario);
				//Se abre otro while, el cual manejara el segundo menu, que ya tendra las opciones desbloqueadas
				while(val==2) {
					System.out.println("---------");
					//El usuario registrado inicia sesion
					//En esta linea se usa un metodo de la clase carrito para obtener el nombre de usuario
					//Esta variable user sirve mas adelante, al agregar mas de un usuario se usa la variable 
					//para buscarlo en el Array de usuarios y de esta forma obtener el carrito vinculado al usuario
					System.out.println("|Usuario | "+c1.mostrarUsuario(user));
					System.out.println("|------------Menu-----------------|");
					System.out.println("| 1. Registrar usuario nuevo      |");
					System.out.println("| 2. Ver productos                |");
					System.out.println("| 3. Cambiar de usuario           |");
					System.out.println("| 4. Realizar pedido              |");
					System.out.println("| 5. Salir                        |");
					System.out.println("|---------------------------------|");
					System.out.println();
					//Se solicita la entrada 
					System.out.print("Ingrese la opcion:");
					Scanner e2=new Scanner(System.in);
					int entrada=e2.nextInt();
					//Un if en caso de dar una entrada que no se encuentra en el menu
					if(entrada<1||entrada>5) {
						System.out.println("Error, presione Enter para continuar");
						System.out.println();
					}

					if(entrada==1) {
						//Aqui se instancia otro usuario
						System.out.println("Nombre:");
						String nombre2 = n1.nextLine();
						usuarioUno.setNombre(nombre2);
						
						System.out.println("Edad:");
						Integer edad2 = e1.nextInt();
						usuarioUno.setEdad(edad2);
						int vu=1;
						while(vu==1) {
							//En este bucle se comprueba que el usuario ingresado no este actualmente registrado en el sistema 
							System.out.println("Usuario:");
							Scanner u=new Scanner(System.in);
							String usuario2 = u.nextLine();
							usuarioUno.setUsuario(usuario2);
							//Se llama al metodo de la clase carrito que retorna un booleano, en caso de ser false
							if((c1.comprobarUsuario(usuario2))==false) {
								c1.setNombreU(usuario2);
								System.out.println();
								System.out.println("Usuario registrado!");
								//Se busca el usuario en el Array y user pasa a valer la posicion del usuario en el Array
								user=c1.buscarUsuario(usuario2);
								System.out.println("Presione Enter para continuar");
								vu=0;
							}
							else {
								//En caso de que el usuario ingresado ya este registrado se muestra un mensaje
								System.out.println();
								System.out.println("Usuario ya registrado.");
								System.out.println("Presione Enter para continuar");
							}
						}
					}
					if(entrada==2){
						//Se limpia el ArrayList de productos, esto para evitar que se agreguen productos que existian antes en el Array
						producto.clear();
					}
					while(entrada==2) {
						//Ahora se usa la clase producto,
						//Se llama al metodo verProductos de la clase Producto, 
						Principal.verProductos();
						System.out.println();
						System.out.println("Digite el item a añadir al carrito o digite 0 para salir");
						System.out.println();
						Scanner es=new Scanner(System.in);
						int entr=es.nextInt();
						//De nuevo se usan if's para las diferentes opciones 
						if(entr<0||entr>3) {
							System.out.println("Entrada Invalida");
							System.out.println();
						}
						//En caso de ingresar 0, se usa break para romper el bucle while 
						if(entr==0) {
							break;
						}
						//Para cada opcion, se manda el String que es el nombre del producto al ArrayList que se instancio al principio de la clase
						//Ademas se va sumando al total a pagar 
						if(entr==1) {
							producto.add("libro");
							total=total+20;
						}
						if(entr==2) {
							producto.add("album");
							total=total+45;
						}
						if(entr==3) {
							producto.add("computador");
							total=total+600;
						}
					}
					if(entrada==2) {
						//Luego se agrega el producto al ArrayList de carritos de la clase carrito
						c1.agregarProducto(producto, user);
						//Se envia el total sumado al metodo asignarTotal y luego se iguala a 0 ese total
						c1.asignarTotal(user, total);
						total=0;
						System.out.println("Productos agregados al Carrito");
					}
					while(entrada==3) {
						//En este espacio se llama al usuario, 
						System.out.println();
						System.out.println("Ingrese su usuario");
						Scanner u=new Scanner(System.in);
						String usr=u.nextLine();
						//En caso de no encontrarlo se muestra un mensaje y se vuelve a pedir que ingrese el usuario
						if(c1.buscarUsuario(usr)==(-1)) {
							System.out.println("Usuario no enontrado");
						}
						else{
							//Si el usuario se encuentra registrado, la variable user pasa a valer la posicion del usuario en el ArrayList de usuarios
							user=c1.buscarUsuario(usr);
							break;
							}
					}

					if(entrada==4) {
						//Para realizar el pedido, se crea un ArrayList en el que se guardara el ArrayList de productos,
						ArrayList np=c1.getCarrito(user);
						//Se instancia un nuevo pedido 
						Pedido pe=new Pedido(np,c1.mostrarUsuario(user));
						//Se llama al metodo que abstrae el total asignado al usuario en la clase carrito
                                                c1.getTotal(user);
						//Se llama al metodo que muestra todos los datos del Pedido
						pe.realizarPedido(total);
					}
					//Se cierra el bucle del segundo menu
					if(entrada==5) {
						val=0;
					}
				}
			}
			//Se cierra el bucle del primer menu
			if(ent==2) {
				val=0;
			}
			
		}
	}

    private static void verProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Usuario {

        public Usuario() {
        }

        private void setUsuario(String usuario) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setEdad(Integer edad) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setNombre(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }






    }
}