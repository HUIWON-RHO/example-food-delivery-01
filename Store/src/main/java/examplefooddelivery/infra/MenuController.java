package examplefooddelivery.infra;
import examplefooddelivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/menus")
@Transactional
public class MenuController {
    @Autowired
    MenuRepository menuRepository;



    @RequestMapping(value = "menus/{id}/addmenu",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Menu addMenu(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /menu/addMenu  called #####");
            Optional<Menu> optionalMenu = menuRepository.findById(id);
            
            optionalMenu.orElseThrow(()-> new Exception("No Entity Found"));
            Menu menu = optionalMenu.get();
            menu.addMenu();
            
            menuRepository.save(menu);
            return menu;
            
    }
    



}
