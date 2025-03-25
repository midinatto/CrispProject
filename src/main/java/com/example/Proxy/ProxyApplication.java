package com.example.Proxy;

import com.example.Proxy.model.Orcamento;
import com.example.Proxy.model.OrcamentoProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento (new BigDecimal("200"), new BigDecimal("0"));
		System.out.println("Valor desconto antes = " + orcamento.getValorOrcamento());
		System.out.println("Valor desconto antes = " + orcamento.getDescontoOrcamento());

		OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
		System.out.println("Valor SEM PROXY = " + proxy.getDescontoOrcamento());
		System.out.println("Valor COM PROXY = " + proxy.getDescontoOrcamento());
		System.out.println("Valor COM PROXY = " + proxy.getDescontoOrcamento());
		System.out.println("Valor COM PROXY = " + proxy.getDescontoOrcamento());
		System.out.println("Valor COM PROXY = " + proxy.getDescontoOrcamento());

	}
	}
