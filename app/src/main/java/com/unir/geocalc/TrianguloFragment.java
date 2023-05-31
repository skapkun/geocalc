package com.unir.geocalc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.unir.geocalc.R;

public class TrianguloFragment extends Fragment {
    private EditText edtTxtValorBase;
    private EditText edtTxtValorAltura;
    private Button btnCalcular;

    public TrianguloFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_triangulo, container, false);

        edtTxtValorBase = view.findViewById(R.id.edtTxt_valorbase);
        edtTxtValorAltura = view.findViewById(R.id.edtTxt_valoraltura_triangulo);
        btnCalcular = view.findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularAreaTriangulo();
            }
        });

        return view;
    }

    private void calcularAreaTriangulo() {
        double valorBase = Double.parseDouble(edtTxtValorBase.getText().toString());
        double valorAltura = Double.parseDouble(edtTxtValorAltura.getText().toString());

        double area = (valorBase * valorAltura) / 2;

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Resultado");
        builder.setMessage("A área do triângulo é: " + area);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
