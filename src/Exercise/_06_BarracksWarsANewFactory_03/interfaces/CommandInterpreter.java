package src.Exercise._06_BarracksWarsANewFactory_03.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
