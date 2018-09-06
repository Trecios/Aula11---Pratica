
/**
 * Escreva a descrição da classe Fisica aqui.
 * 
 * @author Trecios 
 * @version 05/09/2018
 */
public class Fisica extends Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cpf;

    /**
     * COnstrutor para objetos da classe Fisica
     */
    public Fisica(String nome,String endereco, String telefone, String cpf)
    {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf()
    {
        return this.cpf;
    }
    
    public void imprimirDados()
    {
        System.out.println("Nome: " + super.getNome() + " Endereço: " + super.getEndereco() + " Telefone: " + super.getTelefone() + " Cpf: " + this.getCpf());
    }
}
