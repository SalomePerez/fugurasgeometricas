package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Circulo extends FiguraRegularCirculo implements IfiguraGeometriCirculo, IfigulaGeometricaR{

    public Circulo(float radio) {
        super(radio);
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (this.getRadio()* this.getRadio());
        JOptionPane.showMessageDialog(null, "El area del circulo es:"+ area);
    }
     //P = 2 * π * r
    @Override
    public void cacularPerimetro() {
        double perimetro = (2*(Math.PI*(this.getRadio()*this.getRadio())));
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es :"+ perimetro);
    }
     //Diámetro = 2 * Radio
    @Override
    public void calcularDiametroCirculo() {
     double diametro = 2*getRadio();
         JOptionPane.showMessageDialog(null, "El diametro del circulo es :"+ diametro);        
    }
    
}
