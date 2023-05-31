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



public class TrapezioFragment extends Fragment {
    private EditText edtValorBaseMaior;
    private EditText edtValorBaseMenor;
    private EditText edtValorAltura;
    private Button btnCalcular;

    public TrapezioFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trapezio_fragment, container, false);

        edtValorBaseMaior = view.findViewById(R.id.edtTxt_valorbase);
        edtValorBaseMenor = view.findViewById(R.id.edtTxt_valorbasemenor_trapezio);
        edtValorAltura = view.findViewById(R.id.edtTxt_valoraltura_trapezio);
        btnCalcular = view.findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTrapezio();
            }
        });

        return view;
    }

    private void calcularTrapezio() {
        double valorBaseMaior = Double.parseDouble(edtValorBaseMaior.getText().toString());
        double valorBaseMenor = Double.parseDouble(edtValorBaseMenor.getText().toString());
        double valorAltura = Double.parseDouble(edtValorAltura.getText().toString());

        double tamanhoTrapezio = ((valorBaseMaior + valorBaseMenor) * valorAltura) / 2;


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Resultado");
        builder.setMessage("O tamanho do trapézio é: " + tamanhoTrapezio);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        // Exibe o AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
