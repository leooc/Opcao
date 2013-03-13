package com.example.opcao;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class OpcaoActivity extends Activity {
	
	private List<Baladas> lstBaladas = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcao);
        
        ListView list = (ListView) findViewById(R.id.ListView1);
        
        lstBaladas = new ArrayList<Baladas>();
        
        lstBaladas.add(new Baladas("Club A", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club B", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club C", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club D", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club E", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club F", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club G", "Av. Bandeirantes, 144", R.drawable.local1));
        lstBaladas.add(new Baladas("Club H", "Av. Bandeirantes, 144", R.drawable.local1));
                
        BaladaAdapter adapter = new BaladaAdapter(this, lstBaladas);
        
        list.setOnItemClickListener(onItemClick_List);
        
        list.setAdapter(adapter);        
    }
    
    OnItemClickListener onItemClick_List = new OnItemClickListener() {
    	
    	public void onItemClick(AdapterView arg0, View view, int position, long index){
    		
    		showToast("Você clicou na balada: " + lstBaladas.get(position).getNome());
    		
    	}
	};
    
	private void showToast(String message){
		
		Toast.makeText(this, message, 	Toast.LENGTH_LONG).show();
	}
      	
    
}
