package edu.escuela.gamepz.personajes;

public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		//setEdad(edad);

	}

	public Personaje(String nombre){
		this(nombre, 3);

	}
	public int getVida(){
		return vida;
	}

	public void setNombre(String nombre){
		if (nombre.length() > 5 && nombre.length() < 25){
			this.nombre = nombre;
		}
		//System.out.println(nombre.length());
	}

	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO" + nombre);
	}
	public boolean setVida(int years){
		boolean result = false;
		if (years > 0 && years < 99 ){
			vida = years;
			result = true;
		}
		return result;
	}
	public String getDetalle(){
		return nombre + "\t" + vida; 
	}

	public void decVida(){
		vida -= 1;
	}

	public void decVida(int resta){
		resta = (int)(Math.random()*99);
		vida -= resta;
	}

	public void addVida(){
		vida += 1;
	}

	public void addVida(int suma){
		suma = (int)(Math.random()*99);
		vida += suma;
	}
}