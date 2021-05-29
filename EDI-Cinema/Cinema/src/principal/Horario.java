package principal;

public enum Horario {
	MATINE(17), VERSPERTINO(19), NOTURNO(22);
	
	private int horario;
	
	Horario(int horario){
		this.horario = horario;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
		
}
