package com.aplanetbit.recetas.uno;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;



public class RecetasUno extends Activity implements OnInitListener {

	private AdView mAdView;

//Definici�n del men� en menu.xml
@Override
public boolean onCreateOptionsMenu(Menu menu){

	MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);
	return true;
	}

//Lo que hace cada opci�n del menu
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle item selection
    switch (item.getItemId()) {
    case R.id.Otras_apps:
    	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/collection/cluster?clp=igM4ChkKEzgxMzQyNTg2NTUwODQ1MTg1NzQQCBgDEhkKEzgxMzQyNTg2NTUwODQ1MTg1NzQQCBgDGAA%3D:S:ANO1ljJfH-4&gsr=CjuKAzgKGQoTODEzNDI1ODY1NTA4NDUxODU3NBAIGAMSGQoTODEzNDI1ODY1NTA4NDUxODU3NBAIGAMYAA%3D%3D:S:ANO1ljIsTuo") ) );
        return true;
    case R.id.Salir:
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




//Definicion de la interfaz de usuario
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);

	// AdMob Block
	MobileAds.initialize(this, new OnInitializationCompleteListener() {
		@Override
		public void onInitializationComplete(InitializationStatus initializationStatus) {
		}
	});
	mAdView = findViewById(R.id.adView);
	AdRequest adRequest = new AdRequest.Builder().build();
	mAdView.loadAd(adRequest);

	Button primerarecetaPlayerBtn = (Button)findViewById(R.id.primerarecetaPlayerBtn);
	Button segundarecetaPlayerBtn = (Button)findViewById(R.id.segundarecetaPlayerBtn);
	Button tercerarecetaPlayerBtn = (Button)findViewById(R.id.tercerarecetaPlayerBtn);
	Button cuartarecetaPlayerBtn = (Button)findViewById(R.id.cuartarecetaPlayerBtn);
	Button quintarecetaPlayerBtn = (Button)findViewById(R.id.quintarecetaPlayerBtn);
	Button sextarecetaPlayerBtn = (Button)findViewById(R.id.sextarecetaPlayerBtn);
	Button septimarecetaPlayerBtn = (Button)findViewById(R.id.septimarecetaPlayerBtn);
	Button octavarecetaPlayerBtn = (Button)findViewById(R.id.octavarecetaPlayerBtn);
	Button novenarecetaPlayerBtn = (Button)findViewById(R.id.novenarecetaPlayerBtn);
	Button decimarecetaPlayerBtn = (Button)findViewById(R.id.decimarecetaPlayerBtn);
	Button undecimarecetaPlayerBtn = (Button)findViewById(R.id.undecimarecetaPlayerBtn);
	Button duodecimarecetaPlayerBtn = (Button)findViewById(R.id.duodecimarecetaPlayerBtn);
	Button decimotercerarecetaPlayerBtn = (Button)findViewById(R.id.decimotercerarecetaPlayerBtn);
	Button decimocuartarecetaPlayerBtn = (Button)findViewById(R.id.decimocuartarecetaPlayerBtn);
	Button decimoquintarecetaPlayerBtn = (Button)findViewById(R.id.decimoquintarecetaPlayerBtn);
	Button decimosextarecetaPlayerBtn = (Button)findViewById(R.id.decimosextarecetaPlayerBtn);
	Button decimoseptimarecetaPlayerBtn = (Button)findViewById(R.id.decimoseptimarecetaPlayerBtn);
	Button decimoctavarecetaPlayerBtn = (Button)findViewById(R.id.decimoctavarecetaPlayerBtn);
	Button decimonovenarecetaPlayerBtn = (Button)findViewById(R.id.decimonovenarecetaPlayerBtn);
	Button vigesimarecetaPlayerBtn = (Button)findViewById(R.id.vigesimarecetaPlayerBtn);



//Lo que hace el bot�n "Primerareceta"
	primerarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
//Se abre un nuevo Intent con la primera receta
			try
			{
				{
					Intent myIntent = new Intent(view.getContext(), primerareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Segunda receta"
	segundarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{

			try {
				{Intent myIntent = new Intent(view.getContext(), segundareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Tercera receta"
	tercerarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), tercerareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Cuarta receta"
	cuartarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), cuartareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Quinta receta"
	quintarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), quintareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Sexta recera"
	sextarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), sextareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "S�ptima receta"
	septimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), septimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Octava receta"
	octavarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), octavareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Novena receta"
	novenarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), novenareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cima receta"
	decimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Und�cima receta"
	undecimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), undecimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Duod�cima receta"
	duodecimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), duodecimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Decimotercera receta"
	decimotercerarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimotercerareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cimo cuarta receta"
	decimocuartarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimocuartareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cimo quinta receta"
	decimoquintarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimoquintareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cimo sexta receta"
	decimosextarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimosextareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cimo s�ptima receta"
	decimoseptimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimoseptimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});


//Lo que hace el bot�n "D�cimo octava receta"
	decimoctavarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimoctavareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "D�cimo novena receta"
	decimonovenarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), decimonovenareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});

//Lo que hace el bot�n "Vig�sima receta"
	vigesimarecetaPlayerBtn.setOnClickListener(new OnClickListener(){
		public void onClick(View view)
		{
			try {
				{Intent myIntent = new Intent(view.getContext(), vigesimareceta.class);
					startActivityForResult(myIntent, 0);}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}});
	;
//Aqui se pondr�an m�s botones
}


	public void onInit(int arg0) {
	// TODO Auto-generated method stub
	
}

//Aqui se ponen nuevos m�todos
//Este di�logo es para contruir el di�logo de acerca de...
public static class AboutDialogBuilder {
	    public static AlertDialog create( Context context ) throws NameNotFoundException {
	        // Try to load the a package matching the name of our own package
	        PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_META_DATA);
	        String versionInfo = pInfo.versionName;
	 
	        String aboutTitle = String.format(context.getString(R.string.about) + " %s", context.getString(R.string.app_name));
	        String versionString = String.format(context.getString(R.string.version) +" %s", versionInfo);
	        String aboutText = context.getString(R.string.textoabout);
	 
	        // Set up the TextView
	        final TextView message = new TextView(context);
	        // We'll use a spannablestring to be able to make links clickable
	        final SpannableString s = new SpannableString(aboutText);
	 
	        // Set some padding
	        message.setPadding(5, 5, 5, 5);
	        // Set up the final string
	        message.setText(versionString + "\n\n" + s);
	        // Now linkify the text
	        Linkify.addLinks(message, Linkify.ALL);
	        return new AlertDialog.Builder(context).setTitle(aboutTitle).setCancelable(true).setIcon(R.drawable.cauldron).setPositiveButton(
	        			             context.getString(android.R.string.ok), null).setView(message).create();

			
	    }
	}
}
