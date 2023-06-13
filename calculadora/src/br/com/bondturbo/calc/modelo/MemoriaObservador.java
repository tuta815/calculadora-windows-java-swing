package br.com.bondturbo.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);
}
