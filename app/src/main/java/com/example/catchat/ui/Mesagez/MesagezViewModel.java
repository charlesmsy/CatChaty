package com.example.catchat.ui.Mesagez;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MesagezViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MesagezViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Mesagez fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
