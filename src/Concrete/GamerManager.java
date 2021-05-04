package Concrete;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " "+gamer.getLastName()+ " added. \nWELCOME " +gamer.getFirstName().toUpperCase()+"!!!" );
		}else {
			System.out.println(gamer.getFirstName()+" " + gamer.getLastName() + " not added");
		}

	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " " + gamer.getLastName()+ " deleted");

	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+ " updated");

	}

}
