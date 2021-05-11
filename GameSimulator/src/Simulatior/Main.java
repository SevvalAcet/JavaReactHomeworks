package Simulatior;

import java.time.LocalDate;
import java.util.Date;

import Adapters.MernisServerAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.PlayerManager;
import Business.Concrete.SaleManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Player;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Player player = new Player(1, "Þevval", "Acet", new Date(2001, 9, 06), "21155321550");
		PlayerManager PlayerManager = new PlayerManager(new MernisServerAdapter());
		PlayerManager.add(player);
		
		Game game = new Game(1, "CS:GO", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign(1, "Steam Kýþ Ýndirimi", 35);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.campaignSale(game, player, campaign);
	}

}
