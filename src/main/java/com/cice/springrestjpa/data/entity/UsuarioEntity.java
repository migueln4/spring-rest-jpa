package com.cice.springrestjpa.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Log
public class UsuarioEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long idUsuario;

    @Column(name = "user")
    private String user;

    @Column(name= "pass")
    private String pass;

}
