package button;

import javax.swing.JTextArea;

import core.Calculator;

public class ButtonSubstract extends Button {

    public ButtonSubstract(Calculator calculator) {
        super(calculator);
        setText("-");
    }

    @Override
    public void click() {
        JTextArea display = calculator.getDisplay();
        display.setText(display.getText() + "-");
    }

}
