package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    private Figure figure;

    public DrawingBoard(Figure figure) {
        this.figure = figure;

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.figure.draw(g);
    }
}
