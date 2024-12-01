import java.util.ArrayList;
import java.util.List;

public class Parque implements VentaDeBoletos{
   private int costoDeEntrada, capacidadMaxima;
   private List<Persona> seguridadActiva = new ArrayList<>();
   private List<Persona> visitantes = new ArrayList<>();

   public Parque(int costo, int capacidad){
      this.costoDeEntrada = costo;
      this.capacidadMaxima = capacidad;
   }
}
