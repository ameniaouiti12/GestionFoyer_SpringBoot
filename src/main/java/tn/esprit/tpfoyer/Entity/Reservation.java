package tn.esprit.tpfoyer.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Getter
@Setter
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Utiliser auto-incrément pour l'ID
    Long idReservation;  // Changer le type de String à Long si vous utilisez auto-incrément
    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany(mappedBy = "reservations")
    @JsonIgnore
    @ToString.Exclude
    Set<Etudiant> etudiants;
}
