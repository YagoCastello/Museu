package saloman.yago.musuem.Request;

import jakarta.validation.constraints.NotBlank;

public record ArtistaRequest(
        @NotBlank(message = "O nome e obrigatorio") String nome,
        String pseudonimo,
        String sexo,
        Integer anoNascimento,
        Integer anoFalecimento) {
}
