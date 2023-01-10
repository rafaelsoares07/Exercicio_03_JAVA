public class Usuario {
    String nome;
    private String email;
    Faculdade faculdade = new Faculdade();

    String getEmail(){
        return this.email;
    }

    void setEmail(String email){
        this.email = email;
    }
}
