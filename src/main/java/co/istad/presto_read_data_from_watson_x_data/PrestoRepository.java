package co.istad.presto_read_data_from_watson_x_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class PrestoRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PrestoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getData() {
        String sql = "SELECT * FROM iceberg_data.demo_schema.demo_table";
        return jdbcTemplate.queryForList(sql);
    }
}
