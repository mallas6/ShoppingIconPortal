package com.ust.shopping.Util;

import java.util.ArrayList;
import java.util.List;

import com.ust.shopping.model.Details;
import com.ust.shopping.model.Product;

public class ProductUtil {

	public static List<Product> products() {
		List<Product> products = new ArrayList<>();
		List<Details> details = productDetails();
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setPrize(500l);
		p1.setProductName("Smart Beans Hammock Black With Accessories Cotton Hammock  (Black)");
		p1.setDetails(details.get(0));
		products.add(0, p1);

		Product p2 = new Product();
		p2.setProductId(2);
		p2.setPrize(16999l);
		p2.setProductName("Can bean bags XXXL Chair Bean Bag Cover (Without Beans)  (White, Orange)");
		p2.setDetails(details.get(1));
		products.add(1, p2);
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setPrize(400l);
		p3.setProductName("Lakme Eyeconic Kajal Pencil");
		p3.setDetails(details.get(2));
		products.add(2, p3);

		Product p4 = new Product();
		p4.setProductId(4);
		p4.setPrize(16999l);
		p4.setProductName("Samsung Galaxy A50s (Prism Crush Black, 128 GB)  (4 GB RAM)");
		p4.setDetails(details.get(3));
		products.add(3, p4);

		return products;
	}

	public static List<Details> productDetails() {
		List<Details> details = new ArrayList<>();

		Details d1 = new Details();
		d1.setProductId(1);
		d1.setProductName("Smart Beans Hammock Black With Accessories Cotton Hammock  (Black)");
		d1.setDecription("\r\n" + 
				"Bring comfort & style to your outdoor & indoor space with Smart Beans royal hammock swing. Everyone needs an outdoor hammock to help you enjoy those lazy days & this stylish & colorful hammock by Smart Beans is a perfect choice. It adds a touch of style to your garden & provides extra fun for both kids & adults. This one is just right for a hot summer day. Hang it in your verandah or garden and sip a drink or read a book as you sway with the breeze. The hammock is the product to enjoy for years as an incredible addition of relaxation to any place. Being a quality driven organization, conscious efforts are made towards enhancing the safety features as well as making the range suitable as per the changing preferences. We are giving our esteemed with a highly commendable range of products; there is a team of dedicated and experienced team of experts who take the responsibility of the quality checks of the products. We ensure to test all our products through stringent processes to giveonly a highly commendable and durable range. The products are highly preferred in the global market for their and base range. To ensure that we give a defect-less and technical sound range, we make our products to be tested as per the required quality standards and leveraging on the vast technical expertise we have acquired throughout our successful journey as a key player in the competitive market, we are giving a highly efficient and high-end product range.");
		d1.setRating("4.5");
		d1.setManufacturer("Smart Beans");
		details.add(0, d1);

		Details d2 = new Details();
		d2.setProductId(2);
		d2.setProductName(
				"\r\n" + "Share\r\n" + "Can bean bags XXXL Chair Bean Bag Cover (Without Beans)  (White, Orange)");
		d2.setDecription("\r\n"
				+ "Add a touch of Style & Comfort in your Living Room with this Set of 2, Sporty Football Bean Bag & 14X14 Round Puffy from Can Bean Bag. Made of Soft Artificial Leather, this Football Bean Bag is made with multiple panels to give a sporty look. Perfect Height to Width Ratio for perfect Seating. Double layer Child Proof locking at the bottom. Filled with High Density Beans?that gives bouncy comfort. Ergonomically Designed and Aesthetically appealing. Makes watching World cup matches interesting. A must have for your Living Room.");
		d2.setRating("4");
		d2.setManufacturer("Can bean bags");
		d2.setMaterialUsed("Leatherette");
		details.add(1, d2);

		Details d3 = new Details();
		d3.setProductId(3);
		d3.setProductName("Lakme Eyeconic Kajal Pencil");
		d3.setDecription("\r\n"
				+ "Accentuate the beauty of your eyes with the Lakme Eyeconic Kajal. This dermatologically tested kajal is just what you need for completing your eye makeup or carrying a simple, only-kajal look. It's a smudge proof, water proof kajal and can add the dramatic and glamorous look to your eyes. It has intense matte texture for Eyeconic eyes. You can Experiment with a thin line or a bold wing, this kajal is great for day and night looks. Its long-lasting- up to 22 hours without smudging and is completely water proof. It is designed with an easy to use and convenient twist-up format. Just one stroke of the Lakme Eyeconic Kajal enhances your simple look to a more stylish avatar. Its beat all your timelines, be it meetings, travelling or just a day out and lasts fr 22 hrs. You are incomplete without kajal and this is a perfect everyday product! Get the Lakme Eyeconic Kajal in black, now. The balck Eyeconic goes best with your Eyeconic mascara. To enhance your eyes further. You can also use from our 4 eye quartet pallets to enhance your eye to wedding a wedding, party and work look. Draw a neat stroke on the upper lid, starting from the inner corner of the eyes, extending outwards. Repeat on the lower lid.");
		d3.setRating("4.5");
		d3.setExpiryDate("10-11-2021");
		d3.setMfgDate("21-10-2020");
		d3.setManufacturer("Lakme");
		details.add(2, d3);

		Details d4 = new Details();
		d4.setProductId(4);
		d4.setProductName("Samsung Galaxy A50s (Prism Crush Black, 128 GB)  (4 GB RAM)");
		d4.setDecription("\r\n"
				+ "Watch your favourite shows come alive on the FHD+ sAMOLED Infinity-U display, capture wonderful moments with the triple rear camera (48 MP + 8 MP + 5 MP), and do so much more with the Samsung Galaxy A50s smartphone. Its 3D Prism design is attractive to look at and it will delight everyone who lays their eyes on it.");
		d4.setRating("4.5");
		d4.setManufacturer("Samsung");
		details.add(3, d4);
		return details;
	}
}
