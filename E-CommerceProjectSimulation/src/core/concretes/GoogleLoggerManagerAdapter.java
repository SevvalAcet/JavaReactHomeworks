package core.concretes;

import GoogleLogger.GoogleLoggerManager;
import core.abstracts.LoggerService;

public class GoogleLoggerManagerAdapter implements LoggerService{
	@Override
	public void register() {
		GoogleLoggerManager manager = new GoogleLoggerManager();
		manager.register();
		
	}
}
