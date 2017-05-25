package Bancov3;

import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Conta
{
    // Atributos
    private int numero;
    private String tirular;
    double saldo;
    private static int qtdConta = 0;
    Scanner ler = new Scanner(System.in);

    // Construtores
    public Conta(String titular)
    {
        this.numero = ++qtdConta;
        this.tirular = titular;
    }

    // gets & sets
    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getTirular()
    {
        return tirular;
    }

    public void setTirular(String tirular)
    {
        this.tirular = tirular;
    }

    public static int getQtdConta()
    {
        return qtdConta;
    }

    public static void setQtdConta(int qtdConta)
    {
        Conta.qtdConta = qtdConta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    //Métodos
    public void depositar()
    {
        System.out.println("Digite o valor a ser depositado:");
        double valor = 0;

        if (ler.hasNextDouble()) // Tratamento de erro do tipo na leitura
        {
            valor = ler.nextDouble();
        }
        else
        {
            System.out.println("Caracter inválido!");
            System.exit(0);
        }

        if (valor > 0)
        {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso");
            System.out.println("Seu saldo agora é de: R$ " + getSaldo());
            System.out.println("");
        }
        else
        {
            System.out.println("Esse valor é negativo e não pode ser depositado");
            System.out.println("");
        }
    }

    public boolean sacar()
    {
        System.out.println("Digite o valor a ser sacado:");

        double valor = 0;

        if (ler.hasNextDouble()) // Tratamento de erro do tipo na leitura
        {
            valor = ler.nextDouble();
        }
        else
        {
            System.out.println("Caracter inválido!");
            System.exit(0);
            return false;
        }

        if (valor <= this.getSaldo() && (valor > 0))
        {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo agora é de: R$ " + getSaldo());
            System.out.println("");
        }
        else
        {
            System.out.println("Esse valor não pode ser sacado");
            System.exit(0);
            return false;
        }
        return true;
    }

    public void dadosBancarios()
    {
        System.out.println("Dados Bancarios da Conta:");
        System.out.println("Número: " + getNumero());
        System.out.println("Titular: " + getTirular());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("");
        System.out.println("");
    }
}
