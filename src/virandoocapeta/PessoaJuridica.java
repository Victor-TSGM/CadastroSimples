package virandoocapeta;

public class PessoaJuridica extends Pessoa{
    private int cnpj;
    private String tipo;

    //Constructor
    public PessoaJuridica(){
        
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCnpj(){
        return cnpj;
    }
    
    public String getTipo(){
        return tipo;
    }
}
