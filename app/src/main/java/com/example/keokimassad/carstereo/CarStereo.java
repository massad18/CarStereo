package com.example.keokimassad.carstereo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class CarStereo extends AppCompatActivity {

    public static Button preset1,preset2,preset3,preset4,preset5,preset6,volUp,volDown,tuneUp,tuneDown;
    public static ImageButton cdDrive,play,pause,stop,eject,forward,rewind;
    public static ToggleButton aMfM,powerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_stereo);
        powerButton = (ToggleButton) this.findViewById(R.id.powerButton);
        preset1 = (Button) this.findViewById(R.id.button1);
        preset2 = (Button) this.findViewById(R.id.button2);
        preset3 = (Button) this.findViewById(R.id.button3);
        preset4 = (Button) this.findViewById(R.id.button4);
        preset5 = (Button) this.findViewById(R.id.button5);
        preset6 = (Button) this.findViewById(R.id.button6);
        volUp = (Button) this.findViewById(R.id.buttonVUp);
        volDown = (Button) this.findViewById(R.id.buttonVDown);
        aMfM = (ToggleButton) this.findViewById(R.id.buttonAmFm);
        tuneUp = (Button) this.findViewById(R.id.buttonUp);
        tuneDown = (Button) this.findViewById(R.id.buttonDown);
        cdDrive = (ImageButton) this.findViewById(R.id.imageButtonCDDeck);
        play = (ImageButton) this.findViewById(R.id.imageButtonPlay);
        pause = (ImageButton) this.findViewById(R.id.imageButtonPause);
        stop = (ImageButton) this.findViewById(R.id.imageButtonStop);
        eject = (ImageButton) this.findViewById(R.id.imageButtonEject);
        forward = (ImageButton) this.findViewById(R.id.imageButtonForward);
        rewind = (ImageButton) this.findViewById(R.id.imageButtonRepeat);
        PowerView pv = new PowerView(this.getApplicationContext());
        powerButton.setOnClickListener(pv);
        preset1.setOnClickListener(pv);
        preset2.setOnClickListener(pv);
        preset3.setOnClickListener(pv);
        preset4.setOnClickListener(pv);
        preset5.setOnClickListener(pv);
        preset6.setOnClickListener(pv);
        volDown.setOnClickListener(pv);
        volUp.setOnClickListener(pv);
        aMfM.setOnClickListener(pv);
        tuneDown.setOnClickListener(pv);
        tuneUp.setOnClickListener(pv);
        cdDrive.setOnClickListener(pv);
        play.setOnClickListener(pv);
        pause.setOnClickListener(pv);
        stop.setOnClickListener(pv);
        eject.setOnClickListener(pv);
        forward.setOnClickListener(pv);
        rewind.setOnClickListener(pv);
        CarStereo.preset1.setEnabled(false);
        CarStereo.preset2.setEnabled(false);
        CarStereo.preset3.setEnabled(false);
        CarStereo.preset4.setEnabled(false);
        CarStereo.preset5.setEnabled(false);
        CarStereo.preset6.setEnabled(false);
        CarStereo.volUp.setEnabled(false);
        CarStereo.volDown.setEnabled(false);
        CarStereo.aMfM.setEnabled(false);
        CarStereo.tuneUp.setEnabled(false);
        CarStereo.tuneDown.setEnabled(false);
        CarStereo.cdDrive.setEnabled(false);
        CarStereo.play.setEnabled(false);
        CarStereo.pause.setEnabled(false);
        CarStereo.stop.setEnabled(false);
        CarStereo.eject.setEnabled(false);
        CarStereo.forward.setEnabled(false);
        CarStereo.rewind.setEnabled(false);

    }
}
