/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.restaurant.bo;

import java.util.List;
import src.main.java.restaurant.db.VentaDAO;
import src.main.java.restaurant.dto.VentaDTO;

/**
 *
 * @author rotse
 */
public class VentaBO {
    
    public void saveVenta(List<VentaDTO> ventaList){
      VentaDAO ventasDao = new VentaDAO();
        if(ventaList!=null){
                for (VentaDTO venta : ventaList) {
                     ventasDao.saveVenta(venta.getMonto(), venta.getValoracion(), venta.getIdMenu()); 
                }
          
        }     
    }
   
}
