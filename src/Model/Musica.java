
package Model;

public class Musica {
    private String nome;
    private double mediaAvaliacao;
    
    
    public Musica(String nome){
    this.nome = nome;
    }
     public Musica(String nome, int nota){
    this.nome = nome;
    }
     public Musica(String nome, double media){
    this.nome = nome;
    this.mediaAvaliacao = media;
    }
    public Musica(){
        
    } 
    
    public String getNomeMusica(){
        return nome;
    }
    public double getMedia(){
        return mediaAvaliacao;
    }
    
    
    
    
}
