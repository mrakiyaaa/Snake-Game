import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random.*;
import java.awt.event.*;


public class SnakeGame extends JPanel implements ActionListener, KeyListener{
    
    private class Tile {
        int x;
        int y;
        
        Tile (int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
