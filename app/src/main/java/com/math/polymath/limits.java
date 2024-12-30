package com.math.polymath;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link limits#newInstance} factory method to
 * create an instance of this fragment.
 */
public class limits extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public limits() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment limits.
     */
    // TODO: Rename and change types and number of parameters
    public static limits newInstance(String param1, String param2) {
        limits fragment = new limits();
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
        return inflater.inflate(R.layout.fragment_limits, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView f=requireView().findViewById(R.id.formula_space);
        f.setText("Theory: Let f(x) be defined in an open interval about 'a' except possibly at ‘a’ itself. If f(x) gets arbitrarily close to a finite number L for all x ‘sufficiently’ close to 'a', we say that f(x) approaches the limit L as x approaches 'a' and we write: $$ \\lim\\limits_{x \\to a} f(x)=L$$ An alternate definition of limits: $$\\lim\\limits_{x \\to a} f(x)=L \\iff \\forall \\epsilon>0, \\exists \\delta>0 $$ $$\\text{ s.t } 0<|x-a|<\\delta $$ $$\\to |f(x)-L|<\\epsilon$$ The right hand limit is denoted as: $$\\lim\\limits_{x \\to a^+} f(x)$$ The left hand limit is denoted as: $$\\lim\\limits_{x \\to a^-} f(x)$$ Limit of a function f(x) is said to exist at x = a iff $$\\lim\\limits_{x \\to a^+}f(x) =\\lim\\limits_{x \\to a^-}f(x)=L$$Properties of Limits: Consider the two limits $$\\lim\\limits_{x \\to a}(f(x))=m$$ $$\\lim\\limits_{x \\to a}(g(x))=n$$ where m and n are finite real values, then $$\\lim_{x \\to a} {(f(x)+g(x))}=l+m$$ $$\\lim_{x \\to a} f(x).g(x)=l.m$$ $$\\lim_{ x \\to a} c.f(x)=c. \\lim_{ x \\to a}f(x)$$ $$\\lim_{ x \\to a} \\frac{f(x)}{g(x)}=\\frac{l}{m} \\text{ iff } m \\neq 0$$ Important Formulas: $$\\lim\\limits_{ x \\to a} \\frac{x^n-a^n}{x-a}=n.a^{n-1}$$ $$\\lim _{x \\to 0} \\frac{\\sin x}{x}=1$$ $$\\lim_{ x \\to 0} \\frac{\\tan x}{x}=1$$ $$\\lim\\limits_{x \\to 0} \\frac{\\tan^{-1}{x}}{x}=1$$ $$\\lim_{ x \\to 0} \\frac{\\sin^{-1}{x}}{x}=1$$ $$\\lim\\limits_{ x \\to 0} \\frac{a^x-1}{x}=ln(a)$$ $$\\lim\\limits_{ x \\to 0} \\frac{e^x-1}{x}=1$$ $$ \\lim\\limits_{ x \\to 0} (1+x)^{\\frac{1}{x}}=e$$ $$\\lim\\limits_{x \\to 1} \\frac{\\ln(x)}{x-1}=1$$ Some useful Maclaurin  expansions: $$\\frac{1}{1-x}=\\sum_{k=0}^{\\infty}x^n\\text{ ; }|x|<1$$ $$ln(1+x)=\\sum_{k=1}^{\\infty}\\frac{(-1)^{k+1}.x^k}{k}$$ $$e^x=\\sum_{k=0}^{\\infty} \\frac{x^k}{k!}$$ $$a^x=\\sum_{k=0}^{\\infty} \\frac{(x.ln(a))^k}{k!}$$ $$sin(x)=\\sum_{k=0}^{\\infty}\\frac{(-1)^{k}.x^{(2k+1)}}{(2k+1)!}$$ $$cos(x)=\\sum_{k=0}^{\\infty} \\frac{(-1)^k.x^{(2k)}}{(2k)!}$$ $$\\tan^{-1}{x}=\\sum_{k=0}^{\\infty}\\frac{(-1)^{k}.x^{(2k+1)}}{(2k+1)}\\text{ ; }|x|\\leq 1$$ $$...$$");
    }
}