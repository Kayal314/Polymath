package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link laplace#newInstance} factory method to
 * create an instance of this fragment.
 */
public class laplace extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public laplace() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment laplace.
     */
    // TODO: Rename and change types and number of parameters
    public static laplace newInstance(String param1, String param2) {
        laplace fragment = new laplace();
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
        return inflater.inflate(R.layout.fragment_laplace, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Let f be a real function of t. The Laplace Transform is an integral transform that converts the function to a function of s. It is defined as $$\\mathcal{L}\\{f(t)\\}=\\int_{0}^{\\infty}f(t)e^{-st}dt$$ Some common Laplace Transforms are given below. The following is the notation used: $$F(s)=\\mathcal{L}\\{f(t)\\}$$ 1. \\(f(t)=1\\) $$F(s)=\\frac{1}{s} \\text{ , }s>0$$ 2. \\(f(t)=e^{at}\\) $$F(s)=\\frac{1}{s-a} \\text{ , }s>a$$ 3. \\(f(t)=t^n\\) $$F(s)=\\frac{n!}{s^{n+1}} \\text{ , }s>0$$ 4. \\(f(t)=\\sin{(at)}\\) $$F(s)=\\frac{a}{s^2+a^2} \\text{ , }s>0$$ 5. \\(f(t)=\\cos{(at)}\\) $$F(s)=\\frac{s}{s^2+a^2} \\text{ , }s>0$$ 6. \\(f(t)=\\sinh{(at)}\\) $$F(s)=\\frac{a}{s^2-a^2} \\text{ , }s>|a|$$ 7. \\(f(t)=\\cosh{(at)}\\) $$F(s)=\\frac{s}{s^2-a^2} \\text{ , }s>|a|$$ 8. \\(f(t)=t^ne^{at}\\) $$F(s)=\\frac{n!}{(s-a)^{n+1}} \\text{ , }s>a$$ 9. \\(f(t)=e^{at}\\sin{(bt)}\\) $$F(s)=\\frac{b}{(s-a)^2+b^2} \\text{ , }s>a$$ 10. \\(f(t)=e^{at}\\cos{(bt)}\\) $$F(s)=\\frac{s-a}{(s-a)^2+b^2} \\text{ , }s>a$$ 11. \\(f(t)=e^{at}\\sinh{(bt)}\\) $$F(s)=\\frac{b}{(s-a)^2-b^2} \\text{ , }s-a>|b|$$ 12. \\(f(t)=e^{at}\\cosh{(bt)}\\) $$F(s)=\\frac{s-a}{(s-a)^2-b^2} \\text{ , }s-a>|b|$$ 13. \\(f’(t)\\) $$\\mathcal{L}\\{f’(t)\\}=sF(s)-f(0)$$ 14. \\(f’’(t)\\) $$\\mathcal{L}\\{f’’(t)\\}=s^2F(s)-sf(0)-f’(0)$$ 15. \\(f^{(n)}(t)\\) $$\\mathcal{L}\\{f^{(n)}(t)\\}$$ $$=s^nF(s)-\\sum_{k=1}^{n}s^{n-k}f^{(k-1)}(0)$$ $$...$$");
    }
}