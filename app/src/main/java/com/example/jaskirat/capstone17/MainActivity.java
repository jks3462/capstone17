package com.example.jaskirat.capstone17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {
    /*   GoogleApiClient mGoogleApiClient;

       @Override
       public void onClick(View v) {
           switch (v.getId()) {
               case R.id.sign_in_button:
                   signIn();
                   break;
               // ...
           }
       }

       private void signIn() {

           Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
           startActivityForResult(signInIntent, RC_SIGN_IN);
       }

       @Override
       public void onActivityResult(int requestCode, int resultCode, Intent data) {
           super.onActivityResult(requestCode, resultCode, data);

           // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
           if (requestCode == RC_SIGN_IN) {
               GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
               handleSignInResult(result);
           }
       }

       private void handleSignInResult(GoogleSignInResult result) {
           Log.d(TAG, "handleSignInResult:" + result.isSuccess());
           if (result.isSuccess()) {
               // Signed in successfully, show authenticated UI.
               GoogleSignInAccount acct = result.getSignInAccount();
               mStatusTextView.setText(getString(R.string.signed_in_fmt, acct.getDisplayName()));
               updateUI(true);
           } else {
               // Signed out, show unauthenticated UI.
               updateUI(false);
           }
       }

   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Set the dimensions of the sign-in button.
    //    SignInButton signInButton = (SignInButton) findViewById(R.id.sign_in_button);
    //    signInButton.setSize(SignInButton.SIZE_STANDARD);
    //    findViewById(R.id.sign_in_button).setOnClickListener((View.OnClickListener) this);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
/*
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleApiClient with access to the Google Sign-In API and the
// options specified by gso.
        GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity *///, (GoogleApiClient.OnConnectionFailedListener) this /* OnConnectionFailedListener */)
    //         .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
    //            .build();
   }

}
