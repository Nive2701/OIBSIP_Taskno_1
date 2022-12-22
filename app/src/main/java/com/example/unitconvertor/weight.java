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

public class weight extends Fragment {
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
        String[] values = {"Kilogram","Gram","Milligram","Pound"};
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
            if (value.equals("Gram") & value1.equals("Kilogram")) {
                res = (num / 1000);
                symbol = "kg";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Gram") & value1.equals("Milligram")) {
                res = (num * 1000);
                symbol ="mg";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Gram") & value1.equals("Pound")) {
                res = (float) (num /453.6);
                symbol = "lb";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Kilogram") & value1.equals("Gram")) {
                res = (num * 1000);
                symbol = "g";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Kilogram") & value1.equals("Milligram")) {
                res = (num * 1000000);
                symbol ="mg";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Kilogram") & value1.equals("Pound")) {
                res = (float) (num * 2.205);
                symbol = "lb";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Milligram") & value1.equals("Kilogram")) {
                res = (num / 1000000);
                symbol = "kg";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Milligram") & value1.equals("Gram")) {
                res = (num / 1000);
                symbol ="g";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Milligram") & value1.equals("Pound")) {
                res = (float) (num / 453600);
                symbol = "lb";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Pound") & value1.equals("Kilogram")) {
                res = (float) (num / 2.205);
                symbol = "kg";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Pound") & value1.equals("Gram")) {
                res = (float) (num * 453.6);
                symbol ="g";
                result.setText(String.format("%f " + symbol,res));
            }
            if (value.equals("Pound") & value1.equals("Milligram")) {
                res = (float) (num * 453600);
                symbol = "mg";
                result.setText(String.format("%f " + symbol,res));
            }
        });

        return view;
    }
}
