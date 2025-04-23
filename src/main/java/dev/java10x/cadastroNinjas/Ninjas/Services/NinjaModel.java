package dev.java10x.cadastroNinjas.Ninjas.Services;

import dev.java10x.cadastroNinjas.Missoes.Services.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.List;

//Entity - Transforma uma classe em uma entidade do DB
@Entity
//Table - Cadastro de ninjas
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor


public class NinjaModel {

    @Id     //Atributo abaixo é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia de como será gerado o valor de ID
    private Long id;

    private String nome;

    private int idade;

    private String email;


    //@ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign Key
    private List<MissoesModel> missoes;


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
