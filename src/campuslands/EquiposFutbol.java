package campuslands;

public class EquiposFutbol {
	
	    private String nombreEquipo;
	    private int partidosJugados;
	    private int partidosGanados;
	    private int partidosPerdidos;
	    private int partidosEmpatados;
	    private int golesFavor;
	    private int golesContra;
	    private int totalPuntos;

	    public EquiposFutbol() {
	        this.nombreEquipo = "";
	        this.partidosJugados = 0;
	        this.partidosGanados = 0;
	        this.partidosPerdidos = 0;
	        this.partidosEmpatados = 0;
	        this.golesFavor = 0;
	        this.golesContra = 0;
	        this.totalPuntos = 0;
	    }

	    public String getNombreEquipo() {
	        return nombreEquipo;
	    }

	    public void setNombreEquipo(String nombreEquipo) {
	        this.nombreEquipo = nombreEquipo;
	    }

	    public int getPartidosJugados() {
	        return partidosJugados;
	    }

	    public void setPartidosJugados(int partidosJugados) {
	        this.partidosJugados = partidosJugados;
	    }

	    public int getPartidosGanados() {
	        return partidosGanados;
	    }

	    public void setPartidosGanados(int partidosGanados) {
	        this.partidosGanados = partidosGanados;
	    }

	    public int getPartidosPerdidos() {
	        return partidosPerdidos;
	    }

	    public void setPartidosPerdidos(int partidosPerdidos) {
	        this.partidosPerdidos = partidosPerdidos;
	    }

	    public int getPartidosEmpatados() {
	        return partidosEmpatados;
	    }

	    public void setPartidosEmpatados(int partidosEmpatados) {
	        this.partidosEmpatados = partidosEmpatados;
	    }

	    public int getGolesFavor() {
	        return golesFavor;
	    }

	    public void setGolesFavor(int golesFavor) {
	        this.golesFavor = golesFavor;
	    }

	    public int getGolesContra() {
	        return golesContra;
	    }

	    public void setGolesContra(int golesContra) {
	        this.golesContra = golesContra;
	    }

	    public int getTotalPuntos() {
	        return totalPuntos;
	    }

	    public void setTotalPuntos(int totalPuntos) {
	        this.totalPuntos = totalPuntos;
	    }
	    
	    public int SeleccionEquipo() {
	    	
	    	return 6;
	    }
}
