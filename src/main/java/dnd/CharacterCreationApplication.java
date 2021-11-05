package dnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dnd.beans.Attributes;
import dnd.beans.Item;
import dnd.beans.Player;
import dnd.controller.BeanConfiguration;
import dnd.repository.CharacterRepository;

@SpringBootApplication
public class CharacterCreationApplication {
	public static void main(String[] args) {
		SpringApplication.run(CharacterCreationApplication.class, args);
	}

//	@Autowired
//	CharacterRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		Player p = appContext.getBean("player", Player.class);
//		Attributes a = appContext.getBean("attributes", Attributes.class);
//		Item i = appContext.getBean("item", Item.class);
//		p.setAttributes(a);
//		p.setItem(i);
//		repo.save(p);
//		List<Player> allMyPlayers = repo.findAll();
//		
//		for (Player player : allMyPlayers) {
//			System.out.println(player.toString());
//		}
//		
//		((AbstractApplicationContext) appContext).close();
//	}
}
