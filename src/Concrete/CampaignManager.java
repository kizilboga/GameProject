package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli % "+ campaign.getDiscount()+" indirimli kampanya ekelenmiþtir");
		
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya kaldýrýlmýþtýr");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " isimli kampanya güncellenmiþtir");
	}

}
