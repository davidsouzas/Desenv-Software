package aula2;

import model.ListaPessoa;
import model.Pessoa;

public class Aula2 {

    public static void main(String[] args) {
        ListaPessoa lista = new ListaPessoa();
        
        lista.setPessoa(new Pessoa("0500 2011 040", "Criança Esperança", 80));
        
        for(Pessoa pessoa : lista.getPessoas()){
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("---------------------------");
        }
    }
    
}
