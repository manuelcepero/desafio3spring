/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.desafio3.servicio;

import com.example.desafio3.entidad.Cliente;
import com.example.desafio3.repositorio.ClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manuel
 */
@Service
public class ClienteServiceImpl implements ClienteServiceI{
    
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void guardar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void buscarCliente(Long id) {
        //Debería devolver el cliente
        clienteRepository.findById(id);
    }

    @Override
    public Cliente findByNombreAndApellidos(String nombre, String apellidos) {
        return clienteRepository.findByNombreAndApellidos(nombre, apellidos);
    }

}
