package virandoocapeta;

public class Pessoa extends Contato{
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    
    
    //Este é o construct
    public Pessoa (){ //Podemos passar parametros obrigatórios na instanciação do objeto
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public String getCep(){
        return cep;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
}
