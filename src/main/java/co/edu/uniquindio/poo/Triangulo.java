package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Triangulo extends FiguraRegular implements IfigulaGeometricaR{

    public Triangulo(float medidaLados) {
        super(medidaLados);
        //TODO Auto-generated constructor stub
    }
    //base * altura / 2
    @Override
    public void calcularArea() {
         float area = ((getMedidaLados()*getMedidaLados())*2);
         JOptionPane.showMessageDialog(null, "El area de este  triangulo es de :"+ area);
    }
    //como se calcula el perimetro de un triangulo 
    @Override
    public void cacularPerimetro() {
        float perimetro= getMedidaLados()+getMedidaLados()+getMedidaLados();
        JOptionPane.showMessageDialog(null, "El perimetro de el triangulo es :s"+perimetro);
    }
    //h = (2A) / b
    @Override
    public void calcularAlturaTriangulo() {

        int area=0;
        float  triangulo  = (2*area)/getMedidaLados();
        JOptionPane.showMessageDialog(null,"La altura del triangulo es:" +triangulo );
    }

    @Override
    public void calcularDiagonalCuadrados() {
        // TODO Auto-generated method stub
        IfigulaGeometricaR.super.calcularDiagonalCuadrados();
    }

    @Override
    public void calcularLongitudApotemas() {
        // TODO Auto-generated method stub
        IfigulaGeometricaR.super.calcularLongitudApotemas();
    }

    @Override
    public void sumaAngulosInteriosres() {
        // TODO Auto-generated method stub
        IfigulaGeometricaR.super.sumaAngulosInteriosres();
    }
    
}
