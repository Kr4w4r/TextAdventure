package de.krawie.textadventure.framework.input;

import java.util.Iterator;

import de.krawie.textadventure.framework.savegame.GameLog;

public class ReplayGameInputProvider implements InputProvider {

    private Iterator<String> inputsIterator;

    public ReplayGameInputProvider(GameLog gameLog) {
        inputsIterator = gameLog.getInputs().iterator();
    }

    @Override
    public String getInput() {
        System.out.println("\nWas möchtest du tun?");
        String nextInput = inputsIterator.next();

        System.out.println(nextInput);

        return nextInput;
    }

    @Override
    public boolean hasMoreInputs() {
        return inputsIterator.hasNext();
    }
    
}
