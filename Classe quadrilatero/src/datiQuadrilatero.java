public class datiQuadrilatero {
	
	int latoA;
	int latoB;
	int latoC;
	int latoD;

	
	public datiQuadrilatero(int latoA, int latoB, int latoC, int latoD) {
		super();
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
		this.latoD = latoD;
	}
	
	public int Cperimetro(int latoA, int latoB, int latoC, int latoD) {
		int perimetro=0;
		perimetro=latoA+latoB+latoC+latoD;
		return perimetro;
	}
}
