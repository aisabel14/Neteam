package com.Neteam.Movimientos.repository;

import com.Neteam.Movimientos.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Long> {

    Usuario findByCorreo(String correo); //esta línea es para que haya una búsqueda por email durante el proceso de login
    @Query(value="SELECT * FROM usuario where empresa_id= ?1", nativeQuery=true)
    public abstract ArrayList<Usuario> findByEmpresa(Integer id);
}
