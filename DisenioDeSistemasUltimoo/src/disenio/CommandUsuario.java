package disenio;

import java.util.ArrayList;

public class CommandUsuario extends Command{
	
	private ArrayList<Componente> procAEjecutar;
	
	public void agregarProceso (Componente unProceso){
		procAEjecutar.add(unProceso);
	}
	
	public void remover( Componente unProceso )  {
		 procAEjecutar.remove(unProceso);   
		 } 
	
    public void ejecutarProcesos(){
		
	}

 
}