package br.edu.imepac.Observer.observer;


import br.edu.imepac.Observer.model.Estoque;

public interface Observer {
    public void update(Estoque estoque);
}
