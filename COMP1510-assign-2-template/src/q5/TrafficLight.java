package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 * <p>This class draws a traffic light and a button. When the button
 * is pressed the colors of lights are updated. The listener for the button
 * uses a switch statement and an iterator to determine white lights should 
 * be on.</p>
 *
 * @author Denis Turitsa, Set C
 * @version 1.0
 */
public class TrafficLight  extends JFrame {
    /** The unique serial ID of the class TrafficLight.*/
    private static final long serialVersionUID = -8578692372498293145L;

    /** Height of the outer panel.*/
    private static final int THEIGHT = 420;
    
    /** Width of the outer panel. */
    private static final int TWIDTH = 200;
    /** Color of the top Traffic light. (red when on, black when off)*/
    private  Color topColor = Color.red;
    
    /** Color of the top Traffic light. (yellow when on, black when off). */
    private Color middleColor = Color.black;
    
    /** Color of the top Traffic light. (green when on, black when off). */
    private Color bottomColor = Color.black;
    
    /** Counter for how many times the button is pushed. */
    private int count;
    
    /** iterator to determine what part of the cycle the traffic light is in. */
    private int position;
    
    /**A panel that contains the button and DrawingPanel. */
    private JPanel panel = new JPanel();
    
    /** A button that is used to change the traffic light. */
    private JButton button;


    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {
        super("Denis Turitsa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button = new JButton("Change");
        button.addActionListener(new ButtonListener());

        panel.add(button);
        panel.add(new DrawingPanel());

        panel.setBackground(Color.orange);


        getContentPane().add(panel);

        setSize(TWIDTH, THEIGHT);
        setVisible(true);
    }
    /**
     * Represents a listener for button push (action) events.
     */
    private class ButtonListener implements ActionListener {
        /**
         * <p>Updates the colors of the traffic light when the button is 
         * pressed. Uses a switch statement to determine the colors that 
         * the lights need to be.</p>
         * 
         * @param event The event produced by the button when it is pressed
         */
        public void actionPerformed(ActionEvent event) {
            //Number of lights. Used in the calculation to get the iterator.
            final int lightnum = 3;
            
            count++;
            position = count % lightnum;

            switch (position) {
            case 0 : 
                topColor = Color.red;
                middleColor = Color.black;  
                bottomColor = Color.black;                
                break;
            case 1 :  
                topColor = Color.black;  
                middleColor = Color.black;  
                bottomColor = Color.green;                
                break;   
            case 2 : 
                topColor = Color.black;  
                middleColor = Color.yellow;
                bottomColor = Color.black;                  
                break;
            default : 
                topColor = Color.black;  
                middleColor = Color.black;
                bottomColor = Color.black;
                
            } 
            panel.repaint();
        }
        
    }
    /** This is the panel that contains the lights the paint component, 
     * which draws the traffic light.
     */
    class DrawingPanel extends JPanel {
        /** A unique ID for the DrawingPanel.*/
        private static final long serialVersionUID = -1936027174564215297L;
        
        /** Drawing panel width.*/
        private static final int DWIDTH = 150;
        
        /** Drawing panel height.*/
        private static final int DHEIGHT = 350;
        
        /** This is the Constructor for the DrawingPanel.*/
        public DrawingPanel() {
            setPreferredSize(new Dimension(DWIDTH, DHEIGHT));
            setBackground(Color.gray);
        }
        /**
         * <p>Called by the environment when the frame needs to be updated.
         * Draws the three traffic lights.</p>
         * @param g the graphics context .
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //light diameter
            final int diam = 100;
            // x position of the lights
            final int x = 25;
            //top light y position
            final int topY = 10;
            //middle light y position
            final int middleY = 120;
            //bottom light y position
            final int bottomY = 230;
            
            g.setColor(topColor);
            g.fillOval(x, topY, diam, diam);
            g.setColor(middleColor);
            g.fillOval(x, middleY, diam, diam);
            g.setColor(bottomColor);
            g.fillOval(x, bottomY, diam, diam);

        }
    }


    /**
     * <p>The main method. Creates a new TrafficLight</p>
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new TrafficLight();
    }

};
