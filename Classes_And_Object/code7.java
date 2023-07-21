class MusicInstruments{

	static String raagName = "Yaman";	//Using common raag 
	String UsedInstrument = "Harmonium";	//Raag play on various instruments 
		
	void playInstrument(){
	
		System.out.println("Raag Name -> "+ raagName);
		System.out.println("Use Instrument for play -> "+ UsedInstrument);
	}
}
class Artist{

	public static void main(String []args){
		
		MusicInstruments obj = new MusicInstruments();

		obj.playInstrument();

		System.out.println(obj.UsedInstrument);
		System.out.println(obj.raagName);
	}
}
