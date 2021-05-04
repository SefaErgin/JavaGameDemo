package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class OrderManager implements OrderService{

	@Override
	public void getOrder(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " Ýsimli Oyun " + customer.getFirstName() + " Ýsimli Kullanýcýya " + campaign.getDiscount() + " Kadarlýk Kampanyayla Satýldý.");		
	}

}
