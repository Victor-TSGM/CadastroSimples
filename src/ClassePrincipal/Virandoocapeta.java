package ClassePrincipal;

import virandoocapeta.Pessoa;
import virandoocapeta.PessoaJuridica;
import Views.Menu;

public class Virandoocapeta {

    public static void main(String[] args) {  
        
        Pessoa pessoa = new Pessoa(); //Quando criammos o contrutor na classe Pessoa com parâmetros obrigatórios
        
        PessoaJuridica pj = new PessoaJuridica();
        
        Menu menu = new Menu();
        menu.setVisible(true);
                
    }
    
}
