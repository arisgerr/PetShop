package petShop;


public class Bath {
	
	
	private boolean clean = true;
	
	
	private int water = 30;
	
	
	private int shampoo = 10;
	
	
	private Pet pet;
	
	
	public void takeAShower() {
		if(this.pet == null) {
			System.out.println("Coloque o pet na pia para iniciar o banho");
			return;
			
		}
		
		
		this.water -= 10;
		this.shampoo -= 2;
		pet.setClean(true);
		System.out.println("O pet " + pet.getName() + "está limpo");
		
	}

	public void addWater() {
		if(water < 30) water = Math.min(water + 2, 30);
		else System.out.println("A capacidade de água da pia está no máximo");
			
	}
	
	public void addShampoo() {
		if(shampoo < 10) shampoo = Math.min(shampoo + 2,10); 
			System.out.println("A capacidade de shampoo da pia está no máximo");
			
}
	
	public int getWater() {
		return water;
		
		
	}
		
		public int getShampoo() {
			return shampoo;
			
		}
		
		
		public boolean hasPet() {
			return pet != null;
			
		}
		
		
		public void setPet(Pet pet) {
			if (this.clean) {
				System.out.println("A pia está suja, para colocar o pet é necessário limpa-lá");
				
				
			}
			
				if (hasPet()) {
					System.out.println("O pet " + this.pet.getName() + "está na pia nesse momento");
					return;
					
				}
				
				
			this.pet = pet;
			
		}
		
		public void removePet(){
			this.clean = this.pet.isClean();
			System.out.println("o pet " + this.pet.getName() + " foi retirado da pia");
			this.pet = null;
			
		}
		
		
		public void wash() {
			this.water -= 10;
			this.shampoo -= 2;
			this.clean = true;
			System.out.println("A pia está limpa");
			
		}
		
	}
