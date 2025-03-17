
public class Contatto {
	
	private String nome;
	private String numero;
	
	public Contatto(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	public Contatto() {
        this.nome = "";
        this.numero = "";
    }
	
	public String getNome() {
        return nome;
    }
	
	public String getNumero() {
        return numero;
    }
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public void setNumero(String numero) {
        this.numero = numero;
    }
	
	@Override
	public String toString() {
        return "Nome: " + nome + "\n" +  "Numero: " + numero;
    }

}
