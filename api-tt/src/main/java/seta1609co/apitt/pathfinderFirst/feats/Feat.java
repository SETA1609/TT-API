package seta1609co.apitt.pathfinderFirst.feats;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Feat {

    @Id
    private int id;

    private String description;



}
