package com.seuusuario.bank;

import com.seuusuario.bank.subject.Banco;
import com.seuusuario.bank.observer.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");

        banco.adicionarObserver(joao);
        banco.adicionarObserver(maria);

        banco.realizarTransacao("Depósito de R$ 200,00");
        banco.realizarTransacao("Saque de R$ 50,00");

        banco.removerObserver(maria);
        banco.realizarTransacao("Transferência de R$ 100,00");
    }
}
