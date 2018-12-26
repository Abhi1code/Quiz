package com.example.immadisairaj.quiz.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Difficulty_fragment extends DialogFragment {

    public level level;
    private String[] difficulty = {"Easy", "Medium", "Hard", "Any Difficulty"};

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        level = (level) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Select Difficulty Level");
        builder.setItems(difficulty, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast.makeText(getActivity(), ""+i, Toast.LENGTH_SHORT).show();
                level.diff_level(difficulty[i]);
            }
        });

        Dialog dialog = builder.create();
        return dialog;
    }

    public interface level {
        void diff_level(String level);
    }
}
