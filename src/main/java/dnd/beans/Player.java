package dnd.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
	@OneToMany
	private Item item;
	
	public Player(String playerName, String characterName, int totalHitPoints, int currentHitPoints, int hitDamage) {
		this.playerName = playerName;
		this.characterName = characterName;
		this.totalHitPoints = totalHitPoints;
		this.currentHitPoints = currentHitPoints;
		this.hitDamage = hitDamage;
	}
}
