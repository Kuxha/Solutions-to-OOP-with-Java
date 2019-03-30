
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    @Override
    public void run() {
        this.calculator = new Calculator();
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(300, 150));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textOutput = new JTextField("0");
        textOutput.setEnabled(false);
        JTextField textInput = new JTextField("");

        container.add(textOutput);
        container.add(textInput);
        container.add(createPanel(textInput, textOutput));

    }

    private JPanel createPanel(JTextField input, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");

        panel.add(plus);
        panel.add(minus);
        panel.add(reset);

        CalciListener calculatorListener = new CalciListener(this.calculator, input,
                output, plus, minus, reset);
        plus.addActionListener(calculatorListener);
        minus.addActionListener(calculatorListener);
        reset.addActionListener(calculatorListener);
        reset.setEnabled(false);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
