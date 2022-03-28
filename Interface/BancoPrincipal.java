package Interface;
import java.util.Scanner;

import Logica.Banco;

public class BancoPrincipal{
    public static void main(String[] args) {
        Scanner     s = new Scanner(System.in);
        Banco bancoUnicap = new Banco();
     
        byte op = 0;

        
        do {
            menu();
            System.out.print("   Escolha a opção: ");
            op = s.nextByte();
            switch (op) {
                case 0:
                    System.out.println("Até logo.");
                    break;
                case 1:
                   int numero=bancoUnicap.criarConta();
                    System.out.println("Sua conta foi criada "+ numero);
                break;
                case 2: 
                    System.out.print("Insira o número da sua conta: ");
                    numero = s.nextInt();
                    System.out.print("Insira o valor: ");
                    double deposit = s.nextInt();
                    bancoUnicap.depositar(numero, deposit);
                break;
                case 3:
                System.out.print("Insira o número da sua conta: ");
                    numero = s.nextInt();
                    System.out.print("Insira o valor: ");
                    double sacar = s.nextInt();
                    bancoUnicap.sacarValor(numero, sacar);
                break;
                case 4:
                System.out.println("Qual o número da conta origem?");
                int numOrigem=s.nextInt();
                System.out.println("Qual é o número da conta destino");
                int numDest=s.nextInt();
                System.out.println("Qual o valor a ser transferido?");
                double valor=s.nextDouble();
                bancoUnicap.transferir(numOrigem, numDest, valor);
                break;
                case 5:
                System.out.println("Insira o número da conta");
                numero=s.nextInt();
                 valor =bancoUnicap.ConsultarSaldo(numero);
                System.out.println("o saldo da conta é: " + valor);
                break;
                default: System.out.println("Insira uma opção válida.");
                    break;
            }
        } while (op != 0);
    }
    public static void menu(){
        System.out.println("   1 - Criar Conta");
        System.out.println("   2 - Depositar");
        System.out.println("   3 - Sacar");
        System.out.println("   4 - Transferir");
        System.out.println("   5 - Consultar saldo da conta");
        System.out.println("   0 - Sair do programa");
    }
 }