package py.com.semp.lib.log.loggers;

import py.com.semp.lib.utilidades.log.LogLevel;
import py.com.semp.lib.utilidades.log.Logger;

public class JSONLogger implements Logger
{
	public JSONLogger()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void log(LogLevel level, String message)
	{
		this.log(level, message, null);
	}
	
	@Override
	public void log(LogLevel level, String message, Throwable throwable)
	{
		if(this.checkLevel(level))
		{
			// TODO Auto-generated method stub
			System.out.println(message);
			System.out.println(throwable.getMessage());
		}
	}

	private boolean checkLevel(LogLevel level)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDebugging()
	{
		// TODO Auto-generated method stub
		return false;
	}
}