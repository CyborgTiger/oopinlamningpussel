import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class GUI extends JFrame implements ActionListener {

    JPanel controls = new JPanel();
    JPanel gameBoard = new JPanel();
    JButton newGame = new JButton();

    GUI(){

        setLayout(new GridLayout(2,1));
        add(gameBoard);
        add(controls);
        //controls.setSize(500,50);
        int buttons = 4;
        Button []  arrayButton = new Button[buttons*buttons];
        gameBoard.setLayout(new GridLayout(buttons, buttons));

        for(int i =1 ; i <= buttons*buttons; i++){
            Button button = new Button();
            arrayButton[i] = button;
            gameBoard.add(button);
            button.addActionListener( this);
        }
        controls.setLayout(new FlowLayout());
        controls.add(newGame);
        newGame.addActionListener(this);
        setLocationRelativeTo(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event);

        if(event.getSource() == newGame)
            System.out.println("NewGame");
    }


}
