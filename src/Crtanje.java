public interface Crtanje {

    String crtaj();

    default String crtajBroj(int i){

        return "Crtanje";
    }
}
