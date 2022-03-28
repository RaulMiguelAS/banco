package Logica;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numero){
        this.numConta=numero;
        saldo = 0;
    }

    public int getNumero(){
        return numConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public boolean sacar(double valor){
        if(saldo>=valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
}
