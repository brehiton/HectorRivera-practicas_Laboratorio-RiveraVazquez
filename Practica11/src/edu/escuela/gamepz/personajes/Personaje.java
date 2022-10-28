package edu.escuela.gamepz.personajes;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;

public abstract class Personaje{
	protected String nombre;
	protected int vida;

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
		if (years >= 0 && years <= 98 ){
			vida = years;
			result = true;
		}
		return result;
	}
	public String getDetalle(){
		return nombre + "\t" + vida; 
	}

	public abstract void decVida();

	public void decVida(int vida){
		if (this.vida - vida >= 0 && this.vida - vida <= 99){
			this.vida -= vida;
		}
	}

	public abstract void addVida();

	public void addVida(int suma){
		suma = (int)(Math.random()*99);
		vida += suma;
	}
}