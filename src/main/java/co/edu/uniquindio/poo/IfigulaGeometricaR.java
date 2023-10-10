package co.edu.uniquindio.poo;

public interface IfigulaGeometricaR {


   void calcularArea(); 
   void cacularPerimetro();

   default float sumaAngulosInteriosres(){
      return 0; 
   }

   default void calcularLongitudApotemas(){
   }

   default void calcularDiagonalCuadrados(){
   }

   default void calcularAlturaTriangulo(){
   }



   
}
