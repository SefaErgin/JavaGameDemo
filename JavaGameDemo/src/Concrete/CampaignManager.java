package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getDiscount() + ": Kadar Kampanya Yap�ld�.");		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi.");		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Silindi.");
		
	}
	

}
