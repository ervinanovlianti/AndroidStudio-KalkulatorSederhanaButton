package stmik.profesional.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] operator = {"Pilih Operator", "+", "-", "*", "/"};
    double hasilhitung;
    String soperator;
    String nil_a, nil_b, nil_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nilaia = (EditText) findViewById(R.id.NilA);
        EditText nilaib = (EditText) findViewById(R.id.NilB);
        EditText nilaic = (EditText) findViewById(R.id.NilC);

        EditText hasil = (EditText) findViewById(R.id.hasil);
        Spinner spinnerOperator = (Spinner) findViewById(R.id.spinner);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operator);
        spinnerOperator.setAdapter(adapter);
        spinnerOperator.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                nil_a = nilaia.getText().toString();
                nil_b = nilaib.getText().toString();
                nil_c = nilaic.getText().toString();

                soperator = adapter.getItem(i);
                switch (soperator) {
                    case "Pilih Operator":
                        hasil.setText("");
                        break;
                    case "+":
                        hasilhitung = (Double.valueOf(nil_a) + Double.valueOf(nil_b) + Double.valueOf(nil_c));
                        hasil.setText("Nilai A : " + nil_a + "\nNilai B : " + nil_b + "\nNilai C : " + nil_c + "\nHasil : " + hasilhitung);
                        break;
                    case "-":
                        hasilhitung = (Double.valueOf(nil_a) - Double.valueOf(nil_b) - Double.valueOf(nil_b));
                        hasil.setText("Nilai A : " + nil_a + "\nNilai B : " + nil_b + "\nNilai C : " + nil_c + "\nHasil : " + hasilhitung);
                        break;
                    case "*":
                        hasilhitung = (Double.valueOf(nil_a) * Double.valueOf(nil_b) * Double.valueOf(nil_b));
                        hasil.setText("Nilai A : " + nil_a + "\nNilai B : " + nil_b + "\nNilai C : " + nil_c + "\nHasil : " + hasilhitung);
                        break;
                    case "/":
                        hasilhitung = (Double.valueOf(nil_a) * Double.valueOf(nil_b) / Double.valueOf(nil_b));
                        hasil.setText("Nilai A : " + nil_a + "\nNilai B : " + nil_b + "\nNilai C : " + nil_c + "\nHasil : " + hasilhitung);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}




