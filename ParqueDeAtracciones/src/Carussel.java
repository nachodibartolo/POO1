public class Carussel extends Atraccion{
   
   public Carussel(String nombre, int altura, int capacidad){
    super(nombre, altura, capacidad);
   }

   public void DarLaVuelta(){
      System.out.println(String.format("\n%s da la vuelta.", this.nombre));
      this.TerminarTurno();
      System.out.println("Se bajaron los visitantes");
   }

}
