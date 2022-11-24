import java.applet.*;
import java.awt.*;

public class Design extends Applet {
    public void paint(Graphics g) {
        g.drawRect(10, 10, 50, 50);
        g.drawRect(20, 20, 40, 40);
        g.drawLine(10, 10, 20, 20);
        g.drawLine(40, 20, 50, 10);
        g.drawLine(20, 40, 10, 50);
        g.drawLine(40, 40, 50, 50);
    }
}
