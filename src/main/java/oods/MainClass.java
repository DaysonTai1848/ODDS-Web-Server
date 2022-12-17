package oods;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import jakarta.servlet.annotation.WebServlet;
import model.Product;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
		
		// Initialize Firebase
		FileInputStream serviceAccount;
		try {
			serviceAccount = new FileInputStream("./odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
			FirebaseOptions options = FirebaseOptions.builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
					.build();
	
			FirebaseApp.initializeApp(options);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		// Get the Firestore client
		Firestore firestore = FirestoreClient.getFirestore();
		
		// Create a Map to store the data we want to set
		Map<String, Object> data = new HashMap<>();
		data.put("product_name", "Magee");
		data.put("product_price", "2.00");
		
		// Add a new document (asynchronously) in collection "test-collection" with id "test-product"
		ApiFuture<WriteResult> future = firestore.collection("test-collection").document("test-product-5").set(data);
		
		// future.get() blocks on response
		System.out.println("Update time : " + future.get().getUpdateTime());
		
		
		
		// SUCCESSFULLY RETRIEVE DOCUMENT 
		DocumentReference docRef = firestore.collection("test-collection").document("test-product");
		// asynchronously retrieve the document
		ApiFuture<DocumentSnapshot> future2 = docRef.get();
		// ...
		// future.get() blocks on response
		DocumentSnapshot document = future2.get();
		if (document.exists()) {
		  System.out.println("Document data: " + document.getData());
		} else {
		  System.out.println("No such document!");
		}
	
	}
	
	public void example() {
		// Initialize Firebase
				FileInputStream serviceAccount;
				try {
					serviceAccount = new FileInputStream("./odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
					FirebaseOptions options = FirebaseOptions.builder()
							.setCredentials(GoogleCredentials.fromStream(serviceAccount))
							.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
							.build();
			
					FirebaseApp.initializeApp(options);
			
				} catch (Exception e) {
					e.printStackTrace();
				}
				

				// Get the Firestore client
				Firestore firestore = FirestoreClient.getFirestore();
				
				// Create a Map to store the data we want to set
				Map<String, Object> data = new HashMap<>();
				data.put("product_name", "Magee");
				data.put("product_price", "2.00");
				
				// Add a new document (asynchronously) in collection "test-collection" with id "test-product"
				ApiFuture<WriteResult> future = firestore.collection("test-collection").document("test-product-4").set(data);
	}
}






//import java.io.FileInputStream;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ExecutionException;
//
//import com.google.api.core.ApiFuture;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.firestore.CollectionReference;
//import com.google.cloud.firestore.DocumentReference;
//import com.google.cloud.firestore.Firestore;
//import com.google.cloud.firestore.WriteResult;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.cloud.FirestoreClient;
//
//public class MainClass {
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		// temporary, not safe
//		FileInputStream serviceAccount;
//		try {
//			serviceAccount = new FileInputStream("./odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
//			FirebaseOptions options = new FirebaseOptions.Builder()
//					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
//					.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
//					.build();
//	
//				FirebaseApp.initializeApp(options);
//	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//				
//		Firestore db = FirestoreClient.getFirestore();
//		CollectionReference productRef = db.collection("product");
//		
//		// Create a Map to store the data we want to set
//		Map<String, Object> docData = new HashMap<>();
//		docData.put("name", "Los Angeles");
//		docData.put("state", "CA");
//		docData.put("country", "USA");
//		docData.put("regions", Arrays.asList("west_coast", "socal"));
//		// Add a new document (asynchronously) in collection "cities" with id "LA"
//		ApiFuture<WriteResult> future = db.collection("cities").document("LA").set(docData);
//		// ...
//		// future.get() blocks on response
//		System.out.println("Update time : " + future.get().getUpdateTime());
//		
//	}
//	
//	
//}