package com.trollologic.pocketgithub.base;

import android.app.Fragment;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.FragmentWebviewBinding;

/**
 * Created by miroslav on 08.02.17..
 */

public class WebViewFragment extends Fragment {

    private static final String TAG = WebViewFragment.class.getSimpleName();
    private static final String URL_KEY = "URL";
    private OnFragmentInteractionListener mListener;
    private FragmentWebviewBinding binding;

    public static WebViewFragment newInstance(String url){
        WebViewFragment fragment = new WebViewFragment();
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
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_webview, container, false);
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
        mListener.onHiddenChanged(TAG, true);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mListener.onHiddenChanged(TAG, false);
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
