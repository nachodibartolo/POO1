public class Visitante extends Persona{
   
   private int altura, dineroDisponible;

   public Visitante(String nombre, int altura, int dinero){
      super(nombre);
      this.altura = altura;
      this.dineroDisponible = dinero;
   }

   public void IngresarAlParque(Parque parque){
      parque.IngresarVisitante(this);
   }

   public boolean VerificarSaldo(int costoEntrada){
      return (this.dineroDisponible > costoEntrada);
   }

   public void PagarBoleto(int costoEntrada){
      this.dineroDisponible -= costoEntrada;
   }
   
}
