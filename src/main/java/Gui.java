import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    JPanel frame = new JPanel();
    JPanel controls = new JPanel();
    JPanel gameBoard = new JPanel();
    JButton newGame = new JButton();

    Gui(){

        setSize(700, 500);
        add(frame);
        frame.add(gameBoard);
        gameBoard.setSize(400,400);
        int buttons = 4;
        add(gameBoard);
        gameBoard.setLayout(new GridLayout(buttons, buttons));



        for(int i =1 ; i <= buttons*4; i++){
            Button button = new Button();
            gameBoard.add(button);
            button.addActionListener( this);
        }
        frame.add(controls);
        controls.setSize(700, 100);
        controls.setLayout(new FlowLayout());
        controls.add(newGame);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.getSource());
    }
}
