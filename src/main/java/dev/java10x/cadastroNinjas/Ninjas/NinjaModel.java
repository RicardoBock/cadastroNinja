package dev.java10x.cadastroNinjas.Ninjas;
import dev.java10x.cadastroNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

//Entity - Transforma uma classe em uma entidade do DB
@Entity
//Table - Cadastro de ninjas
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id     //Atributo abaixo é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia de como será gerado o valor de ID
    private Long id;

    private String nome;

    private int idade;

    @Column(unique = true)
    private String email;


    //@ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign Key
    private List<MissoesModel> missoes;


}
