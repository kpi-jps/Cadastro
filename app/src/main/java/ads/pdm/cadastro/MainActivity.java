package ads.pdm.cadastro;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import ads.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    private FormData getFormData() {
        String gender = (amb.rbFemale.isChecked()) ? "Feminino" : "Masculino";
        return new FormData(
                amb.etName.getText().toString(),
                amb.etPhone.getText().toString(),
                amb.etEmail.getText().toString(),
                amb.cbEmail.isChecked(),
                gender,
                amb.etCity.getText().toString(),
                amb.spState.getSelectedItem().toString()
        );
    }

    private void clearForm() {
        amb.etName.getText().clear();
        amb.etPhone.getText().clear();
        amb.etEmail.getText().clear();
        amb.cbEmail.setChecked(false);
        amb.rbFemale.setChecked(false);
        amb.rbMale.setChecked(true);
        amb.etCity.getText().clear();
        amb.spState.setSelection(0);
    }


    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        amb.rbMale.setChecked(true);
        amb.btSave.setOnClickListener(view -> {
            FormData formData = getFormData();
            Toast toast =  Toast.makeText(getApplicationContext(),
                    formData.toString(),
                    Toast.LENGTH_LONG);
            toast.addCallback(new Toast.Callback() {
                @Override
                public void onToastHidden() {
                    clearForm();
                }
            });
            toast.show();
        });


        amb.btClear.setOnClickListener(view -> {
            clearForm();
        });
    }
}