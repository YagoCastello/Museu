package saloman.yago.musuem.Response;

import saloman.yago.musuem.Model.Artista;

public record ArtistaResponse(Long id, String nome, String pseudonimo, String sexo,
                              Integer anoNascimento, Integer anoFalecimento) {
    public  static ArtistaResponse de(Artista a){
        return new ArtistaResponse(a.getId(),a.getNome(),a.getPseudonimo(),a.getSexo(),
                a.getAnoNascimento(),a.getAnoFalecimento());
    }

}
