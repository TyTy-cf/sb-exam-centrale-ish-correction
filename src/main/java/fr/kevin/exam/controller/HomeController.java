package fr.kevin.exam.controller;

import fr.kevin.exam.service.ListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class HomeController {

    private ListingService listingService;

    @GetMapping("/")
    public ModelAndView index(ModelAndView mav) {
        mav.addObject("listings", listingService.findTop12ByOrderByCreatedAtDesc());
        mav.setViewName("index");
        return mav;
    }

}
