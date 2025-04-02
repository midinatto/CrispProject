package br.edu.imepac.PatternBuilder;

import br.edu.imepac.PatternBuilder.model.Casa;

public interface IBuilderCasa {
    void buildQuartos();
    void buildBanheiros();
    void buildChurrasqueira();
    Casa getCasa();

}
