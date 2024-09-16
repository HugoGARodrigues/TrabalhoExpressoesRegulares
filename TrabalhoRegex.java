import java.util.regex.Pattern;

public class TrabalhoRegex {

    public static boolean validarNome(String nome) {
        String regex = "^[A-Z][a-z]+( [A-Z][a-z]+)*( [A-Z][a-z]+)$";
        return Pattern.matches(regex, nome);
    }

    public static boolean validarEmail(String email) {
        String regex = "^[a-z]+@[a-z]+(\\.com\\.br|\\.br)$";
        return Pattern.matches(regex, email);
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() != 8) return false;
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8}$";
        return Pattern.matches(regex, senha);
    }

    public static boolean validarCPF(String cpf) {
        String regex = "^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$";
        return Pattern.matches(regex, cpf);
    }

    public static boolean validarTelefone(String telefone) {
        String regex = "^\\(\\d{2}\\) 9\\d{4}-\\d{4}$|^\\(\\d{2}\\) 9\\d{8}$|^\\d{2} 9\\d{8}$";
        return Pattern.matches(regex, telefone);
    }

    public static boolean validarDataHora(String dataHora) {
        String regex = "^\\d{2}/\\d{2}/\\d{4} (?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
        return Pattern.matches(regex, dataHora);
    }

    public static boolean validarNumeroReal(String numero) {
        String regex = "^[+-]?\\d+(\\.\\d+)?$";
        return Pattern.matches(regex, numero);
    }

    public static void main(String[] args) {
        String[] nomes = {
            "Ada Lovelace",
            "Alan Turing",
            "John Doe",
            "Alice Wonderland",
            "Bob Smith",
            "Catherine Zeta-Jones",
            "1an Turing",
            "ada Lovelace",
            "ALICE WONDERLAND",
            "Alice  Wonderland",
            "Alice- Wonderland",
            "A123 Doe"
        };
        System.out.println("Valida Nomes:");
        for (String nome : nomes) {
            System.out.println(nome + (validarNome(nome) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");

        String[] emails = {
            "divulga@ufpa.br",
            "a@a.com.br",
            "test@example.com.br",
            "info@site.br",
            "user@domain.com.br",
            "example@domain.br",
            "a@A.com.br",
            "@domain.com.br",
            "user@domain",
            "user@domain..br",
            "user@.com.br",
            "user@domain.c"
        };
        System.out.println("Valida Email:");
        for (String email : emails) {
            System.out.println(email + (validarEmail(email) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");


        String[] senhas = {
            "518R2r5e",
            "F123456A",
            "A1B2C3D4",
            "P4s5w6o7",
            "Qwerty12",
            "Abcd1234",
            "abcdefgh",
            "12345678",
            "abcdef12",
            "1234ABCD",
            "AB123456",
            "P@ssw0rd"
        };
        System.out.println("Valida Senha:");
        for (String senha : senhas) {
            System.out.println(senha + (validarSenha(senha) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");

        String[] cpfs = {
            "123.456.789-09",
            "000.000.000-00",
            "111.222.333-44",
            "999.888.777-66",
            "555.444.333-22",
            "123.456.789-01",
            "123.456.78-90",
            "123.456.789-0",
            "123.45.678-90",
            "123.456.789-000",
            "12.345.678-90",
            "123.456.78-90"
        };
        System.out.println("Valida CPF:");
        for (String cpf : cpfs) {
            System.out.println(cpf + (validarCPF(cpf) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");

        String[] telefones = {
            "(91) 99999-9999",
            "(91) 999999999",
            "99 999999999",
            "(11) 91234-5678",
            "11 912345678",
            "(21) 98765-4321",
            "91 123456789",
            "(91) 1234567890",
            "91 12345678",
            "(91) 12345678",
            "(91) 9123456789",
            "91 91234-567"
        };
        System.out.println("Valida Telefones:");
        for (String telefone : telefones) {
            System.out.println(telefone + (validarTelefone(telefone) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");

        String[] datasHoras = {
            "31/08/2019 20:14:55",
            "01/01/2020 00:00:00",
            "28/02/2021 23:59:59",
            "15/03/2022 12:34:56",
            "25/12/2023 18:45:30",
            "30/11/2024 22:22:22",
            "99/99/9999 23:59:59",
            "01/13/2020 12:34:56",
            "31/04/2022 12:34:56",
            "01/01/2020 24:00:00",
            "15/03/2022 12:60:00",
            "25/12/2023 18:45:60"
        };
        System.out.println("Valida Data e Hora:");
        for (String dataHora : datasHoras) {
            System.out.println(dataHora + (validarDataHora(dataHora) ? " é válido" : " nao é válido"));
        }

        System.out.println("-------------------------------------------------------------------------");

        String[] numerosReais = {
            "-25.467",
            "1",
            "+1",
            "64.2",
            "-0.123",
            "+123.456",
            "25.",
            ".467",
            "+64,2",
            "1.0.0",
            "++1.0",
            "123."
        };
        System.out.println("Valida Numeros Reais:");
        for (String numero : numerosReais) {
            System.out.println(numero + (validarNumeroReal(numero) ? " é válido" : " nao é válido"));
        }
    }
}
