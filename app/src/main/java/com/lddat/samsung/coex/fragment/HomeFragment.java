package com.lddat.samsung.coex.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import com.lddat.samsung.coex.R;

public class HomeFragment extends Fragment {

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ImageView imgShowList = rootView.findViewById(R.id.fragment_home_btn_list);
        SearchView edtSearchCoex = rootView.findViewById(R.id.fragment_home_edt_search);
        return rootView;
    }
}
