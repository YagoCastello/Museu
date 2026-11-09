package saloman.yago.musuem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saloman.yago.musuem.Model.TipoObra;

import java.util.List;

@RestController
@RequestMapping("/arte")
public class ArteController {

    /** Lista os valores aceitos no campo "tipo" de uma obra. */
    @GetMapping("/tipos")
    public List<TipoObra> tipos() {
        return List.of(TipoObra.values());
    }

}
