package com.example.DemoJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConexionController {
    @Autowired
    private ConexionService conexionService;

    @GetMapping("/Usuarios")
    public List<String> obtenerClientes(){
        return conexionService.obtenerClientes();
    }

    @GetMapping("/Detalles")
    public List<String> obtenerClientesDetalles() {
        return conexionService.obtenerClientesDetalles();}

    @PostMapping("/Ins")
    public String insertarCliente (@RequestParam String documento, @RequestParam String nombre, @RequestParam String apellido , @RequestParam String tel, @RequestParam String fn, @RequestParam String genero, @RequestParam String estado) {
        conexionService.insertarCliente(documento, nombre, apellido, tel, fn, genero, estado);
        return "Cliente agregado correctamente: " + documento +  nombre + apellido + tel + fn + genero + estado;
    }

}
