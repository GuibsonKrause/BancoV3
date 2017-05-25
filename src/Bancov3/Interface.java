package Bancov3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Interface
  {
    private int opMenu;
    private int opConta;
    private int opTipoConta;
    private String nome;
    private double limite;
    private int aux1;

    ArrayList<Conta> listaContas = new ArrayList<>();
    ArrayList<ContaEspecial> listaContaEspecial = new ArrayList<>();

    // gets & sets
    public int getOpMenu()
      {
        return opMenu;
      }

    public int getOpConta()
      {
        return opConta;
      }

    public int getOpTipoConta()
      {
        return opTipoConta;
      }

    public void setOpTipoConta(int opTipoConta)
      {
        this.opTipoConta = opTipoConta;
      }

    public String getNome()
      {
        return nome;
      }

    public void setNome(String nome)
      {
        this.nome = nome;
      }

    public double getLimite()
      {
        return limite;
      }

    public void setLimite(double limite)
      {
        this.limite = limite;
      }

    public int getAux1()
      {
        return aux1;
      }

    public void setAux1(int aux1)
      {
        this.aux1 = aux1;
      }

    public ArrayList<Conta> getListaContas()
      {
        return listaContas;
      }

    public void setListaContas(ArrayList<Conta> listaContas)
      {
        this.listaContas = listaContas;
      }

    public ArrayList<ContaEspecial> getListaContaEspecial()
      {
        return listaContaEspecial;
      }

    public void setListaContaEspecial(ArrayList<ContaEspecial> listaContaEspecial)
      {
        this.listaContaEspecial = listaContaEspecial;
      }

    // Metodos  
    public void criarMenu()
      {
        Scanner ler = new Scanner(System.in);
        do
          {
            System.out.println("Digite o Tipo de conta que você deseja criar:");
            System.out.println("1 - Conta Comum:");
            System.out.println("2 - Conta Especial:");
            System.out.println("Ou digite 0 para sair:");

            if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
              {
                this.opTipoConta = ler.nextInt();

                if (this.opTipoConta == 1)
                  {
                    System.out.println("Digite o nome do usuário da conta:");
                    System.out.println("Ou digite 0 para sair");
                    this.nome = ler.next();
                    listaContas.add(new Conta(nome));
                  } else if (this.opTipoConta == 2)
                  {
                    System.out.println("Digite o nome do usuário da conta:");
                    this.nome = ler.next();

                    System.out.println("Informe o limite");
                    System.out.println("Ou digite 0 para sair");
                    this.limite = ler.nextDouble();

                    listaContaEspecial.add(new ContaEspecial(nome, limite));
                  }

              } else
              {
                System.out.println("Opção inválida!");
                System.exit(0);
              }
          } while (this.opTipoConta != 0);

        int aux2 = 0, aux3 = 1;

        System.out.println("Escolha o tipo da sua conta:");
        System.out.println("1 - Conta comum:");
        System.out.println("2 - Conta especial:");
        System.out.println("Ou digite 0 para sair:");

        if (ler.hasNextInt())
          {
            this.aux1 = ler.nextInt();

            if (this.aux1 == 1)
              {
                aux2 = listaContas.size();
                System.out.println("");
                System.out.println("Contas existentes:");
                for (int i = 0; i < aux2; i++)
                  {
                    System.out.println("Conta: " + aux3);
                    aux3++;
                  }

                System.out.println("Digite o numero da conta desejada:");
                if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
                  {
                    this.opConta = ler.nextInt();
                  } else
                  {
                    System.out.println("Opção inválida!");
                    System.exit(0);
                  }

                if (this.opConta == 0)
                  {
                    System.exit(0);
                  }

                if (this.opConta < 1 || this.opConta > aux2)
                  {
                    System.out.println("Essa conta não existe");
                    System.exit(0);
                  }

                System.out.println("Digite o número correspondente da opção desejada");
                System.out.println("");
                System.out.println("(1) Dados Bancários:");
                System.out.println("(2) Depósito:");
                System.out.println("(3) Saque:");
                System.out.println("(0) Sair:");

                if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
                  {
                    this.opMenu = ler.nextInt();
                  } else
                  {
                    System.out.println("Opção inválida!");
                    System.exit(0);
                  }
              } else if (this.aux1 == 2)
              {
                aux2 = listaContaEspecial.size();
                System.out.println("");
                System.out.println("Contas Especiais existentes:");
                for (int i = 0; i < aux2; i++)
                  {
                    System.out.println("Conta Especial: " + aux3);
                    aux3++;
                  }

                System.out.println("Digite o numero da conta desejada:");
                if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
                  {
                    this.opConta = ler.nextInt();
                  } else
                  {
                    System.out.println("Opção inválida!");
                    System.exit(0);
                  }

                if (this.opConta == 0)
                  {
                    System.exit(0);
                  }

                if (this.opConta < 1 || this.opConta > aux2)
                  {
                    System.out.println("Essa conta não existe");
                    System.exit(0);
                  }

                System.out.println("Digite o número correspondente da opção desejada");
                System.out.println("");
                System.out.println("(1) Dados Bancários:");
                System.out.println("(2) Depósito:");
                System.out.println("(3) Saque:");
                System.out.println("(0) Sair:");

                if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
                  {
                    this.opMenu = ler.nextInt();
                  } else
                  {
                    System.out.println("Opção inválida!");
                    System.exit(0);
                  }
              }
          } else
          {
            System.out.println("Opção inválida!");
            System.exit(0);
          }

//        System.out.println("tamanho da lista: " + getListaContas().size());
//        System.out.println("nome que ta na lista: " + listaContas.get(0).getTirular());

      }

  }
