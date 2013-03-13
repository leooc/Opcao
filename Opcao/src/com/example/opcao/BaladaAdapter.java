package com.example.opcao;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author leonardocosta
 * @date 14/02/2013
 */
public class BaladaAdapter extends BaseAdapter {
	
	private List<Baladas> listBaladas;
	private LayoutInflater inflater;
	
	public BaladaAdapter(Context context, List<Baladas> pListBaladas){
		this.listBaladas = pListBaladas;
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public void addItem(final Baladas item) {    
		this.listBaladas.add(item);       
		notifyDataSetChanged();    
	}

	@Override
	public int getCount() {
		return listBaladas.size();
	}

	@Override
	public Object getItem(int position) {
		return listBaladas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup viewGroup) {
		//Pega o registro da lista e transfere para o objeto estadoVO 
		Baladas baladaVO = listBaladas.get(position);                
		//Utiliza o XML estado_row para apresentar na tela        
		convertView = inflater.inflate(R.layout.balada_row, null);              
		//Instância os objetos do XML        
		ImageView imgBalada = (ImageView)convertView.findViewById(R.id.imgBalada);      
		TextView nomeBalada = (TextView)convertView.findViewById(R.id.nomeBalada);   
		TextView endereco = (TextView)convertView.findViewById(R.id.endereco);         
		//pega os dados que estão no objeto estadoVO e transfere para os objetos do XML   
		imgBalada.setImageResource(baladaVO.getFotoBalada());  
		nomeBalada.setText(baladaVO.getNome());   
		endereco.setText(baladaVO.getEndereco());    
		return convertView;    
	}
	
	

}
