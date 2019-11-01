package com.example.catchat.ui.Mesagez;

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

public class MesagezFragment extends Fragment {

    private MesagezViewModel mesagezViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mesagezViewModel =
                ViewModelProviders.of(this).get(MesagezViewModel.class);
        View root = inflater.inflate(R.layout.mesagez_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_mesagez);
        mesagezViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
