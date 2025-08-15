package com.example.DemoJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ConexionService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> obtenerClientes(){
        String sql = "select  Nombre_Cliente from clientes";
        return jdbcTemplate.query(sql,new RowMapper<String>(){

            @Override
            public String mapRow(ResultSet rs,int rowNum)throws SQLException{
                return rs.getString("Nombre_Cliente");
            }
        });
    }
    public List<String>  obtenerClientesDetalles() {
        String sql2 = "SELECT Nombre_Cliente, Fecha_Nacimiento, Telefono FROM clientes";
        return jdbcTemplate.query(sql2, new RowMapper<String>() {

            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("Nombre_Cliente")
                        + "|||" + rs.getString("Fecha_Nacimiento")
                        + "|||" + rs.getString("Telefono");
            }

        });
    }
    public void insertarCliente (String documento, String nombre, String apellido, String tel, String fn, String genero, String estado) {
        String sql = "INSERT INTO clientes (Documento_Cliente, Nombre_Cliente, Apellido_Cliente, Telefono, Fecha_Nacimiento, Genero, ID_Estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, documento, nombre, apellido, tel, fn, genero, estado);
    }

}