package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundFigure extends Figure {

    private ArrayList<Figure> figures;

    public CompoundFigure(int x, int y) {

        super(x, y);
        this.figures = new ArrayList<Figure>();
    }
        public CompoundFigure() {

        super(0, 0);
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {

        this.figures.add(figure);
    }

    @Override
    public void draw(Graphics graphics) {

        for(Figure fig:this.figures){
        
        fig.draw(graphics);
        
        }
    }
    
    public void move(int x,int y){
    
    
       for(Figure fig:this.figures){
        
        fig.move(x, y);
        
        }
    
    
    }

}
