package com.example.unitconvertor;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class temp extends Fragment {
    View view;
    float num;
    float res;
    Button button;
    EditText val;
    EditText result;
    Spinner spinnerf;
    Spinner spinnert;
    String symbol = " ";

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] values = {"Fahrenheit","Celsius","Kelvin"};
        view = inflater.inflate(R.layout.fragment_length, container, false);
        spinnerf =view.findViewById(R.id.spinnerf);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnerf.setAdapter(adapter);

        spinnert = view.findViewById(R.id.spinnert);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, values);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinnert.setAdapter(adapter1);

        val = view.findViewById(R.id.editText);
        result = view.findViewById(R.id.result);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(view -> {
            String value = spinnerf.getSelectedItem().toString();
            String value1 = spinnert.getSelectedItem().toString();
            String str = val.getText().toString();
            if (!str.isEmpty()) {
                num = Float.parseFloat(str);
            } else {
                Toast.makeText(getActivity(), "Enter Value", Toast.LENGTH_SHORT).show();
            }
            if (value.equals("Celsius") & value1.equals("Fahrenheit")) {
                res = (float) (num * 1.8 + 32);
                symbol = (char) 0x00B0 + "F";
                result.setText(String.format("%.1f " + symbol,res));
            }
            if (value.equals("Celsius") & value1.equals("Kelvin")) {
                res = (float) (num + 273.15);
                symbol = (char) 0x00B0 + "K";
                result.setText(String.format("%.1f " + symbol, res));
            }
            if (value.equals("Fahrenheit") & value1.equals("Celsius")) {
                res = (float) (num - 32 * 1.8);
                symbol = (char) 0x00B0 + "C";
                result.setText(String.format("%.1f " + symbol,res));
            }
            if (value.equals("Fahrenheit") & value1.equals("Kelvin")) {
                res = (float) (num-32 * 1.8 + 273.15);
                symbol = (char) 0x00B0 + "K";
                result.setText(String.format("%.1f " + symbol, res));
            }
            if (value.equals("Kelvin") & value1.equals("Celsius")) {
                res = (float) (num - 273.15);
                symbol = (char) 0x00B0 + "C";
                result.setText(String.format("%.1f " + symbol,res));
            }
            if (value.equals("Kelvin") & value1.equals("Fahrenheit")) {
                res = (float) (num-273.15 * 1.8 + 32);
                symbol = (char) 0x00B0 + "F";
                result.setText(String.format("%.1f " + symbol, res));
            }
        });

        return view;
    }
}






