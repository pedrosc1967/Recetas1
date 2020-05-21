package com.recetas.uno;
import com.recetas.uno.RecetasUno.AboutDialogBuilder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.*;

public class duodecimareceta extends Activity {

    private AdView adView;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duodecimareceta);

        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);

        // Instantiate an AdView object.
        // NOTE: The placement ID from the Facebook Monetization Manager identifies your App.
        // To get test ads, add IMG_16_9_APP_INSTALL# to your placement id. Remove this when your app is ready to serve real ads.

        adView = new AdView(this, "1159067144426774_1159067394426749", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();

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
       	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:\"Pedro Santangelo\"") ) );
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
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}
