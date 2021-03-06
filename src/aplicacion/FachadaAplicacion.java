/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import gui.*;
import baseDatos.*;
import java.util.ArrayList;

/**
 *
 * @author ferho
 */
public class FachadaAplicacion {

    private gui.FachadaGui fgui;
    private FachadaBaseDatos fbd;
    private GestionUsuarios gUsuarios;
    private GestionPedidos gPedidos;
    private GestionEmpleados gEmpleados;

    public FachadaAplicacion() {
        fgui = new gui.FachadaGui(this);
        fbd = new FachadaBaseDatos(this);
        gUsuarios = new GestionUsuarios(fgui, fbd);
        gPedidos = new GestionPedidos(fgui, fbd);
        gEmpleados = new GestionEmpleados(fgui, fbd);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FachadaAplicacion fa;

        fa = new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }

    public void iniciaInterfazUsuario() {
        fgui.iniciaVista();
    }

    public void muestraExcepcion(String e) {
        //fgui.muestraExcepcion(e);
    }

    public Boolean comprobarAutentificacion(String idUsuario, String clave) {
        return gUsuarios.comprobarAutentificacion(idUsuario, clave);
    }

    public Usuario consultarUsuario(String idUsuario, String clave) {
        return gUsuarios.consultarUsuario(idUsuario, clave);
    }

    public boolean consultarId(String idUsuario) {
        return gUsuarios.consultarId(idUsuario);
    }

    public void actualizar(Usuario usuario) {
        gUsuarios.actualizar(usuario);
    }
    public void actualizarUsr(String id,Usuario usuario) {
        gUsuarios.actualizarUsr(id, usuario);
    }
    
    public void nuevoPedido(Pedido p)
    {
        gPedidos.nuevoPedido(p);
    }

    public Usuario registrarUsuario(String id, String clave, String dni, String nombre, String email, String direccion, String telefono, String sexo) {
        return gUsuarios.registrarUsuario(id, clave, dni, nombre, email, direccion, telefono, sexo);
    }
    
    public void eliminarUsuario(String id){
        gUsuarios.eliminarUsuario(id);
    }


    public java.util.List<Pedido> obtenerHistorialPedidos(String usuario) {
        return gPedidos.obtenerHistorialPedidos(usuario);
    }

    public java.util.List<Pedido> obtenerPedidosActivos(String usuario) {
        return gPedidos.obtenerPedidosActivos(usuario);
    }

    public Empleado nuevoEmpleado(String usuario, String password, String dni, String nombre, String correo, String direccion, String telefono, String sexo, int nomina, int anoIngreso, boolean administrador){
        return gEmpleados.nuevoEmpleado(usuario, password, dni, nombre, correo, direccion, telefono, sexo, nomina, anoIngreso, administrador);
    }
    
    public void actualizar(Empleado emp){
        gEmpleados.actualizar(emp);
    }
    
    public void actualizarEmpleado(String id, Empleado emp){
        gEmpleados.actualizarEmpleado(id, emp);
    }
    
    public void tramitarPedido(Integer pd) {
        gEmpleados.tramitarPedido(pd);
    }
    
    public void actualizarDireccion() {
        gEmpleados.actualizarDireccion();
    }
    
    public java.util.List<Paquete> comprobarLocalizacion(Integer codigo) {
        return fbd.comprobarLocalizacion(codigo);
    }

    public boolean esAdministrador(String id) {
        return fbd.esAdministrador(id);
    }

    public ArrayList<Empleado> obtenerEmpleados(String id, String nombre) {
        return fbd.obtenerEmpleados(id, nombre);
    }

    public ArrayList<Usuario> obtenerUsuarios(String id, String nombre) {
        return fbd.obtenerUsuarios(id, nombre);
    }

}
