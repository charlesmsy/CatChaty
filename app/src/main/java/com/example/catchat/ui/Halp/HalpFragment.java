package com.example.catchat.ui.Halp;

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
import com.example.catchat.ui.InDaTrash.InDaTrashViewModel;

public class HalpFragment extends Fragment {

    private HalpViewModel halpViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        halpViewModel =
                ViewModelProviders.of(this).get(HalpViewModel.class);
        View root = inflater.inflate(R.layout.halp_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_halp);
        halpViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
