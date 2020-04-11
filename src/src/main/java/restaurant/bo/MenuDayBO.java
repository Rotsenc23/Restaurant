package src.main.java.restaurant.bo;

import java.util.List;
import src.main.java.restaurant.db.CategoriaDAO;
import src.main.java.restaurant.db.MenuDAO;
import src.main.java.restaurant.db.PlatoDAO;
import src.main.java.restaurant.dto.MenuPlatoDTO;

public class MenuDayBO {

    public void actionMenu(ActionType action, List<MenuPlatoDTO> menuPlatoList) {
        
        MenuDAO menuDao = new MenuDAO();
        PlatoDAO platoDao = new PlatoDAO();
        CategoriaDAO categotiaDao = new CategoriaDAO();
        
        if (action == ActionType.save && menuPlatoList != null) {
            for (MenuPlatoDTO menuPlato : menuPlatoList) {

                System.out.println("GUARDANDO MENU .....");
                menuDao.saveMenu(menuPlato.getFechaMenu(), menuPlato.getDescripcionMenu(), menuPlato.getPrecio(), menuPlato.getTiempoEspera());

                System.out.println("GUARDANDO PLATO..... MENU-ID " + menuDao.getMaxMenuId());
                platoDao.savePlato(menuPlato.getNombrePlato(), menuPlato.getRecetaPlato(), menuDao.getMaxMenuId());

                System.out.println("GUARDANDO CATEGORIA..... PLATO-ID " + platoDao.getMaxPlatoId());
                categotiaDao.saveCategoria(menuPlato.getCategoria(), platoDao.getMaxPlatoId());
            }

        }
    }
}
