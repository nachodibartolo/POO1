import java.util.List;
import java.util.ArrayList;

public class Agencia {
   private String nombreAgencia;
   private List<Vehiculo> flota;

   public Agencia(String nombre){
      this.nombreAgencia = nombre;
      this.flota = new ArrayList<>();
   }

   public void agregarAFlota(Vehiculo vehiculo){
      this.flota.add(vehiculo);
   }

   public void listarVehiculos(){
      System.out.println(String.format("\nVehiculos de %s", nombreAgencia));
      int i =0;
      for (i = 0; i < flota.size(); i++) {
         if (flota.get(i).ocupado == true){
            System.out.println(String.format("[%s] - Alquilado por: %s", this.flota.get(i).codigo, this.flota.get(i).ocupantes.get(0).getNombre()));
         }
         else{
            System.out.println(String.format("[%s] - Disponible", this.flota.get(i).codigo));
         }
      }
   }

   public void alquilarVehiculo(String codigo, List<Persona> ocupantes){
      int i = 0;
      if (this.flota.get(i).codigo == codigo){
         this.flota.get(i).registrarOcupantes(ocupantes);
         System.out.println("\nVehiculo alquilado exitosamente");
      }
      i++;
   }

   public void entregarVehiculo(String codigo, int dias){
      int i = 0;
      if (this.flota.get(i).codigo == codigo){
         double costoTotal = this.flota.get(i).calcularCosto(dias);
         this.flota.get(i).liberar();
         System.out.println(String.format("\nVehiculo %s liberado exitosamente. Costo total = %.1f", codigo, costoTotal));
      }
      i++;
   }
}
