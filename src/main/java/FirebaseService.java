import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

import model.Product;

import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;

public class FirebaseService {
	public String saveProductDetails(Product product) throws InterruptedException, ExecutionException {
		
		Firestore dbFirestore = FirestoreClient.getFirestore();
		CollectionReference productRef = dbFirestore.collection("product");
		
		ApiFuture<DocumentReference> apiFuture = productRef.add("HEC");
		
		return apiFuture.get().getPath();
		
	}
}