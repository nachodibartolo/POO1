public class MontanaRusa extends Atraccion{
   
   public MontanaRusa(String nombre, int altura, int capacidad, int id){
      super(nombre, altura, capacidad, id);
   }

   @Override
   public void IniciarAtraccion(){
      System.out.println(String.format("\n%s da la vuelta.", this.nombre));
      this.TerminarTurno();
      System.out.println("Se bajaron los visitantes");
   }
}
