package generadorn;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaAlea extends JFrame{
    
    JPanel panel = new JPanel();
    
    public PruebaAlea(){
        setBounds(450,500,500,450);
        setVisible(true);
        setLocationRelativeTo(null);//posisiona la ventana en el medio
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        setResizable(true);
        Texto();
        boton();
    }
    
    public void Texto(){
        JLabel txtitle = new JLabel("EN CONSTRUCCIÓN");
        txtitle.setBounds(110, 150, 350, 50);
        txtitle.setFont(new Font("Serif", Font.PLAIN, 30));
        panel.add(txtitle);
    }
    
    public void boton(){
        JButton btnr = new JButton("REGRESAR AL INICIO");
        btnr.setBounds(280, 350, 180, 30);
        panel.add(btnr);
        
        ActionListener regresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Menu m = new Menu();
                m.setVisible(true);
                dispose();
            }
            
        };
        btnr.addActionListener(regresar);
    }
}
