package py.com.semp.lib.log.utilities;

import java.util.concurrent.ConcurrentHashMap;

import py.com.semp.lib.log.internal.MessageUtil;
import py.com.semp.lib.log.internal.Messages;
import py.com.semp.lib.log.loggers.JSONLogger;
import py.com.semp.lib.utilidades.log.Logger;

public final class LoggerManager
{
	private static final ConcurrentHashMap<String, Logger> LOGGERS = new ConcurrentHashMap<>();
	
	private LoggerManager()
	{
		super();
		
		String errorMessage = MessageUtil.getMessage(Messages.DONT_INSTANTIATE, this.getClass().getName());
		
		throw new AssertionError(errorMessage);
	}
	
	private static Logger getDefaultLogger()
	{
		return new JSONLogger();
	}
	
	public static Logger getLogger(String context)
	{
		checkContextName(context);
		
		return LOGGERS.computeIfAbsent(context, (key) -> getDefaultLogger());
	}
	
	public static void setLogger(String context, Logger logger)
	{
		LOGGERS.put(context, logger);
	}
	
	private static void checkContextName(String context)
	{
		if(context == null || context.trim().isEmpty())
		{
			String errorMessage = MessageUtil.getMessage(Messages.INVALID_NAME_ERROR, context);
			
			throw new IllegalArgumentException(errorMessage);
		}
	}
}