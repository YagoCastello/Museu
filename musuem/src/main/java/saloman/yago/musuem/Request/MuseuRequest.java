package saloman.yago.musuem.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record MuseuRequest(
        @NotBlank(message = "O nome e obrigatorio") String nome,
        String localizacao,
        Integer fundado,
        @PositiveOrZero(message = "A media de visitas nao pode ser negativa") Double mediaDeVisitasMensal,
        String site
) {
}
