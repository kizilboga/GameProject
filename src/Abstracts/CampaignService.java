package Abstracts;

import Entities.Campaign;

public interface CampaignService {
	void addCampaign(Campaign campaign);

	void removeCampaign(Campaign campaign);

	void updateCampaign(Campaign campaign);
}
