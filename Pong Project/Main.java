import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
        
    private PongCanvas canvas;
    private JFrame myFrame;

    public Main(int width, int height) {
        myFrame = new JFrame("OLD Co. Pong");
        canvas = new PongCanvas(width,height); 
        
        Container thePane = myFrame.getContentPane();
        thePane.add(canvas, BorderLayout.CENTER);
        
        // Handle closing the window.
        myFrame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });

        myFrame.setResizable(false);
        myFrame.pack();
        myFrame.setLocation(100,100);
    }

    /**
     * Display this PongTable on the screen.
     */
    public void show() {
        myFrame.show();
        canvas.requestFocus();
    }

    /**
     * Hide this PongTable from view.
     */
    public void hide() {
        myFrame.hide();
    }

    public static void main(String[] args) {
        Main pt = new Main(300,200);
        pt.show();
    }


}
