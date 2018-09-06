
/**
 * Escreva a descrição da classe ContaBancaria aqui.
 * 
 * @author Trecios 
 * @version 05/09/2018
 */
public class ContaBancaria
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cliente;
    private int num_conta;
    private double saldo;

    /**
     * COnstrutor para objetos da classe ContaBancaria
     */
    public ContaBancaria(String cliente, int num_conta, double saldo)
    {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(double pedido)
    {
        if(pedido <= 0 && (saldo - pedido) < 0)
        {
            System.out.println("Pedido menor ou igual a 0, saque indisponível...");
        }
        else
        {
            saldo = saldo - pedido;
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
    
    public void depositar(double deposito)
    {
        if(deposito <= 0)
        {
            System.out.println("Valor para depósito inválido, depósito indisponível...");
        }
        else
        {
            saldo = saldo + deposito;
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
    
    public String toString()
    {
        return this.cliente;
    }
}
