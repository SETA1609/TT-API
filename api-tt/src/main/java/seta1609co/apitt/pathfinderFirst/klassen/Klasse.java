package seta1609co.apitt.pathfinderFirst.klassen;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Klasse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String description;



}
