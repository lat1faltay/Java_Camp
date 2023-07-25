package liveLesson2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String veri tipi
		// mesaj nesnenin adı
		String mesaj = "Vade oranı";
		
		// Product veri tipi
		// product1 nesnenin adı

		// Fakat burada Product sınıfından türetilmiş product1 nesnemiz string ya da int
		// değer almayacak
		// product1 nesnemiz Product sınıfının içine yazdığımız özelliklere yani
		// field'lara göre değer alacak
		// Hatalı kullanım
		// Product product1 = "Kahve makinesi";

		Product product1 = new Product();

		// set işlemi (nesnenin değerlerini atamak)
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitePrice(7500);
		product1.setUnitInStock(3);
		product1.setImgUrl("image1.jpg");

		/*
		 * 
		 * 		// get işlemi (Atadığımız değerleri okumak)
		 * System.out.println(product1.name); System.out.println(product1.unitePrice);
		 * System.out.println(product1.discount);
		 * System.out.println(product1.unitInStock);
		 * 
		 */

		
		Product product2 = new Product();

		// set işlemi (nesnenin değerlerini atamak)
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitePrice(7500);
		product2.setUnitInStock(3);
		product2.setImgUrl("image2.jpg");
		
		Product product3 = new Product();

		// set işlemi (nesnenin değerlerini atamak)
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitePrice(7500);
		product3.setUnitInStock(3);
		product3.setImgUrl("image3.jpg");
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		// aşağıdaki döngü for each döngüsüdür
		// parantez içinin anlamı : products array'indeki Product tipindeki product adındaki nesneleri tek tek dolaş
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("0500000000");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Latif");
		individualCustomer.setLastName("Altay");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05550000000");
		corporateCustomer.setCustomerNumber("54");
		corporateCustomer.setTaxNumber("123214234");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
	}

}
