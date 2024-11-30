
public class Persona {
   private String nombre;
   private char sexo;
   private int edad;

   public Persona(String nombre, char sexo, int edad){
      this.nombre = nombre;
      this.sexo = sexo;
      this.edad = edad;
   }

   public boolean aplicaDescuento(){
      if ((this.sexo == 'M' && this.edad > 70) || (this.sexo == 'F' && this.edad > 65)){
         return true;
      }
      return false;
   }

   public String getNombre(){
      return this.nombre;
   }
}
