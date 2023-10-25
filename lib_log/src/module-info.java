/**
 * @author Sergio Morel
 */
module lib_log
{
	exports py.com.semp.lib.log;
	exports py.com.semp.lib.log.loggers;
	exports py.com.semp.lib.log.utilities;
	exports py.com.semp.lib.log.configuration;
	
	requires transitive lib_utilidades;
	requires org.junit.jupiter.api;
}