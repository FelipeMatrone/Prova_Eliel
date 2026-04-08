package Prova.Eliel.PROVA.Repository;

import Prova.Eliel.PROVA.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Long> {
}

