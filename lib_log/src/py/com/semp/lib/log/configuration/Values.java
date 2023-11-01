package py.com.semp.lib.log.configuration;

import py.com.semp.lib.log.enumerations.LoggerOutput;

/**
 * Contains the value of constants used in the project.
 * 
 * @author Sergio Morel
 */
public interface Values
{
	/**
	 * Contains constants values
	 * 
	 * @author Sergio Morel
	 */
	public interface Constants
	{
		//Strings
		/**
		 * Context name for the utilities library
		 */
		public static final String LOGS_CONTEXT = "lib_log";
		
		/**
		 * Path where the messages for localization are found.
		 */
		public static final String MESSAGES_PATH = "/py/com/semp/lib/log/";
	}
	
	/**
	 * Contains resources names
	 * 
	 * @author Sergio Morel
	 */
	public interface Resources
	{
		/**
		 * Base name of the boundle of properties files for each language.
		 */
		public static final String MESSAGES_BASE_NAME = "messages";
	}
	
	public interface VariableNames
	{
		//Enum variables
		/**
		 * Indicates where the destination of the log output.
		 */
		public static final String LOGGER_OUTPUT = "loggerOutput";
	}
	
	/**
	 * Contains constants with default values.
	 * 
	 * @author Sergio Morel
	 */
	public interface Defaults
	{
		/**
		 * Indicates where the destination of the log output.
		 */
		public static final LoggerOutput LOGGER_OUTPUT = LoggerOutput.FILE;
	}
	
	public static interface Utilitites extends py.com.semp.lib.utilidades.configuration.Values
	{
	}
}