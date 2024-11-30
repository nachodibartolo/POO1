import java.util.List;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Carlos", 'M', 80);
        Persona persona2 = new Persona("Mabel", 'F',70);
        Agencia dibiAutos = new Agencia("Autos Dibi");
        Moto moto1 = new Moto("M1");
        
        dibiAutos.agregarAFlota(moto1);
        dibiAutos.listarVehiculos();
        List<Persona> ocupantes = new ArrayList<>();
        ocupantes.add(persona1);
        ocupantes.add(persona2);
        dibiAutos.alquilarVehiculo("M1", ocupantes);
        dibiAutos.listarVehiculos();
        dibiAutos.entregarVehiculo("M1", 4);
        dibiAutos.listarVehiculos();
    }
}
