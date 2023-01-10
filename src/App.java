public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuarioOne = new Usuario();
        usuarioOne.nome = "Rafael";
        usuarioOne.setEmail("rafaels56@gmail.com");

        System.out.println(usuarioOne.nome); 
        System.out.println(usuarioOne.getEmail());
        System.out.println(usuarioOne.faculdade.endereço);
    
    }
}
