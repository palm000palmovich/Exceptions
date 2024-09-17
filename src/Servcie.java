public class Servcie {
    public static void Check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{

        //Проверка логина
        String logRule = "qwertyuiopasdfghjklzxcvbnm_QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        int logCount = 0;
        for (char log: login.toCharArray()){
            for (char logR: logRule.toCharArray()){
                if (logR == log){
                    logCount++;
                }
            }
            }

        if (login.length() > 20 || logCount < login.length()){
            throw new WrongLoginException("Недопустимый логин!");
        }

        //Проверка пароля
        String pasRule = logRule;
        int pasCount = 0;
        for (char pas: password.toCharArray()){
            for (char pasR: pasRule.toCharArray()){
                if (pasR == pas){
                    pasCount++;
                }
            }
        }

        if (password.length() > 20 || pasCount < password.length() || !password.equals(confirmPassword)){
            throw new WrongLoginException("Недопустимый пароль!");
        }

    }

    }

