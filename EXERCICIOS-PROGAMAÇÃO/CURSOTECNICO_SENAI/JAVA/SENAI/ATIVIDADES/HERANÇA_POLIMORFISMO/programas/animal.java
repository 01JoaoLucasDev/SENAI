package programas;

public abstract class animal {
    String nome;

    public animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Som generico animal");
    }

    public abstract void Fazersom();
}
