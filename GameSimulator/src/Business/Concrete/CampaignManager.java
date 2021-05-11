package Business.Concrete;

import Business.Abstract.CampignService;
import Entities.Concrete.Campaign;


public class CampaignManager implements CampignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya eklendi ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya silindi ");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya güncellendi ");
		
	}



}
