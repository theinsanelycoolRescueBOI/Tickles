package ip;

import java.io.*;
import java.util.regex.*;
import java.util.ArrayList;

public class lire_fichier {

	
	//private Pattern pattern;
    //private Matcher matcher;
    private String fichier;
    private String comptenu;
    
    public lire_fichier(String fichier)
    {
    	//this.pattern=recherche;
    	//this.matcher=test;
    	this.fichier=fichier;
    
    try{
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
			//System.out.println(ligne);
			this.comptenu+=ligne+"\n";
		}
		br.close(); 
	}		
	catch (Exception e){
		System.out.println(e.toString());
	}
    
    }
    
    
    public ArrayList<String> recup_ip()
    {
    	
    	ArrayList<String> adresse = new ArrayList<String>(); 
    	int i=0;
    	Pattern p = Pattern.compile("([0-9]+\\.){3}[0-9]+") ;      
    	Matcher m = p.matcher(comptenu);
    	while (m.find()) 
    	{  	
    		adresse.add(m.group());
    		i++;
    	}
    	return adresse;
    }
    
    
    public ArrayList<String> recup_mac()
    {
    	
    	//String[] adresse = new String[20];
    	ArrayList<String> adresse = new ArrayList<String>();  
    	int i=0;
    	Pattern p = Pattern.compile("([0-F]+\\-){5}[0-F]+") ;      
    	Matcher m = p.matcher(comptenu);
    	while (m.find()) 
    	{  	
    		adresse.add(m.group());
    		i++;
    	}
    	return adresse;
    }
    }

