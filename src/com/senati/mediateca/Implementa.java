package com.senati.mediateca;

import java.util.Set;
import java.util.HashSet;



public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio Socio1= new Socio();
		Socio1.idsocio=101;
		Socio1.nombre="Jorge Antonio";
		Socio1.apellido="Luque Chambi";
		Socio1.distrito="Los Olivos";
		
		Socio Socio2= new Socio();
		Socio2.idsocio=101;
		Socio2.nombre=" Antonio";
		Socio2.apellido="Chambi";
		Socio2.distrito="La Molina";
		
		System.out.println(Socio1.toString());
		System.out.println(Socio2.toString());
		
		Socio Socio3= new Socio(103,"Alicia","Gomez Avalos","Comas");
		System.out.println(Socio3.toString());
		
		Libro Libro1=new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		System.out.println(Libro1.toString());
		
		Libro Libro2=new Libro(12,"El sexto","Jose Maria Arguedas",40f,230,45);
		System.out.println(Libro2.toString());
		
		Cintaaudio Cintaaudio1=new Cintaaudio(11,"song","Skrillex",3f,"Canada",123);
		System.out.println(Cintaaudio1.toString());
		
		System.out.println("Lista de Socios");
		
		
		Socio soc1 = new Socio(104,"Jorge", "Luque","Comas");
		Socio soc2 = new Socio(105,"Maria", "Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo", "Luque","Comas");
		Socio soc4 = new Socio(107,"Alex", "Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex", "Lopez","Comas");
		
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.idsocio + " " + socio.nombre + " " + socio.apellido+""+socio.distrito);
		}
		System.out.println("Lista de libros");
		
		
		Libro lib1 = new Libro(11,"Matalache","Alvaro Vargas Llosa",50f,300,123);
		Libro lib2 = new Libro(11,"La odisea","Homero",60f,600,1543);
		Libro lib3 = new Libro(11,"En busca del tiempo perdido","Proust",20f,900,103);
		Libro lib4 = new Libro(11,"Crimen y Castigo","Fiodor",50f,300,5653);
		Libro lib5 = new Libro(11,"La metamorfosis","Kafka",55f,306,63);
		
		Set <Libro> ventalibros = new HashSet<Libro>();
		ventalibros.add(lib1);
		ventalibros.add(lib2);
		ventalibros.add(lib3);
		ventalibros.add(lib4);
		
		byte contador=0;
		float preciototal=0f;
		for (Libro libro : ventalibros) {
			System.out.println(libro.id + " " + libro.titulo + " " + libro.autor + " " + libro.precio + " " + libro.nropag + " " + libro.nroidbn);
			contador++;
			preciototal = preciototal+libro.precio;
		}
		System.out.println("ventalibros"+ contador);
		System.out.println("Monto acumulado"+preciototal);
		
		
		System.out.println("Lista de Audios");
		
		
		Cintaaudio cin1 = new Cintaaudio(12,"baby","Justin",3f,"Canada",123);
		Cintaaudio cin2 = new Cintaaudio(13,"loba","shakira",3f,"Colombia",123);
		Cintaaudio cin3 = new Cintaaudio(14,"mia","Edie santiago",3f,"Cuba",123);
		Cintaaudio cin4 = new Cintaaudio(15,"Fireproof","One direccion",3f,"Inglaterra",123);
		Cintaaudio cin5 = new Cintaaudio(16,"Mine","The1975",3f,"USA",123);
		
		Set <Cintaaudio> listaaudio = new HashSet<Cintaaudio>();
		listaaudio.add(cin1);
		listaaudio.add(cin2);
		listaaudio.add(cin3);
		listaaudio.add(cin4);
		
		for (Cintaaudio cintaaudio : listaaudio) {
			System.out.println(cintaaudio.id + " " + cintaaudio.titulo + " " + cintaaudio.autor + " " + cintaaudio.precio + " " + cintaaudio.lugar + " " + cintaaudio.duracion);
		}
		
		System.out.println("Lista de Video");
		
		
		Cintavideo vid1 = new Cintavideo(12,"Chuky","Tarantino",3f,"Juan",123);
		Cintavideo vid2 = new Cintavideo(13,"Los piratas del Caribe","Johnny Deep",3f,"Stuar",123);
		Cintavideo vid3 = new Cintavideo(14,"Las ventajas","freex",3f,"Francis",123);
		Cintavideo vid4 = new Cintavideo(15,"Corazon de hierro","rillweex",3f,"edwar",123);
		Cintavideo vid5 = new Cintavideo(16,"Toy Story","fellex",3f,"Carlos",123);
		
		Set <Cintavideo> listavideo = new HashSet<Cintavideo>();
		listavideo.add(vid1);
		listavideo.add(vid2);
		listavideo.add(vid3);
		listavideo.add(vid4);
		listavideo.add(vid5);
		
		for (Cintavideo cintavideo : listavideo) {
			System.out.println(cintavideo.id + " " + cintavideo.titulo + " " + cintavideo.autor + " " + cintavideo.precio + " " + cintavideo.actores + " " + cintavideo.duracion);
		}
	}
		
		
	


}
