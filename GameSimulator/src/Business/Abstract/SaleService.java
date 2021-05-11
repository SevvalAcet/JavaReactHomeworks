package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Player;

public interface SaleService {
	void sale(Player player,Game game);
	void campaignSale(Game game,Player player, Campaign campaign);
}
