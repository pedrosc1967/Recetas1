package com.aplanetbit.recetas.uno;
import com.aplanetbit.recetas.uno.RecetasUno.AboutDialogBuilder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;



public class decimocuartareceta extends Activity {

    private AdView mAdView;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decimocuartareceta);

        // AdMob Block
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    };
            
@Override
public boolean onCreateOptionsMenu(Menu menu){

       	MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
      	return true;
       	}


@Override
public boolean onOptionsItemSelected(MenuItem item) {
// Handle item selection
        switch (item.getItemId()) {
        case R.id.Otras_apps:
       	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgxMzQyNTg2NTUwODQ1MTg1NzQQCBgDEhkKEzgxMzQyNTg2NTUwODQ1MTg1NzQQCBgDGAA%3D:S:ANO1ljJfH-4&gsr=CjuKAzgKGQoTODEzNDI1ODY1NTA4NDUxODU3NBAIGAMSGQoTODEzNDI1ODY1NTA4NDUxODU3NBAIGAMYAA%3D%3D:S:ANO1ljIsTuo") ) );
            return true;
        case R.id.Salir:
            this.finish();
            this.finish();
        return true;
        case R.id.Acerca:
        	AlertDialog builder;
        		try {
        		    builder = AboutDialogBuilder.create(this);
        		    builder.show();
        		} catch (NameNotFoundException e) {
        		    // TODO Auto-generated catch block
        		    e.printStackTrace();
        		}
        default:
        return super.onOptionsItemSelected(item);
            }
   }

}
