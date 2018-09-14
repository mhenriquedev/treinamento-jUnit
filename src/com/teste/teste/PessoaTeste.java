package com.teste.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.teste.entidade.Pessoa;

public class PessoaTeste {

	Pessoa pessoa;
	
	@Before
	public void init(){
		pessoa = new Pessoa();
	}
	
	@Test
	public void testJose() {
		pessoa.setNome("João");
		pessoa.setNumeroCPF("00000000000");
		pessoa.setTipoPessoJuridica('F');
		Assert.assertTrue(pessoa.getNome().equals("João"));
	}
	
	@Test
	public void testMariana() {
		pessoa.setNome("Mariana");
		pessoa.setNumeroCPF("00000000000");
		pessoa.setTipoPessoJuridica('F');
		Assert.assertTrue(pessoa.getNome().equals("Mariana"));
	}
	
	@Test
	public void testAceVentura() {
		pessoa.setNome("Ace Ventura");
		pessoa.setNumeroCPF("00000000000");
		pessoa.setTipoPessoJuridica('F');
		Assert.assertTrue(pessoa.getNome().equals("Ace Ventura"));
	}

}
