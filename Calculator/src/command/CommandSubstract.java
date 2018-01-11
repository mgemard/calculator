package command;

public class CommandSubstract implements Command {

    @Override
    public Double execute(double memory, double textArea) {
        return memory - textArea;
    }

}
