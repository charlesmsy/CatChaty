package com.example.catchat.ui.InDaTrash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InDaTrashViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InDaTrashViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is InDaTrash fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
