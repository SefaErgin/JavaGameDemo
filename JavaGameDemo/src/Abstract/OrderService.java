package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface OrderService {
	void getOrder(Customer customer, Game game, Campaign campaign);

}
