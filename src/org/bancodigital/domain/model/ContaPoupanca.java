package org.bancodigital.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato da Conta Poupança ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
        super.imprimirInfosComuns();
    }
}
