package br.edu.imepac.PatternBuilder.model;

public class Casa {
    private int quartos;
    private int banheiros;
    private boolean churrasqueira;
    public Casa(int quartos, int banheiros, boolean churrasqueira) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasqueira = churrasqueira;
    }

    public Casa() {
    }

    public int getQuartos() {
        return quartos;
    }
    public int getBanheiros() {
        return banheiros;
    }
    public boolean isChurrasqueira() {
        return churrasqueira;
    }
}
