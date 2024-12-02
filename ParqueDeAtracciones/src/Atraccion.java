import java.util.ArrayList;
import java.util.List;


public abstract class Atraccion {
   protected String nombre;
   protected int alturaMinima, capacidadMaxima, parqueid;
   protected List<Persona> ocupantes = new ArrayList<>();
   protected List<Persona> operadores = new ArrayList<>();

   public Atraccion(String nombre, int altura, int capacidad, int parqueid){
      this.nombre = nombre;
      this.alturaMinima = altura;
      this.capacidadMaxima = capacidad;
      this.parqueid = parqueid;
      this.ocupantes.clear();
   }
   
   abstract void IniciarAtraccion();

   public void ingresarOperador(Operador op, int id){
      if (id == parqueid){
         operadores.add(op);
         op.ponerACargoDe(this);
      }
   }

   public void TerminarTurno(){
      this.ocupantes.clear();
   }
}
