package org.bancodigital.domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("### Extrato da Conta Corrente ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
        super.imprimirInfosComuns();
    }

}
