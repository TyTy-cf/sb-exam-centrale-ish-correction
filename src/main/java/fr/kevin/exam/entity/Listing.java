package fr.kevin.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private int producedYear;

    private long mileage;

    private double price;

    @CreationTimestamp
    private Date createdAt;

    private String image;

    @ManyToOne
    private Model model;

    @ManyToOne
    private User user;

}