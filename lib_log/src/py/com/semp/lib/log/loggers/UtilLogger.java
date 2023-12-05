package py.com.semp.lib.log.loggers;

import py.com.semp.lib.utilidades.log.LogLevel;
import py.com.semp.lib.utilidades.log.Logger;

public class UtilLogger implements Logger
{
	@Override
	public void log(LogLevel level, String message)
	{
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	@Override
	public void log(LogLevel level, String message, Throwable throwable)
	{
		// TODO Auto-generated method stub
		System.out.println(message);
		System.out.println(throwable.getMessage());
	}

	@Override
	public boolean isDebugging()
	{
		// TODO Auto-generated method stub
		return false;
	}
}