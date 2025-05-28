package com.seuusuario.bank.observer;

public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[NOTIFICAÇÃO] Cliente " + nome + " recebeu: " + mensagem);
    }

    public String getNome() {
        return nome;
    }
}
