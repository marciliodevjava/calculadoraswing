package br.com.cod3r.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public abstract void valorAlterado(String novoValor);
}
