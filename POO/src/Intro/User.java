package Intro;

public class User {
    //classe é o molde para se criar objetos
    //Membros - propriedades e metodos (comportamentos)

    //Espacos de memoria alocados que fazem o conjunto do objeto existir
    //PROPRIEDADES -> campoDeVisibilidade tipo NomeVariavel
    //PUBLIC - eu tenho acesso direto a esse objeto e modifico de fora. Ex objeto User, definido aqui, mexo la no App.
    //PRIVATE nao me deixa acessar e modificar a propriedade de fora

    //COMPORTAMENTOS -> METODOS

    private boolean isLogged;
    public String firtsName;
    public String lastName;
    public String fullName;

    public Adress adress;
    //objeto dentro de objeto

    //pergunta se esta logado, se estiver consigo mudar o estado dela.
    public void setLogged(boolean logged){
        isLogged = logged;
    }

    public String getFullName() {
        return firtsName + " " + lastName;
    }



}
