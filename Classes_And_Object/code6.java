class DogBreed{

	String BreedName = "Germen Shepherd";
	int price = 15000;

	void Selling(){
	
		System.out.println("Sold With Papers ");
		System.out.println("Breed Name : "+BreedName);	
		System.out.println("Price : "+price);	
	}
}
class PetOwner{

	public static void main(String []args){

		DogBreed obj = new DogBreed();

		obj.Selling();
	}
}
