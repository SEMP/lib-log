package py.com.semp.lib.log.configuration;

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
		public static final String MESSAGES_PATH = "py/com/semp/lib/log";
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
	
	public static interface Utilitites extends py.com.semp.lib.utilidades.configuration.Values {}
}