
public class Sillas {
	private int lugares=0;
	
	public Sillas(int lugares) {
		this.lugares=lugares;
	}
	
	public synchronized void tomaSilla(int i){
		while(lugares==0)
			Util.myWait(this);
		System.out.println("Filosofo "+i+" tiene hambre");
		lugares--;
	}
	
	public synchronized void dejaSilla(int i) {
		lugares++; 
		System.out.println("Filosofo "+i+" está pensando");
		notify();
	}
}
