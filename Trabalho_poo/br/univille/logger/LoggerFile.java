package br.univille.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger{
        private final String fileName;

    public LoggerFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(br.univille.logger.Level level, String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.println("[" + timestamp + "] [" + level + "] " + message);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
    
}