package com.example.catchat.ui.Halp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HalpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HalpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Halp fragment that needs to be replace with Halp activity");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
