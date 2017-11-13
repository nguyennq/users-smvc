package vn.nguyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.nguyen.dao.UserDao;
import vn.nguyen.model.User;
import vn.nguyen.services.UserService;

import java.util.List;

/**
 * Created by nals on 11/10/17.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", this.userService.listUsers());
        return "listUser";
    }

    /**
     * Rest web service
     */
    @RequestMapping(value = "/usersList", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getUsersRest() {
        return userService.listUsers();
    }

}
