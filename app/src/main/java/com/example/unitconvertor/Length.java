package com.example.unitconvertor;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Length extends Fragment {
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
        String[] values = {"meter", "kilometre", "centimeter", "millimetre", "inch", "foot"};
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
            if (value.equals("meter") & value1.equals("kilometre")) {
                res = (num / 1000);
                symbol = "km";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("meter") & value1.equals("centimeter")) {
                res = (num * 100);
                symbol = "cm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("meter") & value1.equals("millimetre")) {
                res = (num * 1000);
                symbol = "mm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("meter") & value1.equals("inch")) {
                res = (float) (num * 39.37);
                symbol = "in";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("meter") & value1.equals("foot")) {
                res = (float) (num * 3.281);
                symbol = "ft";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("kilometre") & value1.equals("meter")) {
                res = (num * 1000);
                symbol = "m";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("kilometre") & value1.equals("centimeter")) {
                res = (num * 100000);
                symbol = "cm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("kilometre") & value1.equals("millimetre")) {
                res = (num * 1000000);
                symbol = "mm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("kilometre") & value1.equals("inch")) {
                res = (num * 39370);
                symbol = "in";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("kilometre") & value1.equals("foot")) {
                res = (num * 3281);
                symbol = "ft";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("centimeter") & value1.equals("meter")) {
                res = (num / 100);
                symbol = "m";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("centimeter") & value1.equals("kilometre")) {
                res = (num / 100000);
                symbol = "km";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("centimeter") & value1.equals("millimetre")) {
                res = (num * 10);
                symbol = "mm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("centimeter") & value1.equals("inch")) {
                res = (float) (num / 2.54);
                symbol = "in";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("centimeter") & value1.equals("foot")) {
                res = (float) (num / 30.48);
                symbol = "ft";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("millimetre") & value1.equals("meter")) {
                res = (num / 1000);
                symbol = "m";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("millimetre") & value1.equals("centimeter")) {
                res = (num / 10);
                symbol = "cm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("millimetre") & value1.equals("kilometre")) {
                res = (num / 1000000);
                symbol = "km";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("millimetre") & value1.equals("inch")) {
                res = (float) (num / 25.4);
                symbol = "in";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("millimetre") & value1.equals("foot")) {
                res = (float) (num * 304.8);
                symbol = "ft";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("inch") & value1.equals("meter")) {
                res = (float) (num / 39.37);
                symbol = "m";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("inch") & value1.equals("centimeter")) {
                res = (float) (num * 2.54);
                symbol = "cm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("inch") & value1.equals("kilometre")) {
                res = (num / 39370);
                symbol = "km";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("inch") & value1.equals("millimetre")) {
                res = (float) (num * 25.4);
                symbol = "mm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("inch") & value1.equals("foot")) {
                res = (num / 12);
                symbol = "ft";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("foot") & value1.equals("meter")) {
                res = (float) (num / 3.281);
                symbol = "m";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("foot") & value1.equals("centimeter")) {
                res = (float) (num * 30.48);
                symbol = "cm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("foot") & value1.equals("kilometre")) {
                res = (num / 3281);
                symbol = "km";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("foot") & value1.equals("millimetre")) {
                res = (float) (num * 304.8);
                symbol = "mm";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("foot") & value1.equals("inch")) {
                res = (num * 12);
                symbol = "in";
                result.setText(String.format("%f " + symbol,res));
            }
        });

        return view;
    }
}



