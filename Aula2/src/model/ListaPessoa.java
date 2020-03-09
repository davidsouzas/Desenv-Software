package model;

import java.util.LinkedList;
import java.util.List;

public class ListaPessoa {
    private List<Pessoa> lst = new LinkedList<Pessoa>();
    
    public List<Pessoa> getPessoas(){
        
        for(int i = 1; i <=20; i++){
            // Explicito Pessoa pe = new Pessoa("0" + i, "Jao" + i, i);
            lst.add(new Pessoa("0" + i, "Jão " + i, i)); //Instancia implícita
        }
        
        return lst;
    }
    
    public void setPessoa(Pessoa pessoa){
        lst.add(pessoa);
    }
}
