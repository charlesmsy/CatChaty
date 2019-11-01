package com.example.catchat.ui.InDaTrash;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.catchat.R;

public class InDaTrashFragment extends Fragment {

    private InDaTrashViewModel indatrashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        indatrashViewModel =
                ViewModelProviders.of(this).get(InDaTrashViewModel.class);
        View root = inflater.inflate(R.layout.in_da_trash_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_indatrash);
        indatrashViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

