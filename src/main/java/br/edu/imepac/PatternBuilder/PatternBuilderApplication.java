package br.edu.imepac.PatternBuilder;

import br.edu.imepac.PatternBuilder.model.Casa;
import br.edu.imepac.PatternBuilder.model.Casa2Q2B1Churras;
import br.edu.imepac.PatternBuilder.model.Casa2Quartos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternBuilderApplication.class, args);
		IBuilderCasa builderCasa1 = new Casa2Quartos();
		builderCasa1.buildQuartos();
		builderCasa1.buildBanheiros();
		builderCasa1.buildChurrasqueira();
		Casa casa1 = builderCasa1.getCasa();

		System.out.println("Casa 1:");
		System.out.println("Quartos:" + casa1.getQuartos());
		System.out.println("Banheiros:" + casa1.getBanheiros());
		System.out.println("Churrasqueira:" + casa1.isChurrasqueira());
		System.out.println("-----------------------------------------");

		IBuilderCasa builderCasa2 = new Casa2Q2B1Churras();
		builderCasa2.buildQuartos();
		builderCasa2.buildBanheiros();
		builderCasa2.buildChurrasqueira();
		Casa casa2 = builderCasa2.getCasa();

		System.out.println("Casa 2:");
		System.out.println("Quartos:" + casa2.getQuartos());
		System.out.println("Banheiros:" + casa2.getBanheiros());
		System.out.println("Churrasqueira:" + casa2.isChurrasqueira());

	}
}
