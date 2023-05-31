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

public class LosangoFragment extends Fragment {
    private EditText edtTxtDiagonalMaior;
    private EditText edtTxtDiagonalMenor;
    private Button btnCalcular;

    public LosangoFragment() {
        // Construtor vazio obrigatório.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_losango_fragment, container, false);

        edtTxtDiagonalMaior = view.findViewById(R.id.edtTxt_diagonalmaior_losango);
        edtTxtDiagonalMenor = view.findViewById(R.id.edtTxt_diagonalmenor_losango);
        btnCalcular = view.findViewById(R.id.btn_calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularDiagonaisLosango();
            }
        });

        return view;
    }

    private void calcularDiagonaisLosango() {
        double diagonalMaior = Double.parseDouble(edtTxtDiagonalMaior.getText().toString());
        double diagonalMenor = Double.parseDouble(edtTxtDiagonalMenor.getText().toString());

        double resultado = (diagonalMaior * diagonalMenor) / 2;

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Resultado");
        builder.setMessage("O resultado do cálculo é: " + resultado);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Opcional: Adicione um código aqui para lidar com o clique no botão OK, se necessário
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
