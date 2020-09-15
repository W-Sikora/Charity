package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.model.entities.Donation;
import pl.coderslab.charity.model.repositories.CategoryRepository;
import pl.coderslab.charity.model.repositories.DonationRepository;
import pl.coderslab.charity.model.repositories.InstitutionRepository;

import javax.validation.Valid;

@Controller
public class DonationController {
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final CategoryRepository categoryRepository;

    public DonationController(DonationRepository donationRepository,
                              InstitutionRepository institutionRepository,
                              CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping("/form")
    public String form(Model model) {
        model.addAttribute("donations", new Donation())
                .addAttribute("categories", categoryRepository.findAll())
                .addAttribute("institutions", institutionRepository.findAll());
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String processForm(@Valid Donation newDonation) {
        donationRepository.save(newDonation);
        return "redirect:/";
    }
}
