package com.appmob.appmob.ui.developer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeveloperViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DeveloperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Developer Menu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}