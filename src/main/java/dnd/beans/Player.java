package dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */

@Entity
public class Player {
	@Id
	@GeneratedValue
	private Long id;
	private String playerName;
	private String characterName;
	private int totalHitPoints;
	private int currentHitPoints;
	private int hitDamage;
	@Autowired
	private Attributes attributes;
	@Autowired
	private Items items;
	
	
	
}
