import java.util.ArrayList;
import java.util.List;


public abstract class Atraccion {
   protected String nombre;
   protected int alturaMinima, capacidadMaxima;
   protected List<Persona> ocupantes = new ArrayList<>();

   public Atraccion(String nombre, int altura, int capacidad){
      this.nombre = nombre;
      this.alturaMinima = altura;
      this.capacidadMaxima = capacidad;
      this.ocupantes.clear();
   }

   public void TerminarTurno(){
      this.ocupantes.clear();
   }
}
