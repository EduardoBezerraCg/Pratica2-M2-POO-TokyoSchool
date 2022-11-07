package CondicioIF;

import java.util.Scanner;

public class LoginEsenha {

    public static void main(String[] args) {
        int c = 0;
        while (c < 3){
            Scanner in = new Scanner(System.in);

            System.out.println("Informe o login: ");
            String login = in.nextLine();

            System.out.println("Informe a Senha: ");
            String senha = in.nextLine();

            if (login.equals(login)  && senha.equals("07417743137")) {
                System.out.printf("Usuario %s logado com sucesso.", login);
                break;
            }else{
                System.out.println("Login ou senha invalidos!");
                c++;
            }
        }
        if (c==3)
            System.out.println("Numero de tentativas excedidas");
    }

}

