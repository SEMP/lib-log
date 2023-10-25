package py.com.semp.lib.log.utilities;

import java.util.concurrent.ConcurrentHashMap;

import py.com.semp.lib.log.internal.MessageUtil;
import py.com.semp.lib.log.internal.Messages;
import py.com.semp.lib.log.loggers.JSONLogger;
import py.com.semp.lib.log.loggers.UtilLogger;

public final class LoggerFactory
{
	private static final ConcurrentHashMap<String, UtilLogger> UTIL_LOGGERS = new ConcurrentHashMap<>();
	private static final ConcurrentHashMap<String, JSONLogger> JSON_LOGGERS = new ConcurrentHashMap<>();
	
	private LoggerFactory()
	{
		super();
		
		String errorMessage = MessageUtil.getMessage(Messages.DONT_INSTANTIATE, this.getClass().getName());
		
		throw new AssertionError(errorMessage);
	}
	
	public static UtilLogger getLogger(String context)
	{
		checkContextName(context);
		
		return UTIL_LOGGERS.computeIfAbsent(context, (key) -> new UtilLogger());
	}
	
	public static JSONLogger getJSONLogger(String context)
	{
		checkContextName(context);
		
		return JSON_LOGGERS.computeIfAbsent(context, (key) -> new JSONLogger());
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