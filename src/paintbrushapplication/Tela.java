/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrushapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Rithie7
 */
class Tela extends JPanel implements ActionListener {


    public int x, action = 0;
    public int y;
    public int w;
    public int h;

    Color colorBK = (Color.BLACK), colorWH = (Color.WHITE);

    JButton linhabtn;
    JButton rectangbtn;
    JButton circunferenciabtn;
    JButton freestylebtn;
    JButton pontobtn;

    JButton cbtn, fbtn, SMbtn, Ubtn, Rbtn, Sbtn, Lbtn,SEbtn,Dbtn;

    public Tela() {

        setBorder(BorderFactory.createLineBorder(Color.black));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.LIGHT_GRAY);
        JPanel btnPanel1 = new JPanel();
        btnPanel1.setBackground(Color.BLUE);

        Box thebox = Box.createVerticalBox();//Box.createHorizontalBox();
        //Box thebox1 = Box.createVerticalBox();

        // Criando e definindo icones dos botoes
        pontobtn = new JButton(""); // ponto
        pontobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/ponto_icon.png")));

        freestylebtn = new JButton(""); // lapis freestylebtn
        freestylebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/lapis_icon.png")));

        linhabtn = new JButton(""); // linha
        linhabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/reta_icon.png")));

        rectangbtn = new JButton(""); // retangulo
        rectangbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/rect_icon.png")));

        circunferenciabtn = new JButton(""); // circunferencia
        circunferenciabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/circunferencia_icon.png")));
        //cbtn = new JButton("Cores");

//        SMbtn = new JButton("Move  ");
//        Ubtn = new JButton("Undo  ");
//        Rbtn = new JButton("Redo  ");
//        Sbtn = new JButton("Save  ");
//        Lbtn = new JButton("Load  ");
//        SEbtn = new JButton("Select");
//        Dbtn = new JButton("Delete");

        // adicionando listeners
        pontobtn.addActionListener(this);
        freestylebtn.addActionListener(this);
        linhabtn.addActionListener(this);
        rectangbtn.addActionListener(this);
        circunferenciabtn.addActionListener(this);

//        SMbtn.addActionListener(this);
//        Ubtn.addActionListener(this);
//        Rbtn.addActionListener(this);
//        Sbtn.addActionListener(this);
//        Lbtn.addActionListener(this);
//        SEbtn.addActionListener(this);
//        Dbtn.addActionListener(this);

        // adicionando na caixa
        thebox.add(pontobtn);
        thebox.add(freestylebtn);
        thebox.add(linhabtn);
        thebox.add(rectangbtn);
        thebox.add(circunferenciabtn);

//        thebox.add(cbtn);
//        thebox1.add(Lbtn);
//        thebox1.add(Sbtn);
//        thebox1.add(SEbtn);
//        thebox1.add(Ubtn);
//        thebox1.add(Rbtn);
//        thebox1.add(SMbtn);
//        thebox1.add(Dbtn);

        btnPanel1.add(thebox);
//        btnPanel1.add(thebox1);

        this.add(btnPanel, BorderLayout.SOUTH);
        this.add(btnPanel1, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
