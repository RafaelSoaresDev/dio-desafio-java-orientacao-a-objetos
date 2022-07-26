package com.dio;

import lombok.Data;

import java.util.List;

@Data
public class Banco {

    private String nome;
    List<Conta> contas;

}
