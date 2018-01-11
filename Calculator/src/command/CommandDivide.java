package command;

public class CommandDivide implements Command {

    @Override
    public Double execute(double memory, double textArea) {
        return memory / textArea;
    }

}
