package button;

import command.CommandDivide;
import core.Calculator;

public class ButtonDivide extends Button {

    public ButtonDivide(Calculator calculator) {
        super(calculator);
        setText("/");
    }

    @Override
    public void click() {
        calculator.updateTextArea();
        
        calculator.setMemory(Double.valueOf(calculator.getDisplay().getText()));
        calculator.setCommand(new CommandDivide());
    }

}
