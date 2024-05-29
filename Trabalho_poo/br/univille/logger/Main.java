package br.univille.logger;

public class Main{
    public static void main(String[] args) {
        //ERRADO
        // Logger consoleLogger = LoggerFactory.onConsole();
        // consoleLogger.log(Level.DEBUG, "Mensagem de exemplo no console");

        // Logger fileLogger = LoggerFactory.onFile("log.txt");
        // fileLogger.log(Level.ERROR, "Erro crítico registrado no arquivo");

        Logger consoleLogger = LoggerFactory.onConsole();

        consoleLogger.log(Level.DEBUG,   "Mensagem de debug.");
        consoleLogger.log(Level.WARNING, "Atenção, Isso é um aviso!");
        consoleLogger.log(Level.ERROR,  "Erro detectado!");

    }
}