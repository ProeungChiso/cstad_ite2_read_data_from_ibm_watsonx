package co.istad.presto_read_data_from_watson_x_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/presto")
public class PrestoController {

    private final PrestoService prestoService;

    @Autowired
    public PrestoController(PrestoService prestoService) {
        this.prestoService = prestoService;
    }

    @GetMapping()
    List<Map<String,Object>> getData(){
        return prestoService.getData();
    }
}
