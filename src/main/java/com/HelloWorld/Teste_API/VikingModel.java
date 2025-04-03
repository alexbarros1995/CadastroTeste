package com.HelloWorld.Teste_API;

import jakarta.persistence.*;

//Entity ele transforma uma classe em uma entidade do BD
// JPA = Java persistence API
@Entity
@Table(name = "tb_cadastro")
public class VikingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    public VikingModel() {
    }

    public VikingModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
