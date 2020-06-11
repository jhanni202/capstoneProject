package org.launchcode.capstoneProject.controllers;

import org.launchcode.capstoneProject.models.Fav;
import org.launchcode.capstoneProject.models.User;
import org.launchcode.capstoneProject.models.data.FavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class SearchController {

    @Autowired
    AuthenticationController authenticationController;

    @Autowired
    private FavRepository favRepository;

    @RequestMapping("search")
    public String index(Model model) {
        model.addAttribute("title", "Search");
        model.addAttribute(new Fav());
        return "search";
    }

    @PostMapping("search")
    public String addFav(HttpServletRequest request,@ModelAttribute @Valid Fav newFav,
                                         Errors errors, Model model) {
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);
        if (errors.hasErrors()) {
            return "search";
        }
        newFav.setUser_id(user.getId());
        favRepository.save(newFav);
        return "search";
    }


}
