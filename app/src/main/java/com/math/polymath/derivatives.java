package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link derivatives#newInstance} factory method to
 * create an instance of this fragment.
 */
public class derivatives extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public derivatives() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment derivatives.
     */
    // TODO: Rename and change types and number of parameters
    public static derivatives newInstance(String param1, String param2) {
        derivatives fragment = new derivatives();
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
        return inflater.inflate(R.layout.fragment_derivatives, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Definitions: Given a function y=f(x), the derivative of the function at x (provided the limit exists) is $$\\frac{dy}{dx}=\\lim\\limits_{h \\to 0}\\frac{f(x+h)-f(x)}{h}$$ The right hand derivative of the function y = f(x) at the point x = a is given as $$Rf’(a)=\\lim\\limits_{h \\to 0^+}\\frac{f(a+h)-f(a)}{h}$$ The left hand derivative of the function y = f(x) at the point x = a is given as $$Lf’(a)=\\lim\\limits_{h \\to 0^-}\\frac{f(a+h)-f(a)}{h}$$ The derivative of y = f(x) exists at x = a iff Rf’(a) and Lf’(a) both exist and are equal to each other. Derivatives are linear operators, meaning $$\\frac{d}{dx}(m \\cdot f(x)+n \\cdot g(x))$$ $$=m\\cdot \\frac{df}{dx}+ n\\cdot \\frac{dg}{dx}$$ Important Formulas: $$\\frac{d}{dx}(x^n)=nx^{n-1}$$ $$\\frac{d}{dx}(\\sin{x})=\\cos{x}$$ $$\\frac{d}{dx}(\\cos{x})=-\\sin{x}$$ $$\\frac{d}{dx}(\\tan{x})=\\sec^2{x}$$ $$\\frac{d}{dx}(\\cot{x})=-cosec^2{x}$$ $$\\frac{d}{dx}(\\sec{x})=\\sec{x}\\tan{x}$$ $$\\frac{d}{dx}(\\csc{x})=-\\csc{x}\\cot{x}$$ $$\\frac{d}{dx}(e^x)=e^x$$ $$\\frac{d}{dx}(a^x)=a^x\\ln{a}$$ $$\\frac{d}{dx}(\\ln{x})=\\frac{1}{x} \\text{ }(x \\neq 0)$$ $$\\frac{d}{dx}(\\sin^{-1}{x})=\\frac{1}{\\sqrt{1-x^2}}\\text{ }(|x|<1)$$ $$\\frac{d}{dx}(\\cos^{-1}{x})=-\\frac{1}{\\sqrt{1-x^2}}\\text{ }(|x|<1)$$ $$\\frac{d}{dx}(\\tan^{-1}{x})=\\frac{1}{1+x^2}\\text{ }(x \\in \\mathbb{R})$$ $$\\frac{d}{dx}(\\cot^{-1}{x})=-\\frac{1}{1+x^2}\\text{ }(x \\in \\mathbb{R})$$ $$\\frac{d}{dx}(\\sec^{-1}{x})=\\frac{1}{x\\sqrt{x^2-1}}\\text{ }(|x|>1)$$ $$\\frac{d}{dx}(\\csc^{-1}{x})=-\\frac{1}{x\\sqrt{x^2-1}}\\text{ }(|x|>1)$$ The product rule: $$\\frac{d}{dx}(uv)=u\\frac{dv}{dx}+v\\frac{du}{dx}$$ The quotient rule: $$\\frac{d}{dx}(\\frac{u}{v})=\\frac{v\\frac{du}{dx}-u\\frac{dv}{dx}}{v^2}$$ The chain rule: Let u(x) be any function which is differentiable in the interval [a, b] and its range is [p, q]. Also, Let y(u) be a function which is differentiable in [p, q]. Then, $$\\frac{dy}{dx}=\\frac{dy}{du} \\cdot \\frac{du}{dx}$$ $$...$$");
    }
}