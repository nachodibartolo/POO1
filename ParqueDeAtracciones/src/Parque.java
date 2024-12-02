import java.util.ArrayList;
import java.util.List;

public class Parque implements VentaDeBoletos{
   private int costoDeEntrada, capacidadMaxima, id;
   private List<Persona> seguridadActiva = new ArrayList<>();
   private List<Persona> visitantes = new ArrayList<>();

   public Parque(int costo, int capacidad, int id){
      this.costoDeEntrada = costo;
      this.capacidadMaxima = capacidad;
      this.id = id;
   }

   @Override
   public void VenderBoleto(Visitante visitante) {
      System.out.println("Se vendio un boleto.\n");
      visitantes.add(visitante);
   }

   public void IngresarVisitante(Visitante persona){
      if (persona.VerificarSaldo(this.costoDeEntrada)){
         persona.PagarBoleto(this.costoDeEntrada);
         this.VenderBoleto(persona);
      }
   }


}
