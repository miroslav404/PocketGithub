package com.trollologic.pocketgithub.base;

import android.app.Fragment;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.FragmentProfileBinding;
import com.trollologic.pocketgithub.databinding.FragmentRepoWebviewBinding;

/**
 * Created by miroslav on 08.02.17..
 */

public class UserProfileFragment extends Fragment {

    private static final String TAG = UserProfileFragment.class.getSimpleName();
    private static final String URL_KEY = "URL";
    private OnFragmentInteractionListener mListener;
    FragmentProfileBinding binding;

    public static UserProfileFragment newInstance(String url){
        UserProfileFragment fragment = new UserProfileFragment();
        Bundle args = new Bundle();
        args.putString(URL_KEY,url);
        fragment.setArguments(args);
        return fragment;
    }

    public static String getFragmentTag(){
        return TAG;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
        WebSettings webSettings = binding.webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        binding.webview.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {

                if(progress == 100) {
                    binding.loginProgress.setVisibility(View.GONE);
                }
            }
        });
        binding.webview.loadUrl(getArguments().getString(URL_KEY));

        return binding.getRoot();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
