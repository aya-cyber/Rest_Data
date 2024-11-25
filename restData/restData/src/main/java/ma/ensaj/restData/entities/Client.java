package ma.ensaj.restData.entities;

import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;

    @OneToMany(mappedBy = "client", fetch=FetchType.EAGER)
    private List<Compte> comptes;

    public Client(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
}