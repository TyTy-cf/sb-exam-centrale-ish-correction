package fr.kevin.exam.controller;

import fr.kevin.exam.mapping.UrlRoute;
import fr.kevin.exam.service.ListingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class ListingController {

    private ListingService listingService;

    @GetMapping(UrlRoute.URL_LISTING_ID)
    public ModelAndView show(
            @PathVariable Long id,
            ModelAndView mav
    ) {
        mav.addObject("listing", listingService.getObjectById(id));
        mav.setViewName("listing/show");
        return mav;
    }

}