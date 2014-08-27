/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Aluno
 */
public class contaBancaria {

    private int numeroConta, cont, inicio, fim;
    private double saldo;
    private String[] historico;

    public int getNumeroConta() {
        return numeroConta;

    }

   

    public contaBancaria(int numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico[cont] = "Conta "+this.numeroConta+"aberta com saldo" +this.saldo;
    }
    
    public double getSaldo() {
        System.out.println("");
        this.saldo = this.saldo - 0.25;
        this.historico[cont] = "Valor consulta do saldo: R$ 0.25";
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        
        
    }

    public String getHistorico() {
        for (int i = 0; i < this.fim; i++) {
            return historico[i];
        }
        return null;
    }

    public void setHistorico(String historico) {
        this.historico[cont] = historico;
        this.cont++;
    }

    public void depositar(double saldo) {
        this.saldo = this.saldo + saldo;
        String saldoStr = String.valueOf(saldo);
        this.historico[cont] = this.historico[cont].concat("Deposito de: R$ " + saldoStr);
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
        String saldoStr = String.valueOf(valor);
        this.historico[cont] = this.historico[cont].concat("Saque de: R$ " + saldoStr);
    }

}
