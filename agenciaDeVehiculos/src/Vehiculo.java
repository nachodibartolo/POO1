import java.util.List;
import java.util.ArrayList;

public abstract class Vehiculo {
   protected String codigo;
   protected int costoDiario;
   protected int capacidad;
   protected boolean ocupado;
   protected List<Persona> ocupantes;

   public Vehiculo(String codigo, int costoDiario, int capacidad){
      this.codigo = codigo;
      this.costoDiario = costoDiario;
      this.capacidad = capacidad;
      this.ocupado = false;
      this.ocupantes = new ArrayList<>();
   }

   public boolean estaOcupado(){
      return ocupado;
   }
   public double calcularCosto(int dias){
      if (ocupantes != null && !ocupantes.isEmpty() && ocupantes.get(0).aplicaDescuento() == true){
         return dias*costoDiario*0.8;
      }
      else{
         return dias*costoDiario;
      }
   }

   public void registrarOcupantes(List<Persona> ocupantes){
      if (ocupantes.size() == capacidad){
         this.ocupantes = ocupantes;
         ocupado = true;
      }
   }

   public void liberar(){
      this.ocupantes.clear();
      this.ocupado = false;
   }
}

