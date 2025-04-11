package dev.java10x.cadastroNinjas;

import jakarta.persistence.*;

//Entity - Transforma uma classe em uma entidade do DB
@Entity
//Table - C
@Table(name = "tb_cadastro")


public class NinjaModel {

    @Id     //Atributo abaixo é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia de como será gerado o valor de ID
    Long id;
    String nome;
    int idade;
    String email;

    //No Args Constructor
    public NinjaModel(){

    }

    //All Args Constructor
    public NinjaModel(String nome, int idade, String email){
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
