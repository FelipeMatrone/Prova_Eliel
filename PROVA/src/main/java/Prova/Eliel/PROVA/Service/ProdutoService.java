package Prova.Eliel.PROVA.Service;

import Prova.Eliel.PROVA.Model.ProdutoModel;
import Prova.Eliel.PROVA.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepostory;

    public ProdutoModel criarProduto(ProdutoModel produtoModel ){
        return produtoRepostory.save(produtoModel);
    }

    public List<ProdutoModel> buscarTodosProdutos(){
        return produtoRepostory.findAll();
    }

    public Optional<ProdutoModel> buscarProdutos(Long id){
        return produtoRepostory.findById(id);
    }

    public void deletarProduto( Long id ){
        produtoRepostory.deleteById(id);
    }

    public ProdutoModel atualizarProduto( Long id, ProdutoModel produtoModel) {
        ProdutoModel newProduto = produtoRepostory.findById(id).get();
        newProduto.setNome(produtoModel.getNome());
        return produtoRepostory.save(newProduto);


    }
}


