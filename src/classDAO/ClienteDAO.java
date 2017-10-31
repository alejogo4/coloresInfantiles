/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classDAO;

import classVO.Clientes;
import Clase.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ClienteDAO {
    
    public static String eliminarProveedores(String clave) {
        System.out.println(clave);
        String result = null;
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        PreparedStatement pst = null;
        String sql = "DELETE FROM clientes WHERE idclient=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(clave));
            pst.executeUpdate();
            result = "Proveedor eliminado con exito";
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }
    
    public static String actualizarProveedores(Clientes prov) {
        String result = null, last = null;
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE clientes SET nombre=?,apellido=?,nit=?,celular=?,direccion=?,ciudad=?,email=? WHERE idclient=? ";
        try {
            
            System.out.println(sql);
            pst = cn.prepareStatement(sql);
            pst.setString(1, prov.getNombre());
            pst.setString(2, prov.getApellido());
            pst.setString(3, prov.getNit());
            pst.setString(4, prov.getTelefono());
            pst.setString(5, prov.getDireccion());
            pst.setString(6, prov.getCiudad());
            pst.setString(7, prov.getEmail());
            pst.setInt(8, prov.getId());
            pst.execute();

            //result = "Proveedor actualizado con exito, ID:" + prov.getId_proveedor();
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }
    
    public static Clientes buscarProveedores(String clave) {
        System.out.println(clave);
        Clientes prov = new Clientes();
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM clientes WHERE idclient = ?";
        try {
            pst = cn.prepareStatement(sql);
            
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                
                prov.setId(Integer.parseInt(rs.getString(1)));
                prov.setNombre(rs.getString(2));
            prov.setApellido(rs.getString(3));
                prov.setNit(rs.getString(4));
                prov.setTelefono(rs.getString(5));
                 prov.setDireccion(rs.getString(6));
                 prov.setCiudad(rs.getString(7));
                prov.setEmail(rs.getString(8));
   
            }
           
        } catch (SQLException e) {
            prov.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                prov.setResultado("Error: " + e);
            }
        }
        return prov;
    }
    
    public static ArrayList<Clientes> getListClientes() {
        ArrayList<Clientes> arrProv = new ArrayList<Clientes>();
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        
        PreparedStatement pst = null;
        Clientes prov = null;
        String sql = "SELECT * FROM clientes";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                prov = new Clientes();
                prov.setId(Integer.parseInt(rs.getString(1)));
                prov.setNombre(rs.getString(2));
                prov.setEmail(rs.getString(3));
                prov.setApellido(rs.getString(4));
                prov.setCiudad(rs.getString(5));
                prov.setTelefono(rs.getString(6));
                prov.setDireccion(rs.getString(7));
                prov.setNit(rs.getString(8));
                if (arrProv.isEmpty()) {
                    arrProv.add(0, prov);
                } else {
                    arrProv.add(prov);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        return arrProv;
    }
}
