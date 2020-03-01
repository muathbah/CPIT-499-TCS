package com.kingaspx.firebase.util;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Common {

    public static void initFirebase() throws FileNotFoundException, IOException {
        FileInputStream refreshToken = new FileInputStream("credentials.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(refreshToken))
                .setDatabaseUrl("https://cpit-499-dc769.firebaseio.com/")
                .build();

        FirebaseApp.initializeApp(options);
    }
}
