package h06;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdrachtH6 extends Applet {

    int a, b, c;
    double uitkomst;


    public void init() {
        a = 59;
        b = 63;
        c = 69;
        uitkomst = (a + b + c);
        a = 191;
        b = 3;
        uitkomst = (a/b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
