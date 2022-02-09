import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class GUI extends JFrame {
    public static void main(String args[]){

        JFrame frame=new JFrame();
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        frame.setSize(600, 700);
        frame.setVisible(true);
        frame.setLocation(300, 200);
        frame.setBackground(new Color(85, 150, 68));
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setTitle("Book Store");
    
        
        
        Button button1 = new Button("Book list");
        Button button2 = new Button("Customer list");
        Button button3 = new Button("Search a book");
        Button button4 = new Button("Search a customer");
        Button button5 = new Button("Rent");

        JLabel tf=new JLabel();  

        Bookstore B1 = new Bookstore();
        Custtester C1 = new Custtester();


        button1.addActionListener(event -> {  
            tf.setText("Check booklist.txt for more information");
            try{
                PrintWriter out = new PrintWriter("booklist.txt"); 
                out.println(B1.printTXT());
                out.close();
             } catch(FileNotFoundException fnfE) {
                System.out.println(fnfE);
             }
             JFrame frame1 = new JFrame("booklist");
             JLabel tf1=new JLabel(B1.printAll(), SwingConstants.LEFT); 
                frame1.setLocation(300,200);
                frame1.setSize(700,700);
                frame1.setVisible(true);
                frame1.add(tf1);
        });  

        button2.addActionListener(event -> {  
            tf.setText("Check customerlist.txt for more information");
            try{
                PrintWriter out1 = new PrintWriter("customerlist.txt");
                out1.println(C1.printTXT());
                out1.close();
            } catch(FileNotFoundException fnfE) {
                System.out.println(fnfE);
            }

            JFrame frame2 = new JFrame("Customer list");
            JLabel tf2=new JLabel(C1.printAll(), SwingConstants.LEFT); 
                frame2.setLocation(300,200);
                frame2.setSize(600,600);
                frame2.setVisible(true);
                frame2.add(tf2);
        });  

        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                JFrame frame3 = new JFrame("Search a book");
                JTextArea txtInput = new JTextArea(30,15);
                JLabel tf3 = new JLabel("nothing entered");
                JButton b = new JButton("click");
                JPanel p = new JPanel();
                p.add(txtInput);
                p.add(b);
                p.add(tf3);
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                    String s = ae.getActionCommand();
                    if (s.equals("click")) {
                // set the text of the label to the text of the field
                    tf3.setText(txtInput.getText());
                    String input = txtInput.getText();
                    if(B1.Search(input).equals("-1")) {
                        tf3.setText("<html>" + txtInput.getText() + " Book not found<br/>Please enter the correct book title<html/>");
                    } else {
                        tf3.setText(B1.Search(input));
                    }}}});

                frame3.setLocation(300,200);
                frame3.setSize(500,400);
                frame3.setVisible(true);
                frame3.add(p);
                
            }
        });

        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame4 = new JFrame("Search a customer");
                JTextArea txtInput4 = new JTextArea(10,10);
                JLabel tf4 = new JLabel("nothing entered");
                JButton b4 = new JButton("click");
                JPanel p4 = new JPanel();
                p4.add(txtInput4);
                p4.add(b4);
                p4.add(tf4);
                b4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                    String s = ae.getActionCommand();
                    if (s.equals("click")) {
                // set the text of the label to the text of the field
                    tf4.setText(txtInput4.getText());
                    String input = txtInput4.getText();
                    if(C1.Search(input).equals("-1")) {
                        tf4.setText("<html>" + txtInput4.getText() + " Customer not found<br/>Please enter the correct first name<html/>");
                    } else {
                        tf4.setText(C1.Search(input));
                    }}}});

                frame4.setLocation(300,200);
                frame4.setSize(500,400);
                frame4.setVisible(true);
                frame4.add(p4);
                
            }
        });


        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                JFrame frame5 = new JFrame("Rent a book");
                JTextArea txtInput5 = new JTextArea(20,20);
                JLabel tf5 = new JLabel("nothing entered");
                JButton b5 = new JButton("click");
                JPanel p5 = new JPanel();
                p5.add(txtInput5);
                p5.add(b5);
                p5.add(tf5);
                b5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                    String s = ae.getActionCommand();
                    if (s.equals("click")) {
                        tf5.setText(txtInput5.getText());
                        String input = txtInput5.getText();
                    if(B1.Search(input).equals("-1")) {
                        tf5.setText("<html>" + txtInput5.getText() + " Book not found<br/>Please enter the correct book title<br/>that you want to rent <html/>");
                    } else {
                        tf5.setText("<html> You rent the book<br/>" + B1.Search(input) +"<br/>see Rentbooklist.txt for more information<html/>");
                        try{
                            PrintWriter out5 = new PrintWriter("Rentbooklist.txt"); 
                            out5.println(B1.Rent(input));
                            out5.close();
                         } catch(FileNotFoundException fnfE) {
                            System.out.println(fnfE);
                         }
                    }}}});

                frame5.setLocation(300,200);
                frame5.setSize(500,600);
                frame5.setVisible(true);
                frame5.add(p5);
                
            }
        });
       
       
        button1.setBounds(150, 100, 300, 50);
        button2.setBounds(150, 150, 300, 50);
        button3.setBounds(150, 200, 300, 50);
        button4.setBounds(150, 250, 300, 50);
        button5.setBounds(150, 300, 300, 50);
        tf.setBounds(150, 400, 300, 50);
        frame.setLayout(null);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(tf);  
    
    }



}

