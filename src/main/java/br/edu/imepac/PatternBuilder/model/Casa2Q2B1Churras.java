package br.edu.imepac.PatternBuilder.model;

import br.edu.imepac.PatternBuilder.IBuilderCasa;

public class Casa2Q2B1Churras implements IBuilderCasa {

    Casa casa = new Casa();
    public Casa2Q2B1Churras() {
        casa = new Casa(2,2, true);
    }
    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro  2,3 x 1,80");
    }
    @Override
    public void buildBanheiros() {
        System.out.println("2 Banheiro  2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Com Churrasqueira");
    }
    @Override
    public Casa getCasa() {
        return casa;
    }


}
