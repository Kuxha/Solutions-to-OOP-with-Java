
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalciListener implements ActionListener {

    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton plus;
    private JButton minus;
    private JButton reset;

    CalciListener(Calculator calculator, JTextField input, JTextField output, JButton plus, JButton minus, JButton reset) {

        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.plus = plus;
        this.minus = minus;
        this.reset = reset;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            pressPlus();
        } else if (e.getSource() == minus) {
            pressMinus();
        } else {
            pressReset();
        }
    }

    private void setOutput() {
        output.setText("" + calculator.getValue());
        reset.setEnabled(true);
    }

    private void pressPlus() {
        try {
            calculator.Plus(Integer.parseInt(input.getText()));
            setOutput();
        } catch (NumberFormatException exception) {
        }
        input.setText("");
    }

    private void pressMinus() {
        try {
            calculator.Minus(Integer.parseInt(input.getText()));
            setOutput();
        } catch (NumberFormatException exception) {
        }
        input.setText("");
    }

    private void pressReset() {
        calculator.Reset();
        output.setText("0");
        input.setText("");
        reset.setEnabled(false);
    }
}
