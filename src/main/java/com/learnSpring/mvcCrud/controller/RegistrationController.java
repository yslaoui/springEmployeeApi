package com.learnSpring.mvcCrud.controller;

import com.learnSpring.mvcCrud.dao.UserDao;
import com.learnSpring.mvcCrud.entity.User;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private Logger logger =Logger.getLogger(getClass().getName());
    private UserDao userDao;

    public RegistrationController(UserDao userDao) {
        this.userDao = userDao;
    }

    // trimming for inputs from whitespaces
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showRegistrationForm")
    public String showMyloginPage(Model theModel) {
        theModel.addAttribute("User", new User());
        logger.info("Registration button clicked, showing the registration form");
        return "register/registration-form";
    }

    @PostMapping("/processRegistrationForm")
    public String processRegistrationForm(
            @Valid @ModelAttribute("User") User theUser,
            BindingResult theBindingResult,
            HttpSession httpSession,
            Model theModel) {

        String userName = theUser.getUserName();
        logger.info("processing registration form for: " + userName);

        // form validation
        if (theBindingResult.hasErrors()) {
            return "register/registration-form";
        }

        // Check in database if user already exists
        User existing = this.userDao.findByUserName(userName);
        if (existing != null) {
            theModel.addAttribute("User", new User());
            theModel.addAttribute("registrationError", "user name already exists");
            logger.warning("user already exists");
            return "register/registration-form";
        }

        // create user and save it in database
        this.userDao.save(theUser);
        logger.info("successfully created the user " + theUser);

        // place user in http web session in the server -- only for basic auth
        httpSession.setAttribute("User", theUser);

        return "register/registration-confirmation";

    }



}
