package fr.usmb.m1isc.compilation.tp;

public class Arbre {
	
	public enum NodeType {SEQUENCE, EXPRESSION, EXPR, VAR, INT, OUTPUT, INPUT, NIL ;}
	private NodeType type;
	private String format;
	private Arbre fGauche,fDroite;    
    
    public Arbre(NodeType t,String s){
        this.type=t;
        this.format=s;
        this.fGauche=null;
        this.fDroite=null;
	}
    
	public Arbre(NodeType t,String s,Arbre a1, Arbre a2){
        this.type=t;
        this.format=s;
        this.fGauche=a1;
        this.fDroite=a2;
	}
	
    @Override
    public String toString() {
        String str="";
        
        if (!(this.fGauche==null && this.fDroite==null)) {
        	str = "(";
        }
        
        str=str.concat(this.format);

        if (this.fGauche != null) {
            str=str.concat(" "+this.fGauche.toString()+" ");
        }
        
        if (this.fDroite != null) {
            str=str.concat(" "+this.fDroite.toString()+" ");
        }
        
        if (!(this.fGauche==null && this.fDroite==null)){
        	str=str.concat(")");
        }
        
        return str;
    }
	
}