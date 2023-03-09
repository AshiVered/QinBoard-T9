package org.nyanya.android.traditionalt9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.view.inputmethod.InputMethodManager;

public class KeyboardActivity extends Activity {

    private Button keyboardSettingsButton;
    private Button inputMethodSettingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

        // Find the buttons in the layout by their IDs
        keyboardSettingsButton = findViewById(R.id.keyboard_settings_button);
        inputMethodSettingsButton = findViewById(R.id.input_method_settings_button);

        // Set click listeners for the buttons
        keyboardSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
                startActivity(intent);
            }
        });

        inputMethodSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE); imeManager.showInputMethodPicker();

            }
        });
    }
}
