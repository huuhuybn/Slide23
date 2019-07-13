package com.d.slide2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbCheckBox;
    private RadioGroup rgRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbCheckBox = findViewById(R.id.cbCheckBox);

        boolean checkBox = cbCheckBox.isChecked();


        cbCheckBox.setChecked(true);


        rgRadioGroup = findViewById(R.id.rgRadioGroup);

        int index = rgRadioGroup.getCheckedRadioButtonId();









    }
}
