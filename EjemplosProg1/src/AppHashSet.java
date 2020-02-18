

import java.util.HashSet;
import java.util.Set;

public class AppHashSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		lista.add("JohanCala");
		lista.add("Johan");
		lista.add("JohanCala");
		lista.add("luisaRepresentante");
		lista.add("Gabriela"); 
		
		for(String elem : lista) {
			System.out.println(elem);
			
		/* -Se recore igual que los arreglos de toda la vida
		 * -Se preocupa porque no tenga elementos duplicados
		 * -No se preocupe por el orden de agregacion
		 
		 
		 
		 -------------Ahora con los objetos---------
		 
		 	Set<Persona> lista = new HashSet<>();		
			lista2.add(new Persona(1,"JohanCala",22));
			lista2.add(new Persona(1,"JohanCala",22));
			lista2.add(new Persona(1,"Alejandra",22));
			lista2.add(new Persona(1,"JohanCala",22));
			lista2.add(new Persona(1,"LuisaM",25));
			lista2.add(new Persona(1,"Cala",22));
			
			for(Persona per : lista){
				System.out.println(per.getNombre());
			
			}
			
			-------Al imprimir esto nos tiene que imprimir solo 3 objetos pero no los va a imprimir
			       todos, y el porque es que cada vez que intanciamos un objeto apunta a direccion de memoria diferente
			       por eso no son iguales------
			       
			-------Para ellos tenemos que sobreescribir dos metodos importantes los cuales son -HashCode()
			       y -equals()
			       
			
		 */
		 
		}
		
		Set<Persona> lista2 = new HashSet<>();		
		lista2.add(new Persona(1,"JohanCala",22));
		lista2.add(new Persona(1,"Cala",22));
		lista2.add(new Persona(1,"JohanCala",22));
		lista2.add(new Persona(1,"Luisa",22));
		lista2.add(new Persona(1,"Gabriela",25));
		lista2.add(new Persona(1,"Cala",22));
		
		for(Persona per : lista2){
			System.out.println(per.getEdad()+"-" + per.getNombre());
		}
	}
}
