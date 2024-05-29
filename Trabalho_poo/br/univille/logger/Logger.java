package br.univille.logger;

import java.lang.System.Logger.Level;

public interface Logger {
    void log(br.univille.logger.Level debug, String message);
}