package petShop;


import java.util.Scanner;


public class Main {
	
	
	private final static Scanner scanner = new Scanner(System.in);
	
	
	private final static Bath bath = new Bath();
	
	
	public static void main(String[] args) {
	   var option = -1;
	   
	   
	   do {
		   System.out.println("===Escolha uma das opções===");
		   System.out.println("1 - Dar banho no pet");
		   System.out.println("2 - Abastecer a pia com água");
		   System.out.println("3 - Abastecer pia com shampoo");
		   System.out.println("4 - Vericicar água da pia");
		   System.out.println("5 - Verificar shampoo da pia");
		   System.out.println("6 - Verificar se tem pet no banho");
		   System.out.println("7 - Colocar pet na pia");
		   System.out.println("8 - Retirar pet da pia");
		   System.out.println("9 - Limpar a pia");
		   System.out.println("0 - Sair");
		   
		   if (scanner.hasNextInt()) {
			   option = scanner.nextInt();
		   }else {
			   System.out.println("Entranda inválida! Digite um número.");
			   scanner.nextInt();
			   continue;
		   }
		   
		   switch (option){
		   case 1 -> bath.takeAShower();
		   case 2 -> setWater();
		   case 3 -> setShampoo();
		   case 4 -> verifyWater();
		   case 5 -> verifyShampoo();
		   case 6 -> checkIfHasPetInBath();
		   case 7 -> setPetInPetBath();
		   case 8 -> removePet();
		   case 9 -> bath.wash();
		   case 0 -> System.exit(0);
		   default -> System.out.println("Opção inválida");
		   
		   
		   
		   }
		   
	   }while (true);
	   
	}

	private static void setWater() {
		   System.out.println("Tentando colocar água na pia");
		 bath.addWater();
	   
	}
	
	private static void setShampoo() {
		System.out.println("Colocar Shampoo na pia");
		bath.addShampoo();
		   
	}

	private static void verifyWater() {
		var amount = bath.getWater();
		   System.out.println("A pia está no momento com " + amount + "litro(s) de água");
		   
	}

	private static void verifyShampoo() {
		var amount = bath.getShampoo();
		   System.out.println("A pia está no momento com " + amount + "litro(s) de Shampoo");
	}
	
	private static void checkIfHasPetInBath() {
		var hasPet = bath.hasPet();
		bath.hasPet();
		System.out.println(hasPet ? "Tem pet na pia" : "Não tem pet na pia");
	}
	
	public static void setPetInPetBath() {
		var name = "";
		while (name == null || name.isEmpty()) {
		System.out.println("Informe o nome do pet");
		scanner.next();
		name = scanner.next();
		
		}
		var pet = new Pet(name);
		bath.setPet(pet);
		System.out.println("O pet " + pet.getName() + "foi colocado na pia");
	}
	

private static void removePet() {
	 bath.removePet();
   
    }
	
}
