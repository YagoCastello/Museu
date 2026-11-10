package saloman.yago.musuem.Response;

import saloman.yago.musuem.Model.Museu;

public record MuseuResponse(Long id, String nome, String localizacao, Integer fundado,
                            long quantidadeDeObras, Double mediaDeVisitasMensal, String site) {
    public static MuseuResponse de(Museu m, long quantidadeDeObras) {
        return new MuseuResponse(m.getId(),m.getNome(),m.getLocalizacao(),m.getFundado(),
                quantidadeDeObras,m.getMediaDeVisitasMensal(),m.getSite());
    }
}
