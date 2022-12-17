package oods;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseInitialize {
	
	public void initialize() {
	
		// temporary, not safe
		FileInputStream serviceAccount;
		try {
			serviceAccount = new FileInputStream("./odds-38a12-firebase-adminsdk-a78ds-968ad08bf3.json");
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://odds-38a12-default-rtdb.firebaseio.com")
					.build();
	
				FirebaseApp.initializeApp(options);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
