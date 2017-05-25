/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancov3;

import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class ContaEspecial extends Conta
{
    // Atributos;
    private double limite;
    Scanner ler = new Scanner(System.in);

    // Construtor
    public ContaEspecial(String titular, double limite)
    {
        super(titular);
        this.limite = limite;
    }

    // gets & sets
    public double getLimite()
    {
        return limite;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }

    // Métodos
    @Override
    public boolean sacar()
    {
        double valor = 0;
        
        System.out.println("Digite o valor a ser sacado:");
        if (ler.hasNextDouble())
        {
            valor = ler.nextDouble();
        }
        else
        {
            System.out.println("Caracter inválido!");
            System.exit(0);
            return false;
        }

        if (valor > (this.getSaldo() + this.limite))
        {
            System.out.println("Saldo insuficiente");
            return false;
        }
        else
        {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo agora é de: R$ " + getSaldo());
            System.out.println("");
            return true;
        }
    }
}
