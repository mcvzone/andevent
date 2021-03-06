package com.example.neo.andevent;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProgressSeekActivity extends AppCompatActivity implements View.OnClickListener{
    ProgressBar progressbar;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_seek);

        progressbar = (ProgressBar)findViewById(R.id.bar_pb_progressbar) ;

        findViewById(R.id.bar_bt_execute).setOnClickListener(this);
        findViewById(R.id.bar_bt_execute2).setOnClickListener(this);

        textview = (TextView)findViewById(R.id.bar_tx_textView);

        SeekBar seekbar = (SeekBar)findViewById(R.id.seekBar);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textview.setText("설정된 값  : " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar seekbar2 = (SeekBar)findViewById(R.id.seekBar2);
        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textview.setText("설정된 값  : " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bar_bt_execute:
                progressbar.setProgress(50);
                break;

            case R.id.bar_bt_execute2:
                ProgressDialog dialog = new ProgressDialog(this);
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                dialog.setTitle("진행상태");
                dialog.setMessage("데이터를 확인 하는 중입니다.");
                dialog.show();
                break;
        }
    }
}
