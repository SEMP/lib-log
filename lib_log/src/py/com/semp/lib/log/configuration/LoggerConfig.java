package py.com.semp.lib.log.configuration;

import static py.com.semp.lib.log.configuration.Values.VariableNames.LOGGER_OUTPUT;

import py.com.semp.lib.log.enumerations.LoggerOutput;
import py.com.semp.lib.utilidades.configuration.ConfigurationValues;

public class LoggerConfig extends ConfigurationValues
{
	@Override
	protected void setRequiredParameters()
	{
		this.addRequiredParameter(LoggerOutput.class, LOGGER_OUTPUT);
	}
	
	@Override
	protected void setOptionalParameters()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void setDefaultValues()
	{
		this.setParameter(LoggerOutput.class, LOGGER_OUTPUT, Values.Defaults.LOGGER_OUTPUT);
		// TODO Auto-generated method stub
		
	}
}
