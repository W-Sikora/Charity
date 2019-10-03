package pl.coderslab.charity.model.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "donations")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer quantity; // (liczba worków)

    private List<Category> categories; //(lista obiektów typu`Category`),pamiętaj o odpowiedniej adnotacji

    private Institution institution; //(obiekt typu `Institution`),pamiętaj o odpowiedniej adnotacji.
    private String street;
    private String city;
    private String zipCode;
    private LocalDateTime pickUpDate;
    private LocalDateTime pickUpTime;
    private String pickUpComment;


}
