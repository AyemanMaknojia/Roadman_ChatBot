import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 29 17:46:48 CDT 2023
 */



/**
 * @author ayemanmaknojia
 */
public class Roadmanjfd extends Container {
    public Roadmanjfd() {

        initComponents();
        Chat.setEditable(false);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Design");
        frame.setContentPane(new Roadmanjfd().panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 750);
        frame.setVisible(true);

    }

    private void UserInputKeyPressed(KeyEvent e) {
        // TODO add your code here
       if(e.getKeyChar()==KeyEvent.VK_ENTER ){
           buttonMouseClicked();
       }
    }


    private void buttonMouseClicked(MouseEvent e) {
        // TODO add your code here
        String input = UserInput.getText();
        Chat.setText(Chat.getText()+"\n"+input);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ayeman Maknojia
        panel = new JPanel();
        button = new JButton();
        title = new JLabel();
        scrollPane2 = new JScrollPane();
        UserInput = new JTextPane();
        scrollPane3 = new JScrollPane();
        Chat = new JTextArea();

        //======== panel ========
        {
            panel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel. getBorder () ) ); panel. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );
            panel.setLayout(null);

            //---- button ----
            button.setText("Send");
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buttonMouseClicked(e);
                }
            });
            panel.add(button);
            button.setBounds(new Rectangle(new Point(300, 220), button.getPreferredSize()));

            //---- title ----
            title.setText("Roadman Chatbot");
            panel.add(title);
            title.setBounds(new Rectangle(new Point(180, 20), title.getPreferredSize()));

            //======== scrollPane2 ========
            {

                //---- UserInput ----
                UserInput.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        UserInputKeyPressed(e);
                    }
                });
                scrollPane2.setViewportView(UserInput);
            }
            panel.add(scrollPane2);
            scrollPane2.setBounds(20, 225, 275, scrollPane2.getPreferredSize().height);

            //======== scrollPane3 ========
            {

                //---- Chat ----
                Chat.setWrapStyleWord(true);
                Chat.setLineWrap(true);
                scrollPane3.setViewportView(Chat);
            }
            panel.add(scrollPane3);
            scrollPane3.setBounds(15, 35, 350, 180);

            panel.setPreferredSize(new Dimension(400, 300));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ayeman Maknojia
    private JPanel panel;
    private JButton button;
    private JLabel title;
    private JScrollPane scrollPane2;
    private JTextPane UserInput;
    private JScrollPane scrollPane3;
    private JTextArea Chat;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
