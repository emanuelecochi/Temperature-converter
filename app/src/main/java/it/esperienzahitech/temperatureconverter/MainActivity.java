package it.esperienzahitech.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tempCelsius;
    TextView tempFahr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // variable
        tempCelsius = findViewById(R.id.tempCelsius);
        tempFahr = findViewById(R.id.tempFahr);


    }


    public void convertTemperature(View view) {
        Log.d("convertTemperature", "click on button convert");

        //Rean temperature Celsius insert
        String tempCelsiusString = tempCelsius.getText().toString();
        if (tempCelsiusString.equals("")) {
            Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.insert_temp_msg), Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        Log.d("convertTemperature", "Temeperature Celsius: " + tempCelsiusString);

        // Convert temperature Celsius string in double
        Double tempCelsiusDouble = Double.parseDouble(tempCelsiusString);

        Double tempFDouble = tempCelsiusDouble * 1.8 + 32;


        // Set result conversion in text view tempFahr
        String result = String.format("%.2f", tempFDouble);
        tempFahr.setText(result);


    }
}
