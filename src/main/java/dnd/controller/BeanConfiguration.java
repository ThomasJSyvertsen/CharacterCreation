package dnd.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import dnd.beans.Attributes;
import dnd.beans.Item;
import dnd.beans.Player;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */

@Controller
public class BeanConfiguration {
	@Bean
	public Player player() {
		Player bean = new Player("Thomas", "Almi", 20, 20, 10);
		return bean;
	}
	
	@Bean 
	public Attributes attributes() {
		Attributes bean = new Attributes(15, 15, 15, 15, 15, 15);
		return bean;
	}
	
	@Bean 
	public Item item() {
		Item bean = new Item("Unending Flask", "Always have a drink to drink!", "Rusty, do not fret though. It adds spice.");
		return bean;
	}
}
