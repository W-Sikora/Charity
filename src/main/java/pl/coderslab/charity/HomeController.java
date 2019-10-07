package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.repositories.DonationRepository;
import pl.coderslab.charity.model.repositories.InstitutionRepository;

@Controller
public class HomeController {
    private DonationRepository donationRepository;
    private InstitutionRepository institutionRepository;

    public HomeController(DonationRepository donationRepository, InstitutionRepository institutionRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("noOfDonations", donationRepository.findAll().size());
        model.addAttribute("noOfOrganizations", institutionRepository.findAll().size());
        model.addAttribute("institutions", institutionRepository.findAll());
        return "index";
    }

}
