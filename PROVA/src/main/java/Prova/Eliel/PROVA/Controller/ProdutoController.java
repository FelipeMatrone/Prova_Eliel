package Prova.Eliel.PROVA.Controller;

import Prova.Eliel.PROVA.Model.ProdutoModel;
import Prova.Eliel.PROVA.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( path = "/api/produtos")

public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto( @RequestBody ProdutoModel produtoModel){
        return  ResponseEntity.status(204).body(produtoModel); 
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> buscarTodosProdutos(){
        List<ProdutoModel> requeste = produtoService.buscarTodosProdutos();
        return ResponseEntity.ok().body(requeste);
    }

    @GetMapping("/api/produtos/{id}")
    public Optional<ProdutoModel> buscarId(@PathVariable Long id){
        return  produtoService.buscarProdutos(id);
    }

    @DeleteMapping("/api/produtos/{id}")
    public ResponseEntity<?> deletar (@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/api/produtos/{id}")
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel estudanteModel){
        return produtoService.atualizarProduto(id,estudanteModel);
    }
}



