
public class Mesa {
	public static void main(String[] args) {
		int N = 5;
		Sillas p=new Sillas(N - 1);
		Tenedor[] tenedores=new Tenedor[N];
		Filosofo[] filosofos=new Filosofo[5];
		
		for(int i=0;i<tenedores.length;i++)
		{
			tenedores[i]=new Tenedor(i);	
		}
		
		for(int i=0;i<filosofos.length;i++)
		{
			filosofos[i]=new Filosofo(i,tenedores[i],tenedores[(i+1)%5],p);	
		}
		
		for(int i=0;i<filosofos.length;i++)
		{
			filosofos[i].start();
		}
	}
}
