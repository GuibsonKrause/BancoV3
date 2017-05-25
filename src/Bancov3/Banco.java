package Bancov3;

import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Banco
  {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        Scanner ler = new Scanner(System.in);
        Interface op = new Interface();
        op.criarMenu();

        if (op.getAux1() == 1)
          {
            while (op.getOpMenu() != 0)
              {
                switch (op.getOpMenu())
                  {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        op.getListaContas().get(op.getOpConta() - 1).dadosBancarios();
                        op.criarMenu();
                        break;
                    case 2:
                        op.getListaContas().get(op.getOpConta() - 1).depositar();
                        op.criarMenu();
                        break;
                    case 3:
                        op.getListaContas().get(op.getOpConta() - 1).sacar();
                        op.criarMenu();
                        break;
                  }
              }
          } else if (op.getAux1() == 2)
          {
            while (op.getOpMenu() != 0)
              {
                switch (op.getOpMenu())
                  {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        op.getListaContaEspecial().get(op.getOpConta() - 1).dadosBancarios();
                        op.criarMenu();
                        break;
                    case 2:
                        op.getListaContaEspecial().get(op.getOpConta() - 1).depositar();
                        op.criarMenu();
                        break;
                    case 3:
                        op.getListaContaEspecial().get(op.getOpConta() - 1).sacar();
                        op.criarMenu();
                        break;
                  }
              }
          }
      }

  }
