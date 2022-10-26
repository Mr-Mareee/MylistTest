import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import General.Mylist;

public class MylistTest {
	public static Mylist lista;
	@BeforeClass
	public static void prepareAll() {
		System.out.println("before class");
		lista=new Mylist();
		for (int i = 0; i < 10; i++) {
			int randomNum = 100 + (int)(Math.random() * 1000);
			lista.add(randomNum);
		}
	}
	@Before
	public  void beforeEachone() {
		System.out.println("sbacanto la lista");
		lista.clear();
		for (int i = 0; i < 10; i++) {
			int randomNum = 100 + (int)(Math.random() * 1000);
			lista.add(randomNum);
		}
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	@Test
	public void itSortingTime() {
		System.out.println("Lista prima del sorting");
		System.out.println(lista.toString());
		lista.sort(0);
		for (int i = 0; i < lista.length()-1; i++) {
			assertTrue(lista.get(i)<lista.get(i+1));
		}
		System.out.println("Lista dopo del sorting");
		System.out.println(lista.toString());
	}
	@Test
	public void itReverseSortingTime() {
		System.out.println("Lista prima del sorting");
		System.out.println(lista.toString());
		lista.sort(1);
		for (int i = 0; i < lista.length()-1; i++) {
			assertTrue(lista.get(i)>lista.get(i+1));
		}
		System.out.println("Lista dopo del sorting");
		System.out.println(lista.toString());
	}
}
