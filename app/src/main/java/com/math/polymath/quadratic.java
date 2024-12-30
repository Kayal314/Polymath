package com.math.polymath;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link quadratic#newInstance} factory method to
 * create an instance of this fragment.
 */
public class quadratic extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public quadratic() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment quadratic.
     */
    // TODO: Rename and change types and number of parameters
    public static quadratic newInstance(String param1, String param2) {
        quadratic fragment = new quadratic();
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
        return inflater.inflate(R.layout.fragment_quadratic, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("A quadratic equation is any equation that can be rearranged in standard form as: $$ax^2+bx+c=0$$ The roots of the such a quadratic equation are given as $$x={-b\\pm\\sqrt{b^2-4ac}\\over 2a}$$  Here, $$D={b^2-4ac}$$ D is called the discriminant of the quadratic equation. Let \\(\\alpha\\) and \\(\\beta\\) be the two roots of the equation. $$D>0\\implies \\alpha\\neq \\beta \\text{ ; }\\alpha,\\beta\\in\\mathbb{R}$$ $$D=0\\implies \\alpha=\\beta \\text{ ; }\\alpha,\\beta\\in\\mathbb{R}$$ $$D<0\\implies \\alpha\\neq \\beta \\text{ ; }\\alpha,\\beta\\in\\mathbb{C}$$ The sum and product of the two roots are given as $$\\alpha+\\beta=-\\frac{b}{a}$$ $$\\alpha\\cdot\\beta=\\frac{c}{a}$$ Let the coefficient of the equation be real: $$a,b,c\\in\\mathbb{R}$$ Then the imaginary roots occur in conjugate pairs: $$\\alpha=p+qi\\implies\\beta=p-qi$$ Further, let $$a,b,c\\in\\mathbb{Q}$$ Then irrational roots occur in conjugate pairs $$\\alpha=p+\\sqrt{q}\\implies\\beta=p-\\sqrt{q}$$ $$\\alpha=p-\\sqrt{q}\\implies\\beta=p+\\sqrt{q}$$ Consider two equations: $$a_1x^2+b_1x+c_1=0$$ $$a_2x^2+b_2x+c_2=0$$ The two equations have one common root if  $$\\frac{b_1c_2-b_2c_1}{c_1a_2-c_2a_1}=\\frac{c_1a_2-c_2a_1}{a_1b_2-a_2b_1}$$ The two equations have two common roots if $$\\frac{a_1}{a_2}=\\frac{b_1}{b_2}=\\frac{c_1}{c_2}$$ Let $$y=ax^2+bx+c$$ The maximum value attained by y is at: $$x=-\\frac{b}{2a}$$ The graph of a quadratic function \\( y=ax^2+bx+c \\) is always a parabola. If the curve simply touches the X-axis then \\(D=0\\). If it intersects the X-axis at two points then \\(D>0\\). If it does not touch the X-axis then \\(D<0\\) $$...$$");
    }
}