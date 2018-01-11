package button;

import command.CommandSubstract;
import core.Calculator;

public class ButtonSubstract extends Button {

    public ButtonSubstract(Calculator calculator) {
        super(calculator);
        setText("-");
    }

    @Override
    public void click() {
        calculator.updateTextArea();
        
        calculator.setMemory(Double.valueOf(calculator.getDisplay().getText()));
        calculator.setCommand(new CommandSubstract());
    }

}
