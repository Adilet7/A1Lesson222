package com.example.a1lesson222.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.a1lesson222.R;
import com.example.a1lesson222.databinding.FragmentCreateTaskBinding;

public class CreateTaskFragment extends Fragment {
    FragmentCreateTaskBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreateTaskBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initClickers();
    }

    private void initClickers() {
        binding.applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendText();
            }
        });
    }

    private void sendText() {
        String text = binding.edTask.getText().toString();
        String number = binding.etNumber.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("key", text);
        bundle.putString("A", number);
        Navigation.findNavController(requireView()).navigate(R.id.homeFragment, bundle);

    }

}
