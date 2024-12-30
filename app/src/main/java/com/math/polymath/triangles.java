package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link triangles#newInstance} factory method to
 * create an instance of this fragment.
 */
public class triangles extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public triangles() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment triangles.
     */
    // TODO: Rename and change types and number of parameters
    public static triangles newInstance(String param1, String param2) {
        triangles fragment = new triangles();
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
        return inflater.inflate(R.layout.fragment_triangles, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("Consider a triangle \\(\\triangle ABC\\), where the measure of the angles of the triangles at vertices A, B, and C are \\(\\angle A\\), \\(\\angle B\\), and \\(\\angle C\\) respectively. Further assume, the lengths of the sides of the triangle opposite to the angles are \\(a\\), \\(b\\), and \\(c\\) respectively. Let R be the circumradius of \\(\\triangle ABC\\). The sine rule states that: $$\\frac{a}{\\sin{A}}=\\frac{b}{\\sin{B}} =\\frac{c}{\\sin{C}} =2R$$ Alternate form of the sine rule: $$a:b:c=\\sin{A}:\\sin{B}:\\sin{C}$$ The projection rule states that the length of any side of a triangle is equal to the algebraic sum of the projections of the other sides on it. Mathematically, $$a=b\\cos{C}+c\\cos{B}$$  $$b=c\\cos{A}+a\\cos{C}$$  $$c=a\\cos{B}+b\\cos{A}$$ The cosine laws of triangles are equivalent to the geometric interpretation of the addition of vectors. It is mathematically stated as, $$\\cos{A}=\\frac{b^2+c^2-a^2}{2bc}$$ $$\\cos{B}=\\frac{c^2+a^2-b^2}{2ca}$$ $$\\cos{C}=\\frac{a^2+b^2-c^2}{2ab}$$ Combining the sine rule and the cosine rule we can derive, $$\\tan{A}=\\frac{abc}{R}\\cdot\\frac{1}{b^2+c^2-a^2}$$ $$\\tan{B}=\\frac{abc}{R}\\cdot\\frac{1}{c^2+a^2-b^2}$$ $$\\tan{C}=\\frac{abc}{R}\\cdot\\frac{1}{a^2+b^2-c^2}$$ Let s denote the semi-perimeter of \\(\\triangle ABC\\). Mathematically, $$s=\\frac{a+b+c}{2}$$ Relations between sines of angles and the semi-perimeter: $$\\sin{\\frac{A}{2}}=\\sqrt{\\frac{(s-b)(s-c)}{bc}}$$ $$\\sin{\\frac{B}{2}}=\\sqrt{\\frac{(s-c)(s-a)}{ca}}$$ $$\\sin{\\frac{C}{2}}=\\sqrt{\\frac{(s-a)(s-b)}{ab}}$$ Relations between cosines of angles and the semi-perimeter: $$\\cos{\\frac{A}{2}}=\\sqrt{\\frac{s(s-a)}{bc}}$$ $$\\cos{\\frac{B}{2}}=\\sqrt{\\frac{s(s-b)}{ca}}$$ $$\\cos{\\frac{C}{2}}=\\sqrt{\\frac{s(s-c)}{ab}}$$ Relations between tangents of angles and the semi-perimeter: $$\\tan{\\frac{A}{2}}=\\sqrt{\\frac{(s-b)(s-c)}{s(s-a)}}$$ $$\\tan{\\frac{B}{2}}=\\sqrt{\\frac{(s-c)(s-a)}{s(s-b)}}$$ $$\\tan{\\frac{C}{2}}=\\sqrt{\\frac{(s-a)(s-b)}{s(s-c)}}$$ The tangent rules of a triangle are stated as, $$\\tan{\\frac{B-C}{2}}=\\frac{b-c}{b+c}\\cot{\\frac{A}{2}}$$ $$\\tan{\\frac{C-A}{2}}=\\frac{c-a}{c+a}\\cot{\\frac{B}{2}}$$ $$\\tan{\\frac{A-B}{2}}=\\frac{a-b}{a+b}\\cot{\\frac{C}{2}}$$ Let \\(\\mathbb{\\delta}\\) denote the area of the triangle. We can note that, $$\\mathbb{\\delta}=\\frac{1}{2}bc\\sin{A}$$ $$\\mathbb{\\delta}=\\frac{1}{2}ca\\sin{B}$$ $$\\mathbb{\\delta}=\\frac{1}{2}ab\\sin{C}$$ Heron’s formula states that $$\\mathbb{\\delta}=\\sqrt{s(s-a)(s-b)(s-c)}$$ The circumradius of a triangle is related to its area as: $$R=\\frac{abc}{4\\mathbb{\\delta}}$$ Relations between the tangents of the angles of a triangle, its area, and its semi-perimeter: $$\\tan{\\frac{A}{2}}=\\frac{(s-b)(s-c)}{\\mathbb{\\delta}}$$ $$\\tan{\\frac{A}{2}}=\\frac{(s-c)(s-a)}{\\mathbb{\\delta}}$$ $$\\tan{\\frac{C}{2}}=\\frac{(s-a)(s-b)}{\\mathbb{\\delta}}$$ Relations between the cotangents of the angles of a triangle, its area, and its semi-perimeter: $$\\cot{\\frac{A}{2}}=\\frac{s(s-a)}{\\mathbb{\\delta}}$$ $$\\cot{\\frac{B}{2}}=\\frac{s(s-b)}{\\mathbb{\\delta}}$$ $$\\cot{\\frac{C}{2}}=\\frac{s(s-c)}{\\mathbb{\\delta}}$$ Special properties: If x, y, and z are the altitudes of the triangle through vertices A, B, and C respectively, then $$\\frac{\\cos{A}}{x}+\\frac{\\cos{B}}{y} +\\frac{\\cos{C}}{z}=\\frac{1}{R} $$ Let r denote the inradius of \\(\\triangle ABC\\) $$r=\\frac{\\mathbb{\\delta}}{s}$$ Relation between circumradius and inradius: $$Rr=\\frac{abc}{4s}$$  $$r=4R\\sin{(\\frac{A}{2})}\\sin{(\\frac{B}{2})}\\sin{(\\frac{C}{2})}$$ Relation between inradius and altitudes of a triangle: Inradius is equal to the harmonic mean of the altitudes of a triangle. Mathematically, $$r=\\frac{1}{\\frac{1}{x}+\\frac{1}{y}+\\frac{1}{z}}$$ Suppose the tangency points of the incircle divide the sides into lengths of l and m, m and n, and n and l, then the inradius is $$\\sqrt{\\frac{lmn}{l+m+n}}$$ and the area of the triangle is $$\\mathbb{\\delta}=\\sqrt{lmn(l+m+n)}$$ $$...$$");
    }
}