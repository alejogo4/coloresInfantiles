/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classDAO;

import classVO.Inventario;
import Clase.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


    
public class InventarioDAO {
    public static String actualizarProveedores(Inventario prod) {
        String result = null, last = null;
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE productos SET nombre=?,unidades=?,descripcion=?,precio=?,iva=?,activo=? WHERE IDproducto=?";
        try {
            System.out.println(sql);
            pst = cn.prepareStatement(sql);
            pst.setString(1, prod.getNombre());
            pst.setString(2, prod.getUnidades().toString());
            pst.setString(3, prod.getDescripcion());
            pst.setString(4, prod.getPrecio().toString());
            pst.setString(5, prod.getIva().toString());
            pst.setString(6, prod.getActivo());
           
            
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
    public static Inventario buscarProductos(String clave) {
        System.out.println(clave);
        Inventario prod = new Inventario();
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM productos WHERE IDproducto = ?";
        try {
            pst = cn.prepareStatement(sql);
            
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                
                prod.setIdproducto(Integer.parseInt(rs.getString(1)));
                prod.setNombre(rs.getString(2));
                prod.setUnidades(Integer.parseInt(rs.getString(3)));
                prod.setDescripcion(rs.getString(4));
                prod.setPrecio(Integer.parseInt(rs.getString(5)));
                prod.setIva(Integer.parseInt(rs.getString(6)));
                prod.setActivo(rs.getString(7));
                
                
   
            }
           
        } catch (SQLException e) {
            prod.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                prod.setResultado("Error: " + e);
            }
        }
        return prod;
    }
    
     public static ArrayList<Inventario> getListProductos() {
        ArrayList<Inventario> arrProv = new ArrayList<Inventario>();
        ConectaBD c = new ConectaBD();
        Connection cn  = c.getConnection();
        
        PreparedStatement pst = null;
        Inventario prov = null;
        String sql = "SELECT * FROM productos";
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                prov = new Inventario();
                prov.setIdproducto(Integer.parseInt(rs.getString(1)));
                prov.setNombre(rs.getString(2));
                prov.setUnidades(Integer.parseInt(rs.getString(3)));
                prov.setDescripcion(rs.getString(4));
                prov.setPrecio(Integer.parseInt(rs.getString(5)));
                prov.setIva(Integer.parseInt(rs.getString(6)));
                prov.setActivo(rs.getString(7));
                
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
