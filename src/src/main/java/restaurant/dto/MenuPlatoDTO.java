package src.main.java.restaurant.dto;

public class MenuPlatoDTO {

    //INFORMACION MENU  
    private Integer idMenu;
    private String fechaMenu;
    private String descripcionMenu;
    private Double precio;
    private Integer tiempoEspera;
    
    //INFORMACION PLATO
    private String nombrePlato;
    private String recetaPlato;
    
    //INFORMACION CATEGORIA
    private String categoria;

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }
    
    public Integer getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(Integer tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFechaMenu() {
        return fechaMenu;
    }

    public void setFechaMenu(String fechaMenu) {
        this.fechaMenu = fechaMenu;
    }

    public String getDescripcionMenu() {
        return descripcionMenu;
    }

    public void setDescripcionMenu(String descripcionMenu) {
        this.descripcionMenu = descripcionMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getRecetaPlato() {
        return recetaPlato;
    }

    public void setRecetaPlato(String recetaPlato) {
        this.recetaPlato = recetaPlato;
    }

}
