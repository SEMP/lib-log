/**
 * @author Sergio Morel
 */
module lib_log
{
	exports py.com.semp.lib.log;
	exports py.com.semp.lib.log.loggers;
	exports py.com.semp.lib.log.configuration;
	exports py.com.semp.lib.log.enumerations;
	
	requires transitive lib_utilidades;
	requires org.junit.jupiter.api;
}