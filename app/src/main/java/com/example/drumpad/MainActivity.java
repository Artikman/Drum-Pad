package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = soundPool.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = soundPool.load(getApplicationContext(), R.raw.sound2, 1);
        sound3 = soundPool.load(getApplicationContext(), R.raw.sound3, 1);
        sound4 = soundPool.load(getApplicationContext(), R.raw.sound4, 1);
        sound5 = soundPool.load(getApplicationContext(), R.raw.sound5, 1);
        sound6 = soundPool.load(getApplicationContext(), R.raw.sound6, 1);
        sound7 = soundPool.load(getApplicationContext(), R.raw.sound7, 1);
        sound8 = soundPool.load(getApplicationContext(), R.raw.sound8, 1);
        sound9 = soundPool.load(getApplicationContext(), R.raw.sound9, 1);
        sound00 = soundPool.load(getApplicationContext(), R.raw.sound00, 1);
    }

    public void playsound1(View v) {
        soundPool.play(sound1, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound2(View v) {
        soundPool.play(sound2, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound3(View v) {
        soundPool.play(sound3, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound4(View v) {
        soundPool.play(sound4, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound5(View v) {
        soundPool.play(sound5, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound6(View v) {
        soundPool.play(sound6, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound7(View v) {
        soundPool.play(sound7, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound8(View v) {
        soundPool.play(sound8, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void playsound9(View v) {
        soundPool.play(sound9, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
