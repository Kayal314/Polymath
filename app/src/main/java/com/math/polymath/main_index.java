package com.math.polymath;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link main_index#newInstance} factory method to
 * create an instance of this fragment.
 */
public class main_index extends Fragment {
    private InterstitialAd mInterstitialAd;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ImageButton about_app_btn;
    Button about_us_btn, contact_btn;
    NavController navController;
    Button t1, t2, t3, t4, t5, t6, t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public main_index() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment main_index.
     */
    // TODO: Rename and change types and number of parameters
    public static main_index newInstance(String param1, String param2) {
        main_index fragment = new main_index();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MobileAds.initialize(requireContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(requireContext(),"ca-app-pub-8017302455921827/3239031227", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdShowedFullScreenContent() {
                                mInterstitialAd = null;
                            }
                        });
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });

        about_app_btn=view.findViewById(R.id.about_app_btn);
        about_us_btn=view.findViewById(R.id.about_us_btn);
        contact_btn=view.findViewById(R.id.contact_btn);
        navController= Navigation.findNavController(view);
        about_app_btn.setOnClickListener(view117 -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(requireActivity());
            }
            navController.navigate(R.id.action_main_index_to_about_app);
        });
        about_us_btn.setOnClickListener(view1 ->{
            if (mInterstitialAd != null) {
                mInterstitialAd.show(requireActivity());
            }
            navController.navigate(R.id.action_main_index_to_about_us);});
        contact_btn.setOnClickListener(viewc -> {
            if (mInterstitialAd != null) {
                mInterstitialAd.show(requireActivity());
            }
            navController.navigate(R.id.action_main_index_to_contact_us);});
        t1=view.findViewById(R.id.t1);
        t2=view.findViewById(R.id.t2);
        t3=view.findViewById(R.id.t3);
        t4=view.findViewById(R.id.t4);
        t5=view.findViewById(R.id.t5);
        t6=view.findViewById(R.id.t6);
        t7=view.findViewById(R.id.t7);
        t8=view.findViewById(R.id.t8);
        t9=view.findViewById(R.id.t9);
        t10=view.findViewById(R.id.t10);
        t11=view.findViewById(R.id.t11);
        t12=view.findViewById(R.id.t12);
        t13=view.findViewById(R.id.t13);
        t14=view.findViewById(R.id.t14);
        t15=view.findViewById(R.id.t15);
        t16=view.findViewById(R.id.t16);
        t17=view.findViewById(R.id.t17);
        t18=view.findViewById(R.id.t18);
        t19=view.findViewById(R.id.t19);
        t20=view.findViewById(R.id.t20);
        t1.setOnClickListener(view11 -> navController.navigate(R.id.action_main_index_to_integration));
        t2.setOnClickListener(view12 -> navController.navigate(R.id.action_main_index_to_derivatives));
        t3.setOnClickListener(view13 -> navController.navigate(R.id.action_main_index_to_inverse_trig));
        t4.setOnClickListener(view14 -> navController.navigate(R.id.action_main_index_to_quadratic));
        t5.setOnClickListener(view15 -> navController.navigate(R.id.action_main_index_to_limits));
        t6.setOnClickListener(view16 -> navController.navigate(R.id.action_main_index_to_trig));
        t7.setOnClickListener(view17 -> navController.navigate(R.id.action_main_index_to_circle));
        t8.setOnClickListener(view18 -> navController.navigate(R.id.action_main_index_to_str_line));
        t9.setOnClickListener(view19 -> navController.navigate(R.id.action_main_index_to_laplace));
        t10.setOnClickListener(view110 -> navController.navigate(R.id.action_main_index_to_apgp));
        t11.setOnClickListener(view111 -> navController.navigate(R.id.action_main_index_to_indefinite_int));
        t12.setOnClickListener(view112 -> navController.navigate(R.id.action_main_index_to_strlinethreed));
        t13.setOnClickListener(view113-> navController.navigate(R.id.action_main_index_to_triangles));
        t14.setOnClickListener(view114-> navController.navigate(R.id.action_main_index_to_combinations));
        t15.setOnClickListener(view115-> navController.navigate(R.id.action_main_index_to_boolean_alg));
        t16.setOnClickListener(view116-> navController.navigate(R.id.action_main_index_to_ellipse));
        t17.setOnClickListener(view115-> navController.navigate(R.id.action_main_index_to_parabola));
        t18.setOnClickListener(view116-> navController.navigate(R.id.action_main_index_to_hyperbola));
        t19.setOnClickListener(view116-> navController.navigate(R.id.action_main_index_to_probability));
        t20.setOnClickListener(view116-> navController.navigate(R.id.action_main_index_to_variation));
    }

    @Override
    public void onPause() {
        super.onPause();
        about_app_btn.setEnabled(false);
        about_us_btn.setEnabled(false);
        contact_btn.setEnabled(false);
        t1.setEnabled(false);t2.setEnabled(false);t3.setEnabled(false);t4.setEnabled(false);t5.setEnabled(false);
        t6.setEnabled(false); t7.setEnabled(false);t8.setEnabled(false);t9.setEnabled(false);t10.setEnabled(false);
        t11.setEnabled(false); t12.setEnabled(false); t13.setEnabled(false); t14.setEnabled(false); t15.setEnabled(false); t16.setEnabled(false);
        t17.setEnabled(false); t18.setEnabled(false); t19.setEnabled(false); t20.setEnabled(false);
    }
    @Override
    public void onResume() {
        super.onResume();
        about_app_btn.setEnabled(true);
        about_us_btn.setEnabled(true);
        contact_btn.setEnabled(true);
        t1.setEnabled(true);t2.setEnabled(true);t3.setEnabled(true);t4.setEnabled(true);t5.setEnabled(true);
        t6.setEnabled(true); t7.setEnabled(true);t8.setEnabled(true);t9.setEnabled(true);t10.setEnabled(true);
        t11.setEnabled(true); t12.setEnabled(true); t13.setEnabled(true); t14.setEnabled(true); t15.setEnabled(true);t16.setEnabled(true);
        t17.setEnabled(true); t18.setEnabled(true);t19.setEnabled(true); t20.setEnabled(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_index, container, false);
    }

}