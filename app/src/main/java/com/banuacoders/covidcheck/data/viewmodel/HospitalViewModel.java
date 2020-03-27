package com.banuacoders.covidcheck.data.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.banuacoders.covidcheck.data.object.Hospital;
import com.banuacoders.covidcheck.data.repository.HospitalRepository;

import java.util.List;

public class HospitalViewModel extends AndroidViewModel {
    private HospitalRepository repository;
    private LiveData<List<Hospital>> allHospital;

    public HospitalViewModel(@NonNull Application application) {
        super(application);
        repository = new HospitalRepository(application);
        allHospital = repository.getAllHospitals();
    }

    public void insert(Hospital hospital) {
        repository.insert(hospital);
    }

    public void deleteAllHospital() {
        repository.deleteAllHospital();
    }

    public LiveData<List<Hospital>> getAllHospital() {
        return allHospital;
    }
}
