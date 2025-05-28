package com.seuusuario.bank.subject;

import java.util.ArrayList;
import java.util.List;

import com.seuusuario.bank.observer.Observer;

public class Banco implements Subject {
    private List<Observer> clientes = new ArrayList<>();

    @Override
    public void adicionarObserver(Observer o) {
        clientes.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        clientes.remove(o);
    }

    @Override
    public void notificarObservers(String mensagem) {
        for (Observer cliente : clientes) {
            cliente.atualizar(mensagem);
        }
    }

    public void realizarTransacao(String mensagem) {
        System.out.println("Transação realizada: " + mensagem);
        notificarObservers(mensagem);
    }
}
