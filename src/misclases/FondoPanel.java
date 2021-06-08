package misclases;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class FondoPanel extends JPanel{
        private ImageIcon imagen;
        private String ruta;
    public FondoPanel(String ruta) {
        this.ruta = ruta;
    }
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),null);
            setOpaque(false);
            super.paint(g);
        }

    public FondoPanel() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
        this.repaint();
    }
    }
