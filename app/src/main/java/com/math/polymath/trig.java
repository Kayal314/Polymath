package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link trig#newInstance} factory method to
 * create an instance of this fragment.
 */
public class trig extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public trig() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment trig.
     */
    // TODO: Rename and change types and number of parameters
    public static trig newInstance(String param1, String param2) {
        trig fragment = new trig();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trig, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Trigonometric Ratios of Compound Angles: $$\\sin{(A+B)}$$ $$=\\sin{A}\\cos{B}+\\cos{A}\\sin{B}$$ $$\\sin{(A-B)}$$ $$=\\sin{A}\\cos{B}-\\cos{A}\\sin{B}$$ $$\\cos{(A+B)}$$ $$=\\cos{A}\\cos{B}-\\sin{A}\\sin{B}$$ $$\\cos{(A-B)}$$ $$=\\cos{A}\\cos{B}+\\sin{A}\\sin{B}$$ $$\\sin{(A+B)}\\sin{(A-B)}$$ $$=\\sin^{2}{A}-\\sin^{2}{B}$$ $$\\sin{(A+B)}\\sin{(A-B)}$$ $$=\\cos^{2}{B}-\\cos^{2}{A}$$ $$\\cos{(A+B)}\\cos{(A-B)}$$ $$=\\cos^{2}{A}-\\sin^{2}{B}$$ $$\\cos{(A+B)}\\cos{(A-B)}$$ $$=\\cos^{2}{B}-\\sin^{2}{A}$$ $$\\tan{(A+B)}=\\frac{\\tan{A}+\\tan{B}}{1-\\tan{A}\\tan{B}}$$ $$\\tan{(A-B)}=\\frac{\\tan{A}-\\tan{B}}{1+\\tan{A}\\tan{B}}$$ $$\\cot{(A+B)}=\\frac{\\cot{A}\\cot{B}-1}{\\cot{B}+\\cot{A}}$$ $$\\cot{(A-B)}=\\frac{\\cot{A}\\cot{B}+1}{\\cot{B}-\\cot{A}}$$ Trigonometric Ratios of Multiples of Angles: $$\\sin{2\\theta}=2\\sin{\\theta}\\cos{\\theta}$$ $$\\cos{2\\theta}=\\cos^{2}{\\theta}-\\sin^{2}{\\theta}$$ $$\\cos{2\\theta}=2\\cos^{2}{\\theta}-1$$ $$\\cos{2\\theta}=1-2\\sin^{2}{\\theta}$$ $$\\tan^{2}{\\theta}=\\frac{1-\\cos{2\\theta}}{1+\\cos{2\\theta}}$$ $$\\sin{2\\theta}=\\frac{2\\tan{\\theta}}{1+\\tan^{2}{\\theta}}$$ $$\\cos{2\\theta}=\\frac{1-\\tan^{2}{\\theta}}{1+\\tan^{2}{\\theta}}$$ $$\\tan{2\\theta}=\\frac{2\\tan{\\theta}}{1-\\tan^{2}{\\theta}}$$ $$\\sin{3\\theta}=3\\sin{\\theta}-4\\sin^{3}{\\theta}$$ $$\\cos{3\\theta}=4\\cos^{3}{\\theta}-3\\cos{\\theta}$$ $$\\tan{3\\theta}=\\frac{3\\tan{\\theta}-\\tan^{3}{\\theta}}{1-3\\tan^{2}{\\theta}}$$ Trigonometric ratios of special angles: $$\\sin{18^{\\circ}}=\\cos{72^{\\circ}}=\\frac{\\sqrt{5}-1}{4}$$ $$\\sin{54^{\\circ}}=\\cos{36^{\\circ}}=\\frac{\\sqrt{5}+1}{4}$$ $$\\sin{36^{\\circ}}=\\cos{54^{\\circ}}=\\frac{\\sqrt{10-2\\sqrt{5}}}{4}$$ $$\\sin{72^{\\circ}}=\\cos{18^{\\circ}}=\\frac{\\sqrt{10+2\\sqrt{5}}}{4}$$ $$...$$");
    }
}