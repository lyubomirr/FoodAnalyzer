package bg.sofia.uni.fmi.mjt.foodanalyzer.server.commands.interfaces;

import java.util.concurrent.CompletableFuture;

public interface CommandInvoker {
    CompletableFuture <String> invokeCommand(String command);
}