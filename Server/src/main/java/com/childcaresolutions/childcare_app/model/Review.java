
package com.childcaresolutions.childcare_app.model;

import com.childcaresolutions.childcare_app.enums.RatingEnums;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private RatingEnums rating; 
    private String comment; 
    
    //Una niñera puede recibir muchas reseñas
    @ManyToOne
    @JoinColumn(name = "nanny_id")

    private Nanny nanny;

    //Un padre puede elaborar muchas reseñas
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    
    
}
