import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame
{ //create the first number area
    public JTextField text = new JTextField(10);
    //create the 2nd number area
    public JTextField text2 = new JTextField(10);
    public JTextField rslt = new JTextField(10);
    public int num = 11;
    public int number;
    public Calculator()
 {
  
      JFrame cover = new JFrame("My App");
      cover.setLayout(new FlowLayout());
      cover.setSize(260, 200);
      cover.setTitle("nisal's Calc.");
      cover.setVisible(true);
      
      cover.add(new JLabel("First Number   "));
      cover.add(text);
      cover.add(new JLabel("Second Number"));
      cover.add(text2);
      cover.add(new JLabel("Result"));
      cover.add(rslt);
      rslt.setEditable(false);
      JButton b = new JButton("/");
      cover.add(b);
      b.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
          String first = text.getText();
          String second = text2.getText();
           first.trim();
          second.trim();
          int a;
          int b;
          int c;
          a = Integer.parseInt(first);
          b = Integer.parseInt(second);
          c = a / b;
          rslt.setText(c+"");
      }
      } ); 
      JButton c = new JButton("+");
      cover.add(c);
      c.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
          String first = text.getText();
          String second = text2.getText();
          first.trim();
          second.trim();
          int a;
          int b;
          int c;
          a = Integer.parseInt(first);
          b = Integer.parseInt(second);
          c = a + b;
          rslt.setText(c+"");
      }
      } );
      JButton d = new JButton("-");
      cover.add(d);
      d.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
          String first = text.getText();
          String second = text2.getText();
          first.trim();
          second.trim();
          int a;
          int b;
          int c;
          a = Integer.parseInt(first);
          b = Integer.parseInt(second);
          c = a - b;
          rslt.setText(c+"");
      }
      } );
      
      JButton st = new JButton("x");
      cover.add(st);
      st.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
          String first = text.getText();
          String second = text2.getText();
           first.trim();
          second.trim();
          int a;
          int b;
          int c;
          a = Integer.parseInt(first);
          b = Integer.parseInt(second);
          c = a * b;
          rslt.setText(c+"");
      }
      } ); 
      JButton e = new JButton("Clear");
      cover.add(e);
      e.addActionListener( new ActionListener() 
      {
      @Override
      public void actionPerformed(ActionEvent e){
          text.setText(null);
          text2.setText(null);
          rslt.setText(null);
      }
      } );
      
      
 }
 public static void main(String args[])
 {        
   Calculator nw = new Calculator();
 } 
}