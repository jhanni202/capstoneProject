package org.launchcode.capstoneProject.controllers;

import org.launchcode.capstoneProject.models.Fav;
import org.launchcode.capstoneProject.models.User;
import org.launchcode.capstoneProject.models.data.FavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AuthenticationController authenticationController;

    @Autowired
    FavRepository favRepository;

    @GetMapping("")
    public String index(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);
        model.addAttribute("title", "Home");
        model.addAttribute("username",user.getUsername());
        model.addAttribute("favs",favRepository.findAll());









        return "index";
    }
}
