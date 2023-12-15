package EDAO;

import java.util.List;

import DAO.UsuarioDAO;
import Ver.Prestamo;
import Ver.Usuario;
import Vistas.UsuarioVista;

public class UsuarioControlador {
	private UsuarioDAO usuariodao;
	private Usuario usuario;
	private UsuarioVista usuariovista;
	public UsuarioControlador(UsuarioDAO usuariodao, UsuarioVista usuariovista) {
		this.usuariodao=usuariodao;
		this.usuariovista=usuariovista;
	}
	//Agrega usuario a la lista 
	public void crearUsuario(Usuario usuario) {
		this.usuario=usuario;
		usuariodao.agregarUsuario(usuario);
	}
	//Actualiza un Usuario
	public void atualizarUsuario() {
		usuario=usuariovista.cambiarDatosUsuario();
		if(usuariodao.actualizarUsuario(usuario.getId(), usuario) == true){
            usuariovista.mostrarM("Los datos se han actualizado.");                    
        }
		else{
            usuariovista.mostrarM("Ocurrio un error.");                    
        
        }
	}
	//Agrega prestamo a la lista 
	public void agregarPrestamo(Usuario usuario,Prestamo prestamo) {
		usuario.setListaPrestamos(prestamo,true);
	}
	//Elimina prestamo a la lista 
	public void eliminarPrestamo(Usuario usuario, Prestamo prestamo) {
		usuario.setListaPrestamos(prestamo,false);
	}
	//Elimina un usuario 
	public void eliminarUsuario(){
        int id = usuariovista.eliminarUsuario();
        if(usuariodao.eliminarUsuario(id) == true){
            usuariovista.mostrarM("Usuarios eliminado.");                    
        }
        else{
            usuariovista.mostrarM("Ocurrio un error.");
        }
    }
	//Busca un usuario con el id
	public void buscarUsuario() {
		int id = usuariovista.buscarUsuario();
        usuario = usuariodao.obtenerUsuario(id);
        if(usuario == null){
            usuariovista.mostrarM("Usuario no encontrado");
        }else{
            usuariovista.mostrarInformacion(usuario.getNombre(),usuario.getCorreo(),usuario.getId());
        }
    }
	//Muestra los usuarios registrados
	public void mostrarUsuarios(){
        List<Usuario> listaUsuarios = usuariodao.obtenerUsuarios();
        for (Usuario usuario : listaUsuarios) {
            usuariovista.mostrarInformacion(usuario.getNombre(),usuario.getCorreo(),usuario.getId());
        }
	}
	//Devuelve toda la lista de prestamos
	public List<Prestamo> mostrarPrestamos(Usuario usuario) {
		return usuario.getListaPrestamos();
	}
}