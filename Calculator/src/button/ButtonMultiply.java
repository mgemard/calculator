package button;

import javax.swing.JTextArea;

import core.Calculator;

public class ButtonMultiply extends Button {

    public ButtonMultiply(Calculator calculator) {
        super(calculator);
        setText("*");
    }

    @Override
    public void click() {
        JTextArea display = calculator.getDisplay();
        display.setText(display.getText() + "*");
    }

}
