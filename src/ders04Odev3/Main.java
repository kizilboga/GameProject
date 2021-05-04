package ders04Odev3;

import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("idris");
		gamer.setLastName("kýzýl");
		gamer.setNationalityId("91443160532");
		gamer.setDob(new GregorianCalendar(1986,03,02).getTime());
		
		Game game= new Game();
		game.setId(1);
		game.setGameName("FIFA2020");
		game.setDescription("Dünya genelindeki futbol takýmlarý...");
		game.setPrice(1000);
		
		Campaign campaign = new Campaign(1,"Genclere Özel", 20, true);
		
		GamerManager gamerManager= new GamerManager(new MernisServiceAdapter());
		gamerManager.addGamer(gamer);
		gamerManager.removeGamer(gamer);
		gamerManager.updateGamer(gamer);
		
		GameManager gameManager= new GameManager();
		gameManager.sellGame(game, gamer);
		gameManager.sellGame(game, gamer, campaign);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addCampaign(campaign);
		campaignManager.removeCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		
	}

}
