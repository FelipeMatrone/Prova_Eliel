package Prova.Eliel.PROVA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ProdutoModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )

    private Long id;
    private String nome;
    private Double preco;

    public ProdutoModel(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}



