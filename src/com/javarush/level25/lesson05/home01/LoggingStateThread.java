package com.javarush.level25.lesson05.home01;

/**
 * Created by Andriana_Yarmoliuk on 10/19/2016.
 */
public class LoggingStateThread extends Thread
{
    private Thread target;
    private State state;
    public LoggingStateThread(Thread thread){
        this.target = thread;
        setDaemon(true);
    }
    @Override
    public void run(){
        State targetState = target.getState();
        System.out.println(targetState);
        state = this.getState();
        while (state != State.TERMINATED)
        {
            targetState = target.getState();
            if (targetState != state)
            {
                state = targetState;
                System.out.println(state);
            }
        }

    }
}
