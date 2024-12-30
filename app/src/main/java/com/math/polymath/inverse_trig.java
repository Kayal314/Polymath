package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link inverse_trig#newInstance} factory method to
 * create an instance of this fragment.
 */
public class inverse_trig extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public inverse_trig() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment inverse_trig.
     */
    // TODO: Rename and change types and number of parameters
    public static inverse_trig newInstance(String param1, String param2) {
        inverse_trig fragment = new inverse_trig();
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
        return inflater.inflate(R.layout.fragment_inverse_trig, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("General relationships between trigonometric functions:$$\\sin{\\sin^{-1}{x}}=\\cos{\\cos^{-1}{x}}$$ $$=\\tan{\\tan^{-1}{x}}=1$$ $$\\sin^{-1}{\\sin{\\theta}}=\\cos^{-1}{\\cos{\\theta}}$$ $$=\\tan^{-1}{\\tan{\\theta}}=\\theta$$ $$\\sin^{-1}{-x}=-\\sin^{-1}{x}$$ $$\\cos^{-1}{-x}=\\pi - \\cos^{-1}{x}$$ $$\\tan^{-1}{-x}=-\\tan^{-1}{x}$$ $$\\cot^{-1}{-x}=\\pi - \\cot^{-1}{x}$$ $$\\csc^{-1}{-x}=-\\csc^{-1}{x}$$ $$\\sec^{-1}{-x}=\\pi - \\sec^{-1}{x}$$ $$\\sin^{-1}{x}=\\csc^{-1}{\\frac{1}{x}}$$ $$\\cos^{-1}{x}=\\sec^{-1}{\\frac{1}{x}}$$ $$\\tan^{-1}{x}=\\cot^{-1}{\\frac{1}{x}}\\text{ }if\\text{ }x>0$$ $$\\tan^{-1}{x}=\\cot^{-1}{\\frac{1}{x}}-\\pi\\text{ }if\\text{ }x<0$$ $$\\sin^{-1}{x}+\\cos^{-1}{x}=\\frac{\\pi}{2}\\text{ }x \\in [-1,1]$$ $$\\tan^{-1}{x}+\\cot^{-1}{x}=\\frac{\\pi}{2}\\text{ }x \\in \\mathbb{R}$$ $$\\sec^{-1}{x}+\\csc^{-1}{x}=\\frac{\\pi}{2}\\text{ }x \\in \\mathbb{R}-(-1,1)$$ Sums of similar inverse trigonometric functions: $$\\tan^{-1}{x}+\\tan^{-1}{y}=\\tan^{-1}{\\frac{x+y}{1-xy}}$$ $$\\tan^{-1}{x}-\\tan^{-1}{y}=\\tan^{-1}{\\frac{x-y}{1+xy}}$$ $$\\sin^{-1}{x}+\\sin^{-1}{y}$$ $$=\\sin^{-1}{(x\\sqrt{1-y^2}+y\\sqrt{1-x^2})}$$ $$\\sin^{-1}{x}-\\sin^{-1}{y}$$ $$=\\sin^{-1}{(x\\sqrt{1-y^2}-y\\sqrt{1-x^2})}$$ $$\\cos^{-1}{x}+\\cos^{-1}{y}$$ $$=cos^{-1}{(xy-\\sqrt{(1-x^2)(1-y^2)})}$$ $$\\cos^{-1}{x}-\\cos^{-1}{y}$$ $$=cos^{-1}{(xy+\\sqrt{(1-x^2)(1-y^2)})}$$ $$\\cot^{-1}{x}+\\cot^{-1}{y}=\\cot^{-1}{\\frac{xy-1}{y+x}}$$ $$\\cot^{-1}{x}-\\cot^{-1}{y}=\\cot^{-1}{\\frac{xy+1}{y-x}}$$ Special cases: $$2\\tan^{-1}{x}=\\sin^{-1}{\\frac{2x}{1+x^2}}$$ $$2\\tan^{-1}{x}=\\cos^{-1}{\\frac{1-x^2}{1+x^2}}$$  $$3\\sin^{-1}{x}=\\sin^{-1}{3x-4x^3}$$ $$3\\cos^{-1}{x}=\\cos^{-1}{4x^3-3x}$$ $$3\\tan^{-1}{x}=\\tan^{-1}{\\frac{3x-x^3}{1-3x^2}}$$ $$...$$");
    }
}