package com.zw.study;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainFragment extends BaseFragment implements View.OnClickListener{
    private Button mErrorButton;
    private static final String TAG = "MainFragment";
    public MainFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated: ");
        requireActivity().findViewById(R.id.error_button).setOnClickListener(this);
        requireActivity().findViewById(R.id.mvvm_button).setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated: ");
        mErrorButton = requireActivity().findViewById(R.id.error_button);
        mErrorButton.setOnClickListener(this);
        requireActivity().findViewById(R.id.mvvm_button).setOnClickListener(this);
        Log.i(TAG, "onActivityCreated:222 ");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.error_button:
                Log.i(TAG, "onClick: ");
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.action_mainFragment_to_errorFragment);
                Log.i(TAG, "onClick: 2");
                break;
            case R.id.mvvm_button:
                break;
            default:
                break;
        }
    }
}
