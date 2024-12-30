package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link integration#newInstance} factory method to
 * create an instance of this fragment.
 */
public class integration extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public integration() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment integration.
     */
    // TODO: Rename and change types and number of parameters
    public static integration newInstance(String param1, String param2) {
        integration fragment = new integration();
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
        return inflater.inflate(R.layout.fragment_integration, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("Fundamental Theorem of Calculus: This Theorem gives the precise relation between the integral and the derivative. This relation was used as the basis by Newton and Leibnitz to develop Calculus. If f is continuous on [a,b] then g defined by $$g(x)=\\int_{a}^{b} f(t).dt$$ for x in [a,b] is continuous and differentiable on [a,b] and $$ g'(x)=f(x)$$ Now suppose if f is continuous on [a,b] and we have a function F which satisfies F'=f (any anti-derivative of f) then: $$\\int_{a}^{b} f(x)dx=F(b)-F(a)$$ Some Nice Properties: $$\\int_{a}^{b}f(x)dx=-\\int_{b}^{a}f(x) dx$$ If c lies in [a,b] then $$\\int_{a}^{b} f(x)dx=\\int_{a}^{c}f(x)dx +\\int_{c}^{b} f(x)dx$$ If f(x) is an odd function or if f satisfies \\(f(-x)=-f(x)\\) then $$\\int_{-a}^{a}f(x)dx=0$$ and if f(x) is even i.e. \\(f(x)=f(-x)\\) then $$\\int_{-a}^{a}f(x)dx=2 \\int_{0}^{a}f(x)dx$$ Some other cool properties: $$\\int_{a}^{b}f(x)dx= \\int_{a}^{b}f(a+b-x)dx$$ $$\\int_{0}^{b}f(x)dx=\\int_{0}^{b}f(b-x)dx$$ Some useful properties of Integrals of Periodic Functions: Suppose the function has a period T or \\(f(x+T)=f(x)\\) and n is an integer; intuitively it makes sense that $$\\int_{a}^{nT}f(x)dx=n. \\int_{a}^{T}f(x)dx$$ Let a and b be integers. $$\\int_{a}^{a+T}f(x)dx=\\int_{0}^{T}f(x)dx$$ $$\\int_{aT}^{bT}f(x)dx=(b-a) \\int_{0}^{T}f(x)dx$$  Walli's Product: If n is even $$\\int_{0}^{\\pi/2} \\sin(x)dx$$ $$=\\int_{0}^{\\pi/2}\\cos^n (x)dx$$ $$=\\frac{\\prod_{k=1}^{\\frac{n-1}{2}}(n-k)}{ \\prod_{k=0}^{ \\frac{n-1}{2}}(n-k )}.\\frac{\\pi}{2}$$ If n is odd $$\\int_{0}^{\\pi/2} \\sin(x)dx$$ $$=\\int_{0}^{\\pi/2}\\cos^n (x)dx$$ $$=\\frac{\\prod_{k=1}^{\\frac{n-1}{2}}(n-k)}{ \\prod_{k=0}^{ \\frac{n-1}{2}}(n-k )}$$ Integrals are just limiting Sums: $$\\int_{a}^{b}f(x)dx$$ $$=\\lim_{n \\to \\infty} h.\\sum_{r=0}^{n-1}f(a+r.h) $$ where $$h=\\frac{b-a}{n}.$$ The converse is also true: an infinite series of the above form can also be expressed as a definite integral. Example-$$\\lim_{n \\to \\infty} \\sum_{r=1}^{n} \\frac{1}{n}f \\left(\\frac{r}{n}\\right)=\\int_{0}^{1}f(x)dx$$ If \\(f(x)<g(x)\\) for all x in [a,b] then $$\\int_{a}^{b}f(x)dx\\leq\\int_{a}^{b}g(x)dx $$\\abs{\\int_{a}^{b}f(x)dx}\\leq \\int_{a}^{b}\\abs{f(x)}dx$$ Some useful results: $$\\int_{0}^{\\pi/2}ln(\\sin(x))dx=\\int_{0}^{\\pi/2}ln(\\cos(x))dx=-\\pi/2\\ln(2)$$ $$\\int_{0}^{\\pi/2}ln(\\tan(x))dx=\\int_{0}^{\\pi/2}ln(\\cot(x))dx=0$$ $$\\int_{0}^{\\pi/2}ln(\\sec(x))dx=\\int_{0}^{\\pi/2}ln(\\cosec(x))dx=\\pi/2.\\ln(2)$$ $$...$$\"");
    }
}