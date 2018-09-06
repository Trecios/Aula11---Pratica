
/**
 * Escreva a descrição da classe Juridica aqui.
 * 
 * @author Trecios 
 * @version 05/09/2018
 */
public class Juridica extends Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cnpj;
    private String nomeFantasia;

    /**
     * COnstrutor para objetos da classe Fisica
     */
    public Juridica(String nome,String endereco, String telefone, String cnpj, String nomeFantasia)
    {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj()
    {
        return this.cnpj;
    }
    
    public String getNomeFantasia()
    {
        return this.nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }
    
    public void imprimirDados()
    {
        System.out.println("Nome: " + super.getNome() + " Endereço: " + super.getEndereco() + " Telefone: " + super.getTelefone() + " Cnpj: " + this.getCnpj() + " Nome Fantasia: " + this.getNomeFantasia());
    }
}
