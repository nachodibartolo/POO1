public class Operador extends Persona{

   private Atraccion aCargoDe;
   private int parqueID;
   
   public Operador(String nombre, int parqueid){
      super(nombre);
      this.aCargoDe = null;
      this.parqueID = parqueid;
   }

   public void IniciarAtraccion(){
      aCargoDe.IniciarAtraccion();
   }

   public void ponerACargoDe(Atraccion atraccion){
      this.aCargoDe = atraccion;
   }
}
