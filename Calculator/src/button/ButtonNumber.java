package button;

import javax.swing.JTextArea;

import core.Calculator;

public class ButtonNumber extends Button {

    private String number;

    public ButtonNumber(String number, Calculator calculator) {
        super(calculator);
        this.number = number;
        setText(number);
    }

    @Override
    public void click() {
        JTextArea display = calculator.getDisplay();
        
        String text = display.getText();
        if(text == "0") {
            if (String.valueOf(number) == "0") {
                return;
            }
        }else if(number == ".") {
            if (text.contains(".")) {
                return;
            }
        }
        
        if (!calculator.isReset()) {
            String newText = text + number;
            display.setText(newText);

        } else {
            display.setText(String.valueOf(number));
            calculator.setReset(false);
        }
    }

}
