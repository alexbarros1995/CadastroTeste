package com.HelloWorld.Teste_API;

import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do BD
// JPA = Java persistence API
@Entity
@Table(name = "tb_cadastro")
public class VikingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String email;
    int idade;

    public VikingModel() {
    }

    public VikingModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
