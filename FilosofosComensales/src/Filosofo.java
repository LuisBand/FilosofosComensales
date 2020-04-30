
public class Filosofo extends Thread{
	private int id;
	private Tenedor tenedorIzquierdo;
	private Tenedor tenedorDerecho;
	private Sillas sillas;
	
	public Filosofo(int id,Tenedor i,Tenedor d, Sillas lugares) {
		this.id=id;
		this.tenedorIzquierdo=i;
		this.tenedorDerecho=d;
		this.sillas = lugares;
	}
	
	public void run() {
		while(true) {
			sillas.tomaSilla(id);
			tenedorIzquierdo.tomado(id);
			tenedorDerecho.tomado(id);
			
			System.out.println("Filosofo "+id+" comiendo");
			Util.mySleep(4000);
			
			tenedorDerecho.bajado(id);
			tenedorIzquierdo.bajado(id);
			
			sillas.dejaSilla(id);
		}
	}
}
