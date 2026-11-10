package saloman.yago.musuem.Exception;

public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException(String recurso, Long id) {
        super(recurso+" com id "+id+" nao encontrado(a)");
    }
}
