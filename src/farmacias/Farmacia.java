/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacias;

/**
 *
 * @author PadawanSistemas
 */
public class Farmacia {
    private String nombre;//Este campo es compartido por los 2 programas
    private double precio;
    private double impuesto;
    private int existencia;
    private int minimo;
    private int maximo;
    private String proveedor;
    private String unidades; //Simil con presentacion.
    private String caducidad;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * @return the minimo
     */
    public int getMinimo() {
        return minimo;
    }

    /**
     * @param minimo the minimo to set
     */
    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    /**
     * @return the maximo
     */
    public int getMaximo() {
        return maximo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    /**
     * @return the proveedor
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the unidades
     */
    public String getUnidades() {
        return unidades;
    }

    /**
     * @param unidades the unidades to set
     */
    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    /**
     * @return the caducidad
     */
    public String getCaducidad() {
        return caducidad;
    }

    /**
     * @param caducidad the caducidad to set
     */
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
   //Constructor de la clase farmacia
    public Farmacia(String nombre,double precio,double impuesto,int existencia,
    int minimo,int maximo,String proveedor,String unidades,String caducidad)
    {
    this.nombre=nombre;
    this.precio=precio;
    this.impuesto=impuesto;
    this.existencia=existencia;
    this.minimo=minimo;
    this.maximo=maximo;
    this.proveedor=proveedor;
    this.unidades=unidades;
    this.caducidad=caducidad;
    
   }        
    
    
}
