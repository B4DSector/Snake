import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private int[] snakexlenght = new int[750];
    private int[] snakeylenght = new int[750];

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private ImageIcon titleImage;
    private ImageIcon rightmouth;
    private ImageIcon leftmouth;
    private ImageIcon downmouth;
    private ImageIcon upmouth;
    private ImageIcon snakeImage;

    private int lengthofsnake = 3;

    private Timer timer;
    private int delay = 100;
    private int moves = 0;

    public GamePlay()
    {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g)
    {
        // Draw Title Image Border
        g.setColor(Color.white);
        g.drawRect(24, 10, 851, 55);

        // Draw The Title Image
        titleImage = new ImageIcon("assets/snaketitle.jpg");
        titleImage.paintIcon(this, g, 25, 11);

        // Draw Border For Game Play
        g.setColor(Color.white);
        g.drawRect(24, 74, 851, 577);

        // Draw Background Fr the Game Play
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 575);



        if(moves == 0)
        {
            snakexlenght[0] = 100;
            snakeylenght[0] = 100;
            snakexlenght[1] = 75;
            snakeylenght[1] = 100;
            snakexlenght[2] = 50;
            snakeylenght[2] = 100;
        }

//        rightmouth = new ImageIcon("assets/rightmouth.png");
//        rightmouth.paintIcon(this, g, snakexlenght[0], snakeylenght[0]);
     
        for (int a = 0; a < lengthofsnake; a++)
        {
            if(a == 0 && right)
            {
                rightmouth = new ImageIcon("assets/rightmouth.png");
                rightmouth.paintIcon(this, g, snakexlenght[a], snakeylenght[a]);
            }
            if(a == 0 && left)
            {
                leftmouth = new ImageIcon("assets/leftmouth.png");
                leftmouth.paintIcon(this, g, snakexlenght[a], snakeylenght[a]);
            }
            if(a == 0 && up)
            {
                upmouth = new ImageIcon("assets/upmouth.png");
                upmouth.paintIcon(this, g, snakexlenght[a], snakeylenght[a]);
            }
            if(a == 0 && down)
            {
                downmouth = new ImageIcon("assets/downmouth.png");
                downmouth.paintIcon(this, g, snakexlenght[a], snakeylenght[a]);
            }

            // If it's not the head
            if(a != 0)
            {
                snakeImage = new ImageIcon("assets/snakeimage.png");
                snakeImage.paintIcon(this, g, snakexlenght[a], snakeylenght[a]);
            }
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
