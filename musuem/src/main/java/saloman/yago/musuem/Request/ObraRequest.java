package saloman.yago.musuem.Request;

import saloman.yago.musuem.Model.TipoObra;

public record ObraRequest(String titulo, String tamanho, int ano, TipoObra tipo) {
}
