package com.recetas.uno;
import com.recetas.uno.RecetasUno.AboutDialogBuilder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
//import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class septimareceta extends Activity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.septimareceta);
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

}
