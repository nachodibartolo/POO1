public class Visitante extends Persona{
   
   private int altura, dineroDisponible;

   public Visitante(String nombre, int altura, int dinero){
      super(nombre);
      this.altura = altura;
      this.dineroDisponible = dinero;
   }
   
}
