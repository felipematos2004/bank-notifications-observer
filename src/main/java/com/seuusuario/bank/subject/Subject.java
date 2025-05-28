package com.seuusuario.bank.subject;

import com.seuusuario.bank.observer.Observer;

public interface Subject {
    void adicionarObserver(Observer o);
    void removerObserver(Observer o);
    void notificarObservers(String mensagem);
}
