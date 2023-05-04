import Entidades.*;
import Servico.ServicoCrud;

import java.util.List;

public class Main {
    private static ServicoCrud test = new ServicoCrud();
    public static void main(String[] args) {

        testeDeArray();
        listarProduto();
        test.deletarProduto(2);
        System.out.println("======================\nAPOS O METODO DELETE");
        listarProduto();
        System.out.println("======================\nAPOS O METODO ALTERAR");
        listarProduto();
    }

    public static void alterar(){
        Computador produto = new Computador(01,"Pichau","AMD RYZEN 5",4000);
        test.alterarProduto(produto);

    }

    static void testeDeArray(){
        Computador computador = new Computador(01,"Rocketz","I9 9500F",20000);

        test.salvarProduto(computador);

        Carro carro = new Carro(02,"Mustang","1996",560000);
        test.salvarProduto(carro);

        Headphone headphone = new Headphone(03,"Anker","Soundcore Q30",320);

        test.salvarProduto(headphone);

        Teclado teclado = new Teclado(04,"Manchenike","K500W",500);

        test.salvarProduto(teclado);

    }
    static void listarProduto() {
        List<Produto> lista = test.listarProduto();

        if (lista.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            for (Produto produto : lista) {
                System.out.println("id: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Sobrenome: " + produto.getModelo());
                System.out.println("Idade: " + produto.getPreco());
                System.out.println("---------------------------");
            }
        }
    }
}
