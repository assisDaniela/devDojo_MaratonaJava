package exception;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = teclado.nextLine();

        if(!usernameDB.equals(usernameDigitado) ||
            !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
