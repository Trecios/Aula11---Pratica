
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author Trecios
 * @version 05/09/2018
 */
public class Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String endereco;
    private String telefone;

    /**
     * Construtor para objetos da classe Cliente
     */
    public Cliente(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome()
    {
        return this.nome;
    }
    
    public String getEndereco()
    {
        return this.endereco;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public String getTelefone()
    {
        return this.telefone;
    }
    
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
}
