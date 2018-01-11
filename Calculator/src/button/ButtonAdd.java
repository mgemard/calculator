package button;

import java.util.Locale;

import javax.swing.JTextArea;

import command.CommandAdd;
import core.Calculator;

public class ButtonAdd extends Button {

    public ButtonAdd(Calculator calculator) {
        super(calculator);
        setText("+");
    }

    @Override
    public void click() {

        calculator.updateTextArea();
        
        calculator.setMemory(Double.valueOf(calculator.getDisplay().getText()));
        calculator.setCommand(new CommandAdd());
    }

}
