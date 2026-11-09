package saloman.yago.musuem.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import saloman.yago.musuem.Model.TipoObra;

public record ObraRequest(@NotBlank(message = "O titulo e obrigatorio") String titulo,
                          String tamanho,
                          Integer ano,
                          @NotNull(message = "O tipo da obra e obrigaorio") TipoObra tipo,
                          @NotNull(message = "O artista e obrigatorio") Long artistaId,
                          Long museuId) {
}
