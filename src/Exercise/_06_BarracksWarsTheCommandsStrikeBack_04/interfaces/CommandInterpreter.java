package src.Exercise._06_BarracksWarsTheCommandsStrikeBack_04.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
