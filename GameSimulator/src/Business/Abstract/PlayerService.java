package Business.Abstract;

import Entities.Concrete.Player;

public interface PlayerService {
	
	void update(Player player);
    void add(Player player);
    void delete(Player player);
}
