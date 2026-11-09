package saloman.yago.musuem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "museu")
public class Museu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;
    private Integer fundado;

    @Column(name = "media_de_visitas_mensal")
    private double mediaDeVisitasMensal;
    private String site;

    @OneToMany(mappedBy = "museu")
    private List<Obra> obras = new ArrayList<>();

}
