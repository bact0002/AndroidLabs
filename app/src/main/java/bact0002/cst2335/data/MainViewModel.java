package bact0002.cst2335.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel{

    public MutableLiveData<String> editString = new MutableLiveData<>();

    public MutableLiveData<Boolean> isSelected = new MutableLiveData<>();


    }

