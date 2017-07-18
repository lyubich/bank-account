package account.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by anastasia on 18.07.17.
 */

@RestController
public class ClientController {

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public String find_clients(final Model model) {
        return "List of clients!";
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    public String create_client() {
        return "Client has created!";
    }

    @RequestMapping(value = "/clients/{id:\\d+}", method = RequestMethod.PUT)
    public String update_client(@PathVariable(value = "id") Integer id, final Model model) {
        return "Client has updated!";
    }

    @RequestMapping(value = "/clients/{id:\\d+}", method = RequestMethod.DELETE)
    public String remove_client(@PathVariable(value = "id") Integer id, final Model model) {
        return "Client has removed!";
    }
}
