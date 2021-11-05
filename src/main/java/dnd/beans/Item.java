package dnd.beans;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	String name;
	String description;
	String state;
}
