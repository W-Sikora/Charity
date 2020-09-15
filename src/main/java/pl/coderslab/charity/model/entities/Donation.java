package pl.coderslab.charity.model.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @ManyToMany
    private List<Category> categories;

    @ManyToOne
    private Institution institution;

    private String street;

    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "pick_up_date")
    private LocalDate pickUpDate;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "pick_up_time")
    private LocalTime pickUpTime;

    private String phone;

    @Column(name = "pick_up_comment")
    private String pickUpComment;

    public Donation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPickUpComment() {
        return pickUpComment;
    }

    public void setPickUpComment(String pickUpComment) {
        this.pickUpComment = pickUpComment;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", categories=" + categories +
                ", institution=" + institution +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", pickUpDate=" + pickUpDate +
                ", pickUpTime=" + pickUpTime +
                ", phone='" + phone + '\'' +
                ", pickUpComment='" + pickUpComment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(id, donation.id) &&
                Objects.equals(quantity, donation.quantity) &&
                Objects.equals(categories, donation.categories) &&
                Objects.equals(institution, donation.institution) &&
                Objects.equals(street, donation.street) &&
                Objects.equals(city, donation.city) &&
                Objects.equals(zipCode, donation.zipCode) &&
                Objects.equals(pickUpDate, donation.pickUpDate) &&
                Objects.equals(pickUpTime, donation.pickUpTime) &&
                Objects.equals(phone, donation.phone) &&
                Objects.equals(pickUpComment, donation.pickUpComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, categories, institution, street, city, zipCode, pickUpDate, pickUpTime, phone, pickUpComment);
    }
}
