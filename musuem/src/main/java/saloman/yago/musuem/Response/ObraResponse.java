package saloman.yago.musuem.Response;

import saloman.yago.musuem.Model.Obra;
import saloman.yago.musuem.Model.TipoObra;

public record ObraResponse(Long id, String titulo, String tamanho, Integer ano, TipoObra tipo,
                           Resumo artista, Resumo museu) {

    /** Versao enxuta de artista/museu para nao repetir todos os campos dentro da obra. */
    public record Resumo(Long id, String nome) {
    }

    public static ObraResponse de(Obra o) {
        Resumo artista = new Resumo(o.getArtista().getId(), o.getArtista().getNome());
        Resumo museu = o.getMuseu() == null ? null : new Resumo(o.getMuseu().getId(), o.getMuseu().getNome());
        return new ObraResponse(o.getId(),o.getTitulo(),o.getTamanho(),o.getAno(),o.getTipo(),artista,museu);

    }
}
