import com.jesuuca.abstract_factory.MuebleriaAbstractFactory;
import com.jesuuca.abstract_factory.MuebleriaModernaFactory;
import com.jesuuca.abstract_factory.MuebleriaVictorianFactory;
import com.jesuuca.chair.*;

public class Client {
	public static void main(String[] args) {
		// Ejemplo de modern factory
		MuebleriaAbstractFactory modernFactory = new MuebleriaModernaFactory();
		// instancia de chair de modern factory
		IChair modernChair = modernFactory.createChair();
		System.out.println(modernChair.toString());
		
		// Ejemplo de victorian factory
		MuebleriaAbstractFactory victorianFactory = new MuebleriaVictorianFactory();
		// instancia de chair de victorian factory
		IChair victorianChair = victorianFactory.createChair();
		System.out.println(victorianChair.toString());
	}
}
