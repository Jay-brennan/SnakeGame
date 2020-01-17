import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BoardGUI extends JPanel{

    private final int BoardH = 750;
    private final int BoardW =750;
    public static JFrame jFrame;


    public BoardGUI() {
        jFrame = new JFrame();
        jFrame.setPreferredSize(new Dimension(getBoardW(), getBoardH()));
        // found .pack in class notes
        jFrame.pack();
        jFrame.setResizable(false);
        jFrame.setTitle("Snake");
        jFrame.setVisible(true);
        // Set location where jframe appears - https://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution
        jFrame.setLocationRelativeTo(null);
        Controller con = new Controller();
        jFrame.add(con);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    //accessor methods

    public int getBoardH() {
        return BoardH;
    }

    public int getBoardW() {
        return BoardW;
    }


}

