package dev.java10x.cadastroNinjas.Missoes.Services;
import dev.java10x.cadastroNinjas.Ninjas.Services.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data //Cria getters e setters
@NoArgsConstructor
@AllArgsConstructor


public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;


    //@OneToMany - Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
