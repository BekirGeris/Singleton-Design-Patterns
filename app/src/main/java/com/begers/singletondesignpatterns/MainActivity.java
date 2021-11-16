package com.begers.singletondesignpatterns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.begers.singletondesignpatterns.singleton.EagerInitializationSingleton;
import com.begers.singletondesignpatterns.singleton.LazySingleton;
import com.begers.singletondesignpatterns.singleton.StaticBlockSingleton;
import com.begers.singletondesignpatterns.singleton.ThreadSafeSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getInstance().singletonTest();

        LazySingleton.getInstance().singletonTest();

        ThreadSafeSingleton.getInstance().singletonTest();
    }
}