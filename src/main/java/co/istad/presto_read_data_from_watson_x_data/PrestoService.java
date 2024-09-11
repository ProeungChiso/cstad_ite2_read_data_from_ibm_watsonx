package co.istad.presto_read_data_from_watson_x_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class PrestoService {

    private final PrestoRepository prestoRepository;

    @Autowired
    public PrestoService(PrestoRepository prestoRepository) {
        this.prestoRepository = prestoRepository;
    }

    public List<Map<String, Object>> getData() {
        return prestoRepository.getData();
    }
}
