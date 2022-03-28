package Logica;

import java.util.LinkedList;


public class Banco{
    private LinkedList<Conta> contas = new LinkedList<Conta>();

    public int criarConta(){
        int numConta = ((int) (1 + Math.random() * 99999999));
        Conta conta = new Conta(numConta);
        contas.add(conta);
        
        return numConta;
    }
    public void sacarValor(int numConta, double valor){
        for (Conta conta : contas){
            if(conta.getNumero() == numConta){
                conta.sacar(valor);
            }
        }    
    }
    public void depositar(int numConta,double valor){
        for (Conta conta : contas){
            if(conta.getNumero() == numConta){
                conta.depositar(valor);
            }
        } 
    }
    public void transferir(int numContaOri,int numContaDes, double valor) {
        for (Conta conta : contas){
            if(conta.getNumero() == numContaOri){
                conta.sacar(valor);
            }
            if(conta.getNumero() == numContaDes){
                conta.depositar(valor);
            }
        } 
    }
    public double ConsultarSaldo(int numConta){
        for (Conta conta : contas){
            if(conta.getNumero()== numConta){
                return conta.getSaldo();
            }
        } 
        
        return 1;
    }
}