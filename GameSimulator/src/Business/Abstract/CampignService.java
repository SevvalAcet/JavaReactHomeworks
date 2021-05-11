package Business.Abstract;

import Entities.Concrete.Campaign;


public interface CampignService {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
