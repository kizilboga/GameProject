package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli % "+ campaign.getDiscount()+" indirimli kampanya ekelenmi�tir");
		
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya kald�r�lm��t�r");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya g�ncellenmi�tir");
	}

}
