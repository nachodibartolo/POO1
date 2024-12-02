public class Carussel extends Atraccion{
   
   public Carussel(String nombre, int altura, int capacidad, int id){
    super(nombre, altura, capacidad, id);
   }

   @Override
   public void IniciarAtraccion(){
      System.out.println(String.format("\n%s da la vuelta.", this.nombre));
      this.TerminarTurno();
      System.out.println("Se bajaron los visitantes");
   }

   @Override
   public void ingresarOperador(Operador op, int id) {
      super.ingresarOperador(op, id);
   }

}
