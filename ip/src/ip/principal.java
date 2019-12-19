package ip;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lire_fichier l = new lire_fichier("ip.txt");
		ArrayList<String> adress_ip= l.recup_ip();
		ArrayList<String> adress_mac=l.recup_mac();
		
		for (int i=0;i<adress_ip.size();i++) 
		{
			System.out.println(adress_ip.get(i));
		}
		for (int i=0;i<adress_mac.size();i++) 
		{
			System.out.println(adress_mac.get(i));
		}
}}
