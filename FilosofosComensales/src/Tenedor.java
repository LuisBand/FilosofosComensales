
public class Tenedor {
	private int id;
	private boolean libre=true;
	
	public Tenedor(int id) {
		this.id=id;
	}
	public synchronized void tomado(int i){ 
		while(!libre) 
			Util.myWait(this); 
		System.out.println("Filosofo "+i+" utilizando tenedor: "+id);
		libre=false;
	}
	public synchronized void bajado(int i) { 
		libre=true; 
		System.out.println("Filosofo "+i+" suelta el tenedor "+id);
		notify();
	}
}
