package com.jarvis.rxjavaexamples.views.launcher;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jarvis.rxjavaexamples.R;
import com.jarvis.rxjavaexamples.views.intro_to_rxjava_rxandroid.MultipleObserverWithCompositeDisposableActivity;
import com.jarvis.rxjavaexamples.views.observables_type.TypesOfObservableActivity;
import com.jarvis.rxjavaexamples.views.rx_operators.RxOperatorsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Sachin
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tvIntro)
    TextView tvIntro;

    @BindView(R.id.tvRxJavaOperators)
    TextView tvRxJavaOperators;

    @BindView(R.id.tvObservableTypes)
    TextView tvObservableTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This app is the property of SachinRajput", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @OnClick({R.id.tvIntro, R.id.tvRxJavaOperators, R.id.tvObservableTypes})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvIntro:
                Intent intent = new Intent(MainActivity.this, MultipleObserverWithCompositeDisposableActivity.class);
                startActivity(intent);
                break;

            case R.id.tvRxJavaOperators:
//                Toast.makeText(MainActivity.this, "Coming soon :) ", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, RxOperatorsActivity.class);
                startActivity(intent1);
                break;

            case R.id.tvObservableTypes:
                Intent intent2 = new Intent(MainActivity.this, TypesOfObservableActivity.class);
                startActivity(intent2);
                break;
        }
    }

}
