package edu.asu.aspira;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class PushService extends Service {
    private final int SECOND = 1000;
    private final int MINUTE = SECOND * 60;
    private int count;
    public PushService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        count = 0;
        createTimer(SECOND * 10);
        return START_STICKY;
    }

    class PushTimer extends TimerTask{

        @Override
        public void run() {
            count++;
            System.out.println("Count is " + count);
            createTimer(SECOND * 10);
        }
    }

    private void createTimer(long delay){
        Timer timer = new Timer();
        timer.schedule(new PushTimer(), delay);
    }
}


