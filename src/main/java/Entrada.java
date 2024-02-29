import controller.DAOEquipo;
import controller.DAOLiga;
import model.Equipo;
import model.Liga;

public class Entrada {
    public static void main(String[] args) {

        DAOLiga opracionesLiga = new DAOLiga();
        opracionesLiga.insertarLiga(new Liga("Premier League", "27/08/2023","10/05/2024"));
        DAOEquipo operacionesEquipo = new DAOEquipo();
        operacionesEquipo.insertarEquipo(new Equipo("Real Madrid", "Madrid"));

    }
}
