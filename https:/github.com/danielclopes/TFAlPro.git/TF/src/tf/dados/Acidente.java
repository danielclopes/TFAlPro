package tf.dados;

public class Acidente {
	private String log1, log2, tipo_acid, data_hora, dia_sem, feridos, mortes,
			mortes_post, fatais, auto, taxi, lotacao, onibus_ub, onibus_int,
			caminhao, moto, carroca, bicicleta, tempo, noite_dia, regiao;

	public Acidente() {
		
	}
	
	public Acidente(String log1, String log2, String tipo_acid){
		this.log1 = log1;
		this.log2 = log2;
		this.tipo_acid = tipo_acid;
	}

	public Acidente(String log1, String log2, String tipo_acid,
			String data_hora, String dia_sem, String feridos, String mortes,
			String mortes_post, String fatais, String auto, String taxi,
			String lotacao, String onibus_ub, String onibus_int,
			String caminhao, String moto, String carroca, String bicicleta,
			String tempo, String noite_dia, String regiao) {
		super();
		this.log1 = log1;
		this.log2 = log2;
		this.tipo_acid = tipo_acid;
		this.data_hora = data_hora;
		this.dia_sem = dia_sem;
		this.feridos = feridos;
		this.mortes = mortes;
		this.mortes_post = mortes_post;
		this.fatais = fatais;
		this.auto = auto;
		this.taxi = taxi;
		this.lotacao = lotacao;
		this.onibus_ub = onibus_ub;
		this.onibus_int = onibus_int;
		this.caminhao = caminhao;
		this.moto = moto;
		this.carroca = carroca;
		this.bicicleta = bicicleta;
		this.tempo = tempo;
		this.noite_dia = noite_dia;
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "Acidente [log1=" + log1 + ", log2=" + log2 + ", tipo_acid="
				+ tipo_acid + ", data_hora=" + data_hora + ", dia_sem="
				+ dia_sem + ", feridos=" + feridos + ", mortes=" + mortes
				+ ", mortes_post=" + mortes_post + ", fatais=" + fatais
				+ ", auto=" + auto + ", taxi=" + taxi + ", lotacao=" + lotacao
				+ ", onibus_ub=" + onibus_ub + ", onibus_int=" + onibus_int
				+ ", caminhao=" + caminhao + ", moto=" + moto + ", carroca="
				+ carroca + ", bicicleta=" + bicicleta + ", tempo=" + tempo
				+ ", noite_dia=" + noite_dia + ", regiao=" + regiao + "]";
	}

}
