/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classVO;

/**
 *
 * @author Hector David
 */
public class Inventario {
    private Integer idproducto;
    private String nombre;
    private Integer unidades;
    private String descripcion;
    private Integer precio;
    private Integer iva;
    private String activo;

    public Integer getIdproducto() {
        return idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getIva() {
        return iva;
    }

    public String getActivo() {
        return activo;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
   public String getResultado() {
        return "Hola";
    }
     public void setResultado(String busqueda_exitosa) {
      
    }

}
