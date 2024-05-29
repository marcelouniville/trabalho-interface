package br.univille.logger;

import java.lang.System.Logger.Level;

public class LoggerConsole implements Logger{

    @Override
    public void log(br.univille.logger.Level level, String message) {
        // TODO Auto-generated method stub
        switch (level) {
            case DEBUG:
                System.out.println("\u001B[32m" + message + "\u001B[0m"); // Green
                break;
            case WARNING:
                System.out.println("\u001B[33m" + message + "\u001B[0m"); // Yellow
                break;
            case ERROR:
                System.out.println("\u001B[31m" + message + "\u001B[0m"); // Red
                break;
            default:
                System.out.println(message);
    }
}
}