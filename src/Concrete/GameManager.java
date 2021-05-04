package Concrete;

import Abstracts.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName()+ " isimli oyunun sat�n alma i�lemi ger�ekle�mi�tir.\nToplam Tutar: "
				+game.getPrice()
				+ "\n�yi Oyunlar! "+ gamer.getFirstName().toUpperCase()
				);
		
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName()+" isimli oyunun sat�n alma i�lemi ger�ekle�mi�tir. \nToplam Tutar: "
				+ game.getPriceAfterDiscount(campaign)+ "\nKullan�lan kampanya: "+ campaign.getCampaignName()+
				"\n�yi oyunlar "+gamer.getFirstName().toUpperCase()
			);
		
	}

}
