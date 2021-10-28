import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

    class GUI extends JFrame implements ActionListener  {
    JPanel controls = new JPanel();
    JPanel gameBoard = new JPanel();
    JButton newGame = new JButton("New Game");
    BufferedImage myPicture = ImageIO.read(new File("src/images.png"));
    JLabel pic = new JLabel(new ImageIcon(myPicture));


    GUI() throws IOException {

        setLayout(new GridLayout(2,1));
        add(gameBoard);
        add(controls);
        int buttons = 4;
        JButton []  arrayButton = new JButton[buttons*buttons];
        gameBoard.setLayout(new GridLayout(buttons, buttons));

        for(int i =0 ; i < buttons*buttons; i++){
            JButton button = new JButton(Integer.toString(i));
            arrayButton[i] = button;
            gameBoard.add(button);
            button.setForeground(Color.BLACK);
            button.setBackground(Color.MAGENTA);
            button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            button.setBorderPainted(true);
            button.addActionListener( this);
        }
        controls.add(newGame);
        controls.setBackground(Color.WHITE);
        controls.add(pic);
        newGame.addActionListener(this);
        newGame.setBackground(Color.orange);
        newGame.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setLocation(400,100);
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }




    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(event.paramString());

        if(event.getSource() == newGame)
            System.out.println("NewGame");
    }


}