package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.model.entities.Donation;
import pl.coderslab.charity.model.entities.Institution;
import pl.coderslab.charity.model.repositories.CategoryRepository;
import pl.coderslab.charity.model.repositories.DonationRepository;
import pl.coderslab.charity.model.repositories.InstitutionRepository;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@Controller
public class DonationController {
    private DonationRepository donationRepository;
    private InstitutionRepository institutionRepository;
    private CategoryRepository categoryRepository;

    public DonationController(DonationRepository donationRepository, InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping("/form")
    public String form(Model model) {
        model.addAttribute("donations", new Donation());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("institutions", institutionRepository.findAll());
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String processForm(HttpServletRequest request) {
        Integer noOfDonation = donationRepository.findAll().size();
        Donation donation = new Donation();
//        donation.setInstitution((Institution) request.getParameter("institution"));
//        donation.setStreet(request.getParameter("street"));
//        donation.setCity(request.getParameter("city"));
//        donation.setZipCode(request.getParameter("zipCode"));
//        donation.setPickUpDate( request.getParameter("pickUpDate"));
//        donation.setPickUpTime((LocalDateTime) request.getParameter(""));
//        donation.setPhone(request.getParameter("phone"));
//        donation.setPickUpComment(request.getParameter("comment"));
        return "";


    }
}
