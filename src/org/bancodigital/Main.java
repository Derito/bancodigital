package org.bancodigital;

import org.bancodigital.domain.model.Cliente;
import org.bancodigital.domain.model.Conta;
import org.bancodigital.domain.model.ContaCorrente;
import org.bancodigital.domain.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente Helder = new Cliente();
        Helder.setNome("Helder");

        Conta cc = new ContaCorrente(Helder);
        Conta poupanca = new ContaPoupanca(Helder);

        cc.depositar(100);
        cc.getSaldo();
        cc.imprimirExtrato();
        cc.transferir(10, poupanca);

        cc.depositar(200);
        cc.sacar(120);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
