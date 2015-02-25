
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class SnakeCanvas extends Canvas{
    
    private final int BOX_HEIGHT = 5;
    private final int BOX_WIDTH = 5;
    private final int GRID_WIDTH = 30;
    private final int GRID_HEIGHT = 30;
    
    public LinkedList<Point> snake;
    
    public void Draw(Graphics g){
    
    }
    public void DrawGrid(Graphics g){
        g.drawRect(0, 0, GRID_WIDTH*BOX_WIDTH, GRID_HEIGHT*BOX_HEIGHT);
        
        for(int x = BOX_WIDTH;x<GRID_WIDTH*BOX_WIDTH;x+=BOX_WIDTH){
            g.drawLine(x, 0, x, BOX_HEIGHT*GRID_HEIGHT);
        
        }
        
    }
}
