package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {



    Button buttonTop;
    Button buttonBottom;
    TextView storyTextView;
    int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        storyTextView.setText(R.string.T1_Story);
        buttonBottom.setText(R.string.T1_Ans2);
        buttonTop.setText(R.string.T1_Ans1);


        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storyTextView.setText(R.string.T2_Story);
                buttonBottom.setText(R.string.T2_Ans2);
                buttonTop.setText(R.string.T2_Ans1);
                buttonTop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        storyTextView.setText(R.string.T3_Story);
                        buttonBottom.setText(R.string.T3_Ans2);
                        buttonTop.setText(R.string.T3_Ans1);
                        buttonBottom.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                storyTextView.setText(R.string.T5_End);
                                buttonBottom.setVisibility(View.GONE);
                                buttonTop.setVisibility(View.GONE);
                            }
                        });
                        buttonTop.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                storyTextView.setText(R.string.T6_End);
                                buttonBottom.setVisibility(View.GONE);
                                buttonTop.setVisibility(View.GONE);

                            }
                        });
                    }
                });
                buttonBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        storyTextView.setText(R.string.T4_End);
                        buttonBottom.setVisibility(View.GONE);
                        buttonTop.setVisibility(View.GONE);
                    }
                });
            }

        });




        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storyTextView.setText(R.string.T3_Story);
                buttonBottom.setText(R.string.T3_Ans2);
                buttonTop.setText(R.string.T3_Ans1);
                buttonTop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        storyTextView.setText(R.string.T6_End);
                        buttonBottom.setVisibility(View.GONE);
                        buttonTop.setVisibility(View.GONE);
                    }
                });
                buttonBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        storyTextView.setText(R.string.T5_End);
                        buttonBottom.setVisibility(View.GONE);
                        buttonTop.setVisibility(View.GONE);
                    }
                });

            }
        });
    }
}
