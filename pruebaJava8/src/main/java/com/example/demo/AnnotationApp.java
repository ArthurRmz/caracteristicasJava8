package com.example.demo;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationApp {
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes{
		Lenguaje[] value() default {};
		
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje{
		String value();
		String nombreUsuario() default "Arthur";
	}
	
//	1.7
//	@Lenguajes({
//		@Lenguaje("Java"),
//		@Lenguaje("Python"),
//	})
//	1.8
	@Lenguaje(value = "Java", nombreUsuario = "Sai")
	@Lenguaje("Python")
	public interface LenguajeProgramacion{
		
	}

	public static void main(String[] args) {

		Lenguaje[] lenguajeArrayLenguajes = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
		System.out.println(lenguajeArrayLenguajes.length);
		
		Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
		for (Lenguaje elemento : len.value()) {
			System.out.println(elemento.value()+"-"+elemento.nombreUsuario());
		}
	}

}
