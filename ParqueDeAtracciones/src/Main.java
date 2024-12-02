public class Main {
    public static void main(String[] args) throws Exception {
        Parque parqueDeLaCosta = new Parque(30, 300, 123);
        Visitante pablo = new Visitante("Pablo",50, 40);
        pablo.IngresarAlParque(parqueDeLaCosta);
        Operador javi = new Operador("Javi", 123);
        Carussel caru = new Carussel("Caru", 60, 5, 123);
        caru.ingresarOperador(javi, 123);
        javi.IniciarAtraccion();
    }
}
