package src.main.java.restaurant.bo;

import java.util.List;
import javax.swing.JTable;
import src.main.java.restaurant.db.CategoriaDAO;
import src.main.java.restaurant.db.MenuDAO;
import src.main.java.restaurant.db.PlatoDAO;
import src.main.java.restaurant.dto.MenuPlatoDTO;

public class MenuDayBO {

    public void saveMenu( List<MenuPlatoDTO> menuPlatoList) {
        MenuDAO menuDao = new MenuDAO();
        PlatoDAO platoDao = new PlatoDAO();
        if (menuPlatoList != null) {
            for (MenuPlatoDTO menuPlato : menuPlatoList) {
                System.out.println("GUARDANDO");
                menuDao.saveMenu(menuPlato.getFechaMenu(), menuPlato.getDescripcionMenu(), menuPlato.getPrecio(), menuPlato.getTiempoEspera());
                platoDao.savePlato(menuPlato.getNombrePlato(), menuPlato.getRecetaPlato(), menuDao.getMaxMenuId());
                new CategoriaDAO().saveCategoria(menuPlato.getCategoria(), platoDao.getMaxPlatoId());  
                System.out.println("GUARDADO OK");
            }
        }  
    }  
    //Load in table
    public void getMenu(JTable table,String date){
          new MenuDAO().getMenu(table, date);
    }
    
}
