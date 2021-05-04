import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "sefa@sefa.com", "123456", "Sefa", "Ergin", 1999, "11111111111");
		customerManager.addCustomer(customer);
		customerManager.deleteCustomer(customer);
		
		GameManager gameManager = new GameManager();
		Game game = new Game(1, "Valorant", 150);
		gameManager.addGame(game);
		gameManager.updateGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "Bahar Kampanyası", 7, true);
		campaignManager.addCampaign(campaign);
		
		OrderManager orderManager = new OrderManager();
		orderManager.getOrder(customer, game, campaign);
	}

}
