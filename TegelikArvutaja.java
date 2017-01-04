class TegelikArvutaja implements Arvutaja{
	double puhver=0;
	String tehe="?";
	String paneel="";
    public String ekraan(){
		return paneel;
	}	
	public void nupp(String kood){
		if(kood.equals("+")){
		  puhver=Double.parseDouble(paneel);
		  tehe="+";
		  paneel="";
		} else if(kood.equals("-")){
		  puhver=Double.parseDouble(paneel);
		  tehe="-";
		  paneel="";
		} else if(kood.equals("x")){
		  puhver=Double.parseDouble(paneel);
		  tehe="x";
		  paneel="";
		} else if(kood.equals("/")){
		  puhver=Double.parseDouble(paneel);
		  tehe="/";
		  paneel="";
		} else if(kood.equals("C")){
		  paneel="";
		} else if(kood.equals("=")){
			if(tehe.equals("+")){
				paneel=String.valueOf(puhver+Double.parseDouble(paneel));
			}
			if(tehe.equals("-")){
				paneel=String.valueOf(puhver-Double.parseDouble(paneel));
			}
			if(tehe.equals("x")){
				paneel=String.valueOf(puhver*Double.parseDouble(paneel));
			}
			if(tehe.equals("/")){
				paneel=String.valueOf(puhver/Double.parseDouble(paneel));
			}
		}else {
		  paneel+=kood;
		}
		//Juurde tehted
	}
}