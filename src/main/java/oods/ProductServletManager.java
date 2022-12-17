package oods;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;



@WebServlet("/postProduct")

public class ProductServletManager extends HttpServlet {
	
	// Constructor
	public ProductServletManager() {
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//
//        response.sendRedirect("index.html");
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MainClass mainClass = new MainClass();
		mainClass.example();
		
//		// Initialize Firebase
//		FileInputStream serviceAccount;
//		try {
//			serviceAccount = new FileInputStream("C:\\Users\\User\\Desktop\\Y3S1\\eclipse-workspace\\OODS\\odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
//		
//			FirebaseOptionss options = new FirebaseOptionss.Builder()
//					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
//					.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
//					.build();
//	
////			FirebaseApp.initializeApp(options);
//			FirebaseApp.initializeApp(options.toString());
//	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		Firestore firestore = FirestoreClient.getFirestore();
//		
//		// Retrieve data from HTML form
//		String productName = request.getParameter("product_name");
//		String productCategory = request.getParameter("product_category");
//		String productDescription = request.getParameter("product_description");
//		String variationId = request.getParameter("variation_id");
//		String productImage = request.getParameter("product_image");
//		String variationType = request.getParameter("variation_type");
//		String variationPrice = request.getParameter("variation_price");
//		String variationStock = request.getParameter("variation_stock");
//		String variationStatus = request.getParameter("variation_status");
//		
//
//		
//		// Create a Map to store the data we want to set
//		Map<String, Object> data = new HashMap<>();
//		data.put("product_name", productName);
//		data.put("product_category", productCategory);
//		data.put("product_description", productDescription);
//		data.put("variation_id", variationId);
//		data.put("product_image", productImage);
//		data.put("variation_type", variationType);
//		data.put("variation_price", variationPrice);
//		data.put("variation_stock", variationStock);
//		data.put("variation_status", variationStatus);
//		
//		
//		String SKU = productCategory + "-" + "SEQNO" + "-" + variationId;
//		ApiFuture<WriteResult> future = firestore.collection("test-collection").document(SKU).set(data);
//		
//		System.out.println("The document may have been created");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// Initialize Firebase
//				FileInputStream serviceAccount;
//				try {
//					serviceAccount = new FileInputStream("./odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
//					FirebaseOptions options = FirebaseOptions.builder()
//							.setCredentials(GoogleCredentials.fromStream(serviceAccount))
//							.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
//							.build();
//			
//					FirebaseApp.initializeApp(options);
//			
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//
//				// Get the Firestore client
//				Firestore firestore = FirestoreClient.getFirestore();
//				
//				// Create a Map to store the data we want to set
//				Map<String, Object> data = new HashMap<>();
//				data.put("product_name", "Magee");
//				data.put("product_price", "2.00");
//				
//				// Add a new document (asynchronously) in collection "test-collection" with id "test-product"
//				ApiFuture<WriteResult> future = firestore.collection("test-collection").document("test-product-5").set(data);
//				
//				// future.get() blocks on response
//				try {
//					System.out.println("Update time : " + future.get().getUpdateTime());
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (ExecutionException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				
//				
//				
//				// SUCCESSFULLY RETRIEVE DOCUMENT 
//				DocumentReference docRef = firestore.collection("test-collection").document("test-product");
//				// asynchronously retrieve the document
//				ApiFuture<DocumentSnapshot> future2 = docRef.get();
//				// ...
//				// future.get() blocks on response
//				
//				try {
//					DocumentSnapshot document;
//					document = future2.get();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (ExecutionException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
	}
	
	
	
}







//// Insert data into product object
//Product product = new Product();
//product.setProductName(productName);
//product.setProductCategory(productCategory);
//product.setProductDescription(productDescription);
//product.setVariationId(variationId);
//product.setProductImage(productImage);
//product.setVariationType(variationType);
//product.setVariationPrice(variationPrice);
//product.setVariationStock(variationStock);
//product.setVariationStatus(variationStatus);