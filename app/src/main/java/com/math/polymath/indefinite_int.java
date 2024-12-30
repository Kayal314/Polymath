package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link indefinite_int#newInstance} factory method to
 * create an instance of this fragment.
 */
public class indefinite_int extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public indefinite_int() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment indefinite_int.
     */
    // TODO: Rename and change types and number of parameters
    public static indefinite_int newInstance(String param1, String param2) {
        indefinite_int fragment = new indefinite_int();
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
        return inflater.inflate(R.layout.fragment_indefinite_int, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("Integration: Assume F(x) is a function which satisfies $$\\frac{d}{dx}F(x)=f(x)$$ and C is an arbitrary constant then $$\\int f(x) dx=F(x)+C$$ Suppose we want to evaluate $$\\int f(g(x)).dx$$ and suppose g is differentiable and we substitute $$u=g(x)$$ Hence we get $$dx=\\frac{du}{u’}$$ Then we can substitute this in to get $$\\int \\frac{f(u)}{u'} du$$ Properties of integrals: It is a linear operator, meaning:  $$\\int (m\\cdot f(x)+n\\cdot g(x)) dx$$ $$=m\\int f(x)dx+n\\int g(x)dx$$ Some Useful Results: $$\\int e^{ax+b}=\\frac{e^{ax+b}}{a}+C$$ $$\\int \\cos(ax+b)dx=\\frac{\\sin(ax+b)}{a}+C$$ $$\\int \\sin(ax+b)=\\frac{-cos(ax+b)}{a}+C$$ $$\\int cosec^2(ax+b) dx=\\frac{-cot(ax+b)}{a}+C$$ $$\\int sec^2(ax+b) dx=\\frac{\\tan(ax+b)}{a}+C$$ $$\\int \\sec(x) dx$$ $$=\\ln{|sec(x)+tan(x)|}+C$$ $$=\\ln{|\\tan{\\frac{\\pi}{4}+\\frac{x}{2}}|}$$ $$\\int cosec(x) dx$$ $$=ln(|cosec(x)-cot(x)|)+C$$ $$=\\ln{|\\tan{\\frac{x}{2}}|}$$ $$\\int\\tan{x}dx=\\ln{|\\sec{x}|}+c$$ $$\\int\\cot{x}dx=\\ln{|\\sin{x}|}+c$$ $$\\int \\frac{dx}{\\sqrt{a^2-x^2}}=sin^{-1} \\frac{x}{a}+C$$ $$\\int \\frac{dx}{a^2-x^2}=\\frac{1}{2a}\\ln{\\frac{a+x}{a-x}}+C$$ $$\\int \\frac{dx}{\\sqrt{x^2-a^2}}=ln(x+\\sqrt{x^2-a^2})+C$$ $$\\int \\frac{dx}{x.\\sqrt{x^2-a^2}}=\\frac{1}{a} sec^{-1}\\frac{x}{a}+C$$ $$ int \\frac{dx}{x^2+a^2}=\\frac{1}{a} \\tan^{-1} \\frac{x}{a}+C$$ $$\\int\\frac{dx}{\\sqrt{x^2+a^2}}$$ $$=ln(x+\\sqrt{x^2+a^2})+C$$ Some Special Substitutions: For the integral $$\\int\\frac{dx}{(lx+m)\\sqrt{ax+b}}$$ Substitute $$ax+b=u^2$$ For the integral $$\\int\\frac{dx}{(lx+m)\\sqrt{ax^2+bx+c}}$$ Substitute $$lx+m=\\frac{1}{u}$$ For the integral $$\\int\\frac{dx}{(lx^2+m)\\sqrt{ax^2+b}}$$ Substitute $$\\sqrt{ax^2+b}=xu$$ For the integral $$\\int\\frac{dx}{(x-a)^m(x-b)^n}$$ Substitute $$x-a=u(x-b)$$ For the integral (n is odd) $$\\int\\sin^{n}{x}dx$$ Substitute $$\\cos{x}=u$$ For the integral (n is odd)$$\\int\\cos^{n}{x}dx$$ Substitute $$\\sin{x}=u$$ Integration by Parts: If u and v are differentiable functions of x, from the product rule we have, $$(u(x).v(x))'=u'(x).v(x)+v'(x).u(x)$$ Multiplying both sides by dx and integrating we have, $$ u(x).v(x)-\\int u'(x).v(x).dx$$ $$=\\int u(x). v'(x)$$ Hence, $$\\int(f\\cdot g)dx$$ $$=f\\int gdx-\\int[\\frac{df}{dx}\\int gdx]dx$$ A general rule followed while assigning functions to the first function or u(x) is the ILATE rule (Inverse, Logarithmic, Algebraic, Trigonometry, Exponential)$$$$ Integration of Rational Functions: While integrating functions of the form $$\\frac{P(x)}{Q(x)}$$ the following partial fraction transformations can be useful: $$\\frac{px^2+qx+r}{(x-a)(x-b)(x-c)}$$ $$=\\frac{A}{x-a}+\\frac{B}{x-b}+\\frac{C}{x-c}$$ $$\\frac{px^2+qx+r}{(x-a)^2(x-b)}$$ $$=\\frac{A}{x-a}+\\frac{B}{(x-a)^2}+\\frac{C}{x-b}$$ $$\\frac{px^2+qx+r}{(x-a)(x^2+bx+c)}$$ $$=\\frac{A}{x-a}+\\frac{Bx+C}{x^2+bx+c}$$ $$\\frac{f(x) }{(x-a)(x^2+bx+c)^2}$$ $$=\\frac{A}{x-a}+\\frac{Bx+C}{x^2+bx+c}+\\frac{Dx+E}{(x^2+bx+c)^2}$$ where f(x) is a polynomial of degree<5. $$$$ Some standard integrals: $$\\int e^{ax}\\sin{(bx)}dx$$ $$=\\frac{e^{ax}}{a^2+b^2}(a\\sin{bx}-b\\cos{bx})+k$$ $$=\\frac{e^{ax}}{\\sqrt{a^2+b^2}}\\sin{(bx-\\tan^{-1}{\\frac{b}{a}})}+k$$  $$\\int e^{ax}\\cos{(bx)}dx$$ $$=\\frac{e^{ax}}{a^2+b^2}(a\\cos{bx}+b\\sin{bx})+k$$ $$=\\frac{e^{ax}}{\\sqrt{a^2+b^2}}\\cos{(bx-\\tan^{-1}{\\frac{b}{a}})}+k$$ $$\\int \\sqrt{a^2-x^2}dx$$ $$=\\frac{x\\sqrt{a^2-x^2}}{2}+\\frac{a^2sin^{-1} \\frac{x}{a}}{2}+C$$ $$\\int\\sqrt{a^2+x^2}dx$$ $$=\\frac{x\\sqrt{x^2+a^2}}{2}+\\frac{a^2}{2}ln(x+\\sqrt{x^2+a^2})+C$$ $$\\int\\sqrt{x^2-a^2}dx$$ $$=\\frac{x\\sqrt{x^2- a^2}}{2}+\\frac{a^2}{2}ln(x+\\sqrt{x^2-a^2})+C$$ $$\\int e^x(f(x)+f'(x))dx=e^x.f(x)+C$$ $$\\int(f(x)+xf'(x))dx=xf(x)+C$$ $$...$$");
    }
}