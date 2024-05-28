
public class Main {

    public static void main(String[] args) {
    LoggerFactory loggerFactory = new LoggerFactory("arquivo.txt");

    LoggerFactory.Loggerconsole("Essa é uma mensagem de DEBUG",Level.DEBUG);
    LoggerFactory.Loggerconsole("Essa é uma mensagem de ERRO",Level.ERROR);
    LoggerFactory.Loggerconsole("Essa é uma mensagem de AVISO",Level.WARNING);
    LoggerFactory.Loggerconsole("Essa é uma mensagem NORMAL",Level.NORMAL);

    LoggerFactory.LoggerFile("Essa é uma mensagem de DEBUG",Level.DEBUG);
    LoggerFactory.LoggerFile("Essa é uma mensagem de ERRO",Level.ERROR);
    LoggerFactory.LoggerFile("Essa é uma mensagem de AVISO",Level.WARNING);
    LoggerFactory.LoggerFile("Essa é uma mensagem NORMAL",Level.NORMAL);
    }
}
