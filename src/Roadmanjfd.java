import java.awt.*;
import java.awt.event.*;
import java.net.Socket;
import java.util.Random;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Apr 29 17:46:48 CDT 2023
 */



/**
 * @author ayemanmaknojia
 */
public class Roadmanjfd extends Container {
    int counter=0;
    public Roadmanjfd() {

        initComponents();
        Chat.setEditable(false);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Design");
        frame.setContentPane(new Roadmanjfd().panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    private void UserInputKeyPressed(KeyEvent e) {
        // TODO add your code here
        String bot="";
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            String input = "You : "+UserInput.getText().replace("\n","");

            bot="Roadman : "+chatbot(UserInput.getText());
System.out.print(counter);
            if(counter!=0) {
                Chat.setText(Chat.getText() +"\n" + input + "\n"+ bot);
            }else{
                Chat.setText(input + "\n" + bot);
                counter++;
            }

            if (UserInput.getText().contains("clear") && (UserInput.getText().contains("screen") || UserInput.getText().contains("chat"))) {
                Chat.setText("");
            }
            UserInput.setText("");
        }
    }

    public static String chatbot(String userinput) {
        Random random=new Random();
        String message = userinput;

        Socket sock = new Socket();


        if (message.contains("how are you")) {
            int num = random.nextInt(3);
            if (num == 0) {
                return("I'm good,how bout you big man ? ");
            } else if (num == 1) {
                return("I'm gucci fam, wagwan!");
            } else {
                return("I'm doin fine gang");
            }

        } else if (message.contains("you") && (message.contains("smart") || message.contains("good"))) {
            return("preciate it");
        } else if (message.contains("welcome")) {
            return("dont mention it bruv");
        } else if (message.contains("hi") && message.charAt(0) == 'h' || message.contains("hello") || message.contains("hey")) {

            int num = random.nextInt(3);
            if (num == 0) {
                return("Yo");
            } else if (num == 1) {
                return("Wagwan");
            } else if (num == 2) {
                return("What's good");
            } else if (num == 3) {
                return("oi bigman");
            }
        } else if (message.contains("bye")) {
            return("finally, now buzz off");
        } else if (message.contains("i am good") || message.contains("i am great") || message.contains("i am ") && message.contains("fine")) {

            return("you betta be");
        } else if (message.contains("thank")) {
            int num = random.nextInt(3);
            if (num == 0) {
                return("I gotchu big bruv ");
            } else if (num == 1) {
                return("oi oi oi no need to be so sappy");
            } else if (num == 2) {
                return("anytime blud");
            } else if (num == 3) {
                return("That's why i'm here for..");
            }
        } else if (message.contains("what") && message.contains("name")) {
            if (message.contains("your")) {
                return("Just call me roadman innit...");
            }
            if (message.contains("my")) {
                return("why should i know");
            }
        } else if (message.contains("change")) {
            return("I ain't doin all that");
        } else if (message.contains("date") || message.contains("month") || message.contains("year") || message.contains("day")) {
            return("are dumb bruv, check your phone");
        }  else {
            {
                int num = random.nextInt(3);
                if (num == 0) {

                    return("What you wafflin bout bruv?");
                } else if (num == 1) {
                    return("Come again mate?");
                } else if (num == 2) {
                    return("Oi bruv, quit yappin");
                }
            }
        }
        return message;
    }


    private void buttonMouseClicked(MouseEvent e) {
        // TODO add your code here
        String bot="";

            String input = "You : "+UserInput.getText().replace("\n","");

            bot="Roadman : "+chatbot(UserInput.getText());
            System.out.print(counter);
            if(counter!=0) {
                Chat.setText(Chat.getText() +"\n" + input + "\n"+ bot);
            }else{
                Chat.setText(input + "\n" + bot);
                counter++;
            }

            if (UserInput.getText().contains("clear") && (UserInput.getText().contains("screen") || UserInput.getText().contains("chat"))) {
                Chat.setText("");
            }
            UserInput.setText("");
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
            panel.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,panel. getBorder () ) ); panel. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
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
            button.setBounds(new Rectangle(new Point(385, 430), button.getPreferredSize()));

            //---- title ----
            title.setText("Roadman Chatbot");
            panel.add(title);
            title.setBounds(new Rectangle(new Point(205, 20), title.getPreferredSize()));

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
            scrollPane2.setBounds(25, 430, 355, 25);

            //======== scrollPane3 ========
            {

                //---- Chat ----
                Chat.setLineWrap(true);
                Chat.setWrapStyleWord(true);
                scrollPane3.setViewportView(Chat);
            }
            panel.add(scrollPane3);
            scrollPane3.setBounds(25, 50, 435, 355);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel.getComponentCount(); i++) {
                    Rectangle bounds = panel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel.setMinimumSize(preferredSize);
                panel.setPreferredSize(preferredSize);
            }
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
