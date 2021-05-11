package Adapters;



import java.rmi.RemoteException;
import java.time.ZoneId;

import Business.Abstract.PlayerCheckService;
import Entities.Concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServerAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
 		boolean result= false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()),
					player. getFirstName().toUpperCase(),
					player. getLastName().toUpperCase(),
					player. getDateOfBirh().toInstant().atZone( ZoneId.systemDefault()).toLocalDate().getYear());
		} 
		catch (RemoteException e) 
		{
			System.out.println(" Mernis çalýþmýyor!!");
		}

		return result;
	}

}