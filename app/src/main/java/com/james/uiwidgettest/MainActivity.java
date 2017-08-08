package com.james.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                /* //更改textview的显示内容
                String newText="fxxk you";
                TextView textView1=(TextView)findViewById(R.id.text_view);
                textView1.setText(newText);*/

                /*
                * //获取edittext的输入内容
                EditText editText1=(EditText)findViewById(R.id.edit_test);
                Toast.makeText(MainActivity.this,editText1.getText(),Toast.LENGTH_SHORT).show();
                 */

                /*
                //更改显示的图片
                ImageView imageView=(ImageView)findViewById(R.id.img_view);
                imageView.setImageResource(R.drawable.img2);
                */
                ProgressBar progressBar=(ProgressBar)findViewById(R.id.progress_bar);
                /*if(progressBar.getVisibility()==View.GONE){
                    progressBar.setVisibility(View.VISIBLE);

                }
                else {
                    progressBar.setVisibility(View.GONE);
                }*/
                int progress=progressBar.getProgress();
                progressBar.setProgress(progress+10);
            }
        });
    }
}
