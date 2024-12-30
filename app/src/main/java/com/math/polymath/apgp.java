package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link apgp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class apgp extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public apgp() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment apgp.
     */
    // TODO: Rename and change types and number of parameters
    public static apgp newInstance(String param1, String param2) {
        apgp fragment = new apgp();
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
        return inflater.inflate(R.layout.fragment_apgp, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Arithmetic Progression: An arithmetic progression is a sequence of numbers \\((a_k)_{k=1}^{k=n}\\) such that: $$a_{k+1}-a_{k}=d\\text{ ; } 1\\leq k < n, k \\in \\mathbb{N}$$ Here, \\(d\\) is called the common difference. The \\(n^{th}\\) term of an arithmetic progression is given by: $$a_n=a_1+(n-1)d$$ Let S denote the sum of the first n terms of an arithmetic progression. $$S=\\frac{n}{2}(a_1+a_n)$$ $$S=\\frac{n}{2}[2a_1+(n-1)d]$$ The standard deviation of the first n terms of an AP is given as $$\\sigma=|d|\\sqrt{\\frac{(n+1)(n-1}{12}}$$ Properties of an Arithmetic Progression: Consider the following AP: $$(a,a+d,a+2d,…)$$ The new sequence obtained by adding a constant k to each term is still an AP: $$(a+k,a+k+d,a+k+2d,…)$$ Here the common difference is $$(a+k+d)-(a+k)=d$$ The new sequence obtained by multiplying each term of the sequence by a non-zero constant k is still an AP: $$(ak,ak+dk,ak+2dk,…)$$ Here common difference is $$(ak+dk)-(ak)=dk$$ A few important sums: $$\\sum_{i=1}^{i=n}i=\\frac{n}{2}(n+1)$$ $$\\sum_{i=1}^{i=n}i^2=\\frac{1}{6}(n)(n+1)(2n+1)$$ $$\\sum_{i=1}^{i=n}i^3=[\\frac{n}{2}(n+1)]^2$$ $$\\sum_{i=1}^{n}(2i-1)=n^2$$ Geometric Progression: A geometric progression is a sequence of numbers \\((a_k)_{k=1}^{k=n}\\) such that: $$\\frac{a_{k+1}}{a_{k}}=r\\text{ ; } 1\\leq k < n, k \\in \\mathbb{N}$$ Here \\(r\\) is called the common ratio. The \\(n^{th}\\) term of a geometric progression is given by: $$a_n=a_1r^{n-1}$$ Let S denote the sum of the first n terms of a geometric progression. $$S=a_1\\frac{r^n-1}{r-1}\\text{ ; }r\\neq 1$$ For an infinite GP where  |r| < 1, the sum of the infinite series is given by: $$S_{\\infty}=\\frac{a_1}{r-1}\\text{ ; }|r|<1$$ The product of the first \\((n + 1)\\) terms of a GP is given by: $$\\prod_{i=0}^{n}ar^{i}=(\\sqrt{a^2r^{n}})^{n+1}$$ Properties of a Geometric Progression: Consider the following GP: $$(a,ar,ar^2,…)$$ The new sequence obtained by multiplying each term of the sequence by a non-zero constant k is still a GP: $$(ak,akr,akr^2,…)$$ Here the common ratio remains the same: $$\\frac{akr}{ak}=r$$ Arithmetic Mean: If (a, b, c) is an arithmetic progression, then b is the arithmetic mean of a and c, that is: $$b=\\frac{a+c}{2}$$ Geometric Mean: If (a, b, c) is a geometric progression then b is the geometric mean of a and c, that is $$b=\\sqrt{ac}$$ Harmonic Mean: If (a, b, c) is a harmonic progression then b is the harmonic mean of a and c, that is: $$b=\\frac{2ac}{a+c}$$ Relation between AM, GM, and HM: $$GM^2=AM\\cdot HM$$ $$...$$");
    }
}