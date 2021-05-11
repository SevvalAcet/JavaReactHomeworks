package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale( Player player,Game game) {
		System.out.println(player.getFirstName()+" "+ game.getName() +" adlý oyunu satýn aldý");
		
	}

	@Override
	public void campaignSale(Game game, Player player, Campaign campaign) {
		System.out.println(
				
		        player.getFirstName()+" "+ player.getLastName()+" "+
		        game.getName()+" adlý oyunu "+
			    campaign.getName()+" kampanya kapsamýnda  "+"%" + 
			    campaign.getDiscountRate() + " indirimle " + 
		        discountedPrice(game.getPrice(), campaign.getDiscountRate()) +
		        " fiyata satýn aldý ");
		
	}


	private double discountedPrice(double Price, double discount) {
		return Price - ((Price * discount) / 100);
	}



}
