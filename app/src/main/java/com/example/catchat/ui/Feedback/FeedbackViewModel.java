package com.example.catchat.ui.Feedback;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FeedbackViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FeedbackViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Feedback fragment that needs to be replace with Feedback activity");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
