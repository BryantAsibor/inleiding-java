package h02;
import java.applet.*;
import java.awt.*;

public class Naam extends Applet {
    public void init (){
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Bryant", 50, 60 );
    }

}

