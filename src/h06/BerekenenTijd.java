package h06;
import java.awt.*;
import java.applet.*;

public class BerekenenTijd extends Applet {

    int a, b, c;
    double uitkomst;


    public void init() {
        a = 60;
        b = 60;
        uitkomst = (a * b);
        a= 3600;
        b= 24;
        uitkomst = (a * b);
        a= 86400;
        b= 365;
        uitkomst = (a * b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
