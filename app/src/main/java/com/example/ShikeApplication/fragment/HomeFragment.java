package com.example.ShikeApplication.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ShikeApplication.R;
import com.example.ShikeApplication.ndkdemo.ndktool;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeFragment extends Fragment {

    private static HomeFragment homeFragment;
    @BindView(R.id.fagment_native_demo_text)
    TextView textView;
    Unbinder unbinder;

    private void HomeFragment() {
    }

    public static HomeFragment getInstance(){
        if(homeFragment == null){
            synchronized (HomeFragment.class){
                if(homeFragment == null){
                    homeFragment = new HomeFragment();
                }
            }
        }
        return homeFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_home,container,false);
        View view = inflater.inflate(R.layout.fragment_native_demo,container,false);
        unbinder =  ButterKnife.bind(this,view);
        textView.setText(ndktool.getSomeDumpTextFromNDK() + "\n"+ndktool.getNativeLibraryVersion());
        Toast.makeText(this.getContext(),ndktool.getNativeCompileVersion(),Toast.LENGTH_LONG).show();
        return view;
    }

    @Override
    public void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    //[08/10/19 sk] native jni demo
//    @OnClick({R.id.button_ok , R.id.button_cancel})
//    public void onViewClicked(@Nullable View view) {
//        switch (view.getId()) {
//            case R.id.button_ok:
//                surfaceView.doTakePhotoPath();
//                break;
//        }
//    }

}
