/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrushapplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Rithie7
 */
class Tela extends JPanel implements ActionListener {


    public int x;
    public int y;
    public int width;
    public int height;

    //botoes
    public JButton retabtn;
    public JButton rectangbtn;
    public JButton circunferenciabtn;
    public JButton freestylebtn;
    public JButton pontobtn;
    private Figura user_action;

    public enum Figura {PONTO, RETA, RETANGULO, CIRCULO, FREE};

    JButton cbtn, fbtn, SMbtn, Ubtn, Rbtn, Sbtn, Lbtn,SEbtn,Dbtn;

    Color colorBK = (Color.BLACK), colorWH = (Color.RED);

    public Tela() {

        final Figura user_action = Figura.PONTO;

        setBorder(BorderFactory.createLineBorder(Color.black));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.LIGHT_GRAY);
        JPanel btnPanel1 = new JPanel();
        btnPanel1.setBackground(Color.DARK_GRAY);

        Box thebox = Box.createVerticalBox();//Box.createHorizontalBox();
        //Box thebox1 = Box.createVerticalBox();

        // Criando e definindo icones dos botoes
        pontobtn = new JButton(""); // ponto
        pontobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/ponto_icon.png")));

        freestylebtn = new JButton(""); // lapis freestylebtn
        freestylebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/lapis_icon.png")));

        retabtn = new JButton(""); // linha
        retabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paintbrushapplication/img/reta_icon.png")));

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
        retabtn.addActionListener(this);
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
        thebox.add(retabtn);
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

        //listeners
        // quando o mouse é clicado, o ponto inicial é registrado nas variáveis x e y
        addMouseListener(new MouseAdapter() {
              public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println("Mouse Debug <pressed> : " + x + " x | " + y + " y");
                setCursor( Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) );
              }
        });
        //
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                width = e.getX();
                height = e.getY();
                System.out.println("Mouse Debug <dragged> : " + width + " w | " + height + " h");
                repaint();
                // adiciona cursor especifico quando o mouse eh arrastado.
                setCursor(
                    Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }

            // quando o btn do mouse for solto, pegar a posição final de salvar
            //a forma geométrica em um array
            public void mouseReleased(MouseEvent e) {
                    width = e.getX();
                    height = e.getY();
                    if (user_action == Figura.PONTO) {
                        //shape.add(new Lines(x, y, w, h, c));
                    } else if (user_action == Figura.RETA) {
                        //shape.add(new Rectangles(x, y, w, h, c));
                    } else if (user_action == Figura.RETANGULO) {
                        //shape.add(new Oval(x, y, w, h, c));
                    } else if (user_action == Figura.CIRCULO) {
                        //
                    } else if (user_action == Figura.FREE) {

                    }

                    repaint();
                    setCursor(
                        Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

        });


    }//final construtor

    @Override
        public void actionPerformed(ActionEvent e) {

          if (e.getSource() == pontobtn) {
              user_action = Figura.PONTO;
          } else if (e.getSource() == retabtn) {
              user_action = Figura.RETA;
          } else if (e.getSource() == rectangbtn) {
              user_action = Figura.RETANGULO;
          } else if (e.getSource() == circunferenciabtn) {
              user_action = Figura.CIRCULO;
          } else if (e.getSource() == freestylebtn) {
              user_action = Figura.FREE;
          }

        }
    @Override
        protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          Graphics2D g2d = (Graphics2D) g;
          g2d.setColor(Color.PINK);
          if ( this.user_action == Figura.RETA ) {
              g2d.drawLine(x, y, this.width, this.height);
          } else if (this.user_action == Figura.RETANGULO) {
              g2d.drawRect(Math.min(x, y), Math.min(y, this.height), Math.abs(x - this.width), Math.abs(y - this.height));
          } else if (this.user_action == Figura.CIRCULO) {
              g2d.drawOval(Math.min(x, this.width), Math.min(y, this.height), Math.abs(x - this.width), Math.abs(y - this.height));
          }
        }

}
