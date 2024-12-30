package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link variation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class variation extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public variation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment variation.
     */
    // TODO: Rename and change types and number of parameters
    public static variation newInstance(String param1, String param2) {
        variation fragment = new variation();
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
        return inflater.inflate(R.layout.fragment_variation, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        MathView f = requireView().findViewById(R.id.formula_space);
        f.setText("Consider the functional: $$S[y]=\\int_{x_1}^{x_2}L(x,y(x),y’(x))dx$$ where \\(x_1\\) and \\(x_2\\) are constants, y(x) is continuously differentiable twice, y’(x) is the derivative of y with respect to x, and L is continuously differentiable twice with respect to its parameters x, y and y’. According to the Euler-Lagrange equation, S has an extremum if and only if, $$\\frac{\\partial L}{\\partial y}-\\frac{d}{dx}\\left(\\frac{\\partial L}{\\partial y’}\\right)=0$$ Beltrami’s identity: In certain cases, L is not explicitly dependent on x, i.e. $$\\frac{\\partial L}{\\partial x}=0$$ In such a case, the Euler-Lagrange equation can be simplified to the following (C is a constant): $$L-y’\\frac{\\partial L}{\\partial y’}=C$$ The Euler-Poisson equation: Let S be a functional which depends on the higher derivatives of y(x) too, i.e. $$S=\\int_{a}^{b}L(x,y(x),y’(x),…y^{(n)}(x))dx$$ then, S has an extremum if and only if $$\\frac{\\partial L}{\\partial y}-\\frac{d}{dx}\\left(\\frac{\\partial L}{\\partial y’}\\right)+$$ $$…+(-1)^{n}\\frac{d^n}{dx^n}\\left(\\frac{\\partial L}{\\partial y^{(n)}}\\right)=0$$ $$...$$");
    }
}