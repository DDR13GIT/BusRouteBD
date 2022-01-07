package com.example.busroutebd;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.dialog.MaterialDialogs;

public class Settings_Fragment extends Fragment {
    private Button aboutDevBtn;
    MaterialAlertDialogBuilder dialog;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_fragment, container, false);
        dialog = new MaterialAlertDialogBuilder(view.getContext());
        aboutDevBtn = view.findViewById(R.id.aboutDevButton);
        aboutDevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog();
            }
        });


        return view;


    }

    private void showCustomDialog() {
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        dialog.setCancelable(true);
//        dialog.setContentView(R.layout.about_dev_dialog);
//        dialog.show();

         dialog.setTitle("Developers");
         dialog.setMessage(R.string.aboutDevMessage);
         dialog.setIcon(R.drawable.round_developer_mode_24);
        dialog.setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
dialog.setCancelable(true);

        dialog.show();


    }
}
