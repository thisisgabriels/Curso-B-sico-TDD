package app.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import app.StringUtil;


public class StringUtilTest {
	
	@Test
	public void testIsEmpety() {
		boolean b;
		b = StringUtil.isEmpety("abc"); //retorna false
		Assert.assertFalse(b);
		
		b = StringUtil.isEmpety(null); // retorna true
		
		Assert.assertTrue(b);
		
		b = StringUtil.isEmpety(""); // retorna true
}
	@Test
	public void testReverse() { //método que inverte texto da string
		String r = StringUtil.reverse("abcd");
		Assert.assertEquals("dcba", r);
		
		r = StringUtil.reverse(null);
		Assert.assertNull(r);
	}
	
	@Before
	public void before() {
		System.out.println("Iniciando o teste");
	}
	//Antes de executar cada teste dessa classe chame o método before
	
	@After
	public void after() {
		System.out.println("Teste finalizado");
		
		 //Após executar o método chame a classe after
}
}