package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link hyperbola#newInstance} factory method to
 * create an instance of this fragment.
 */
public class hyperbola extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public hyperbola() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment hyperbola.
     */
    // TODO: Rename and change types and number of parameters
    public static hyperbola newInstance(String param1, String param2) {
        hyperbola fragment = new hyperbola();
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
        return inflater.inflate(R.layout.fragment_hyperbola, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("Definition of a Hyperbola: If a point P moves on a plane in such a way that the ratio of its distance from a fixed point S and its shortest distance from a fixed line L is constant, and if this ratio is greater than unity, then the locus of the point is called a hyperbola. Terms: Point S is called the focus, the fixed line L is called the directrix, and the constant ratio is called eccentricity (e) of the hyperbola. Note: A hyperbola has two foci and two directrices. The standard equation of a hyperbola is: $$\\frac{x^2}{a^2}-\\frac{y^2}{b^2}=1$$ Here, \\(a\\) is the length of the semi-transverse axis and \\(b\\) is the length of the semi-conjugate axis (assuming a > b.) Note that the results are symmetrical if a < b. Perpendicular distance between the directrix and the centre of the hyperbola is given by $$d=\\frac{a}{e}$$ Distance between the focus and the centre of the hyperbola is given by $$d’=ae$$ Relationship between eccentricity and lengths of semi-transverse and semi-conjugate axis: $$e=\\sqrt{1+\\frac{b^2}{a^2}}$$ The chord of a hyperbola passing through one of its focus and perpendicular to the transverse axis (or parallel to the directrix) is called the latus rectum of the hyperbola. Let the length of the latus rectum of a standard hyperbola be \\(2l\\) Plugging (ae, l) in the equation, we get $$\\frac{a^2e^2}{a^2}-\\frac{l^2}{b^2}=1$$ $$\\implies \\frac{l^2}{b^2}=e^2-1$$ $$\\implies l^2=b^2\\cdot\\frac{b^2}{a^2}$$ $$\\implies l=\\frac{b^2}{a}$$ Hence the length of the latus rectum is $$2l=\\frac{2b^2}{a}$$ Equations of the latera recta: $$x=\\pm ae$$ Let \\(\\overline{PN}\\) be the perpendicular from any point \\(P(x, y)\\) on the standard hyperbola upon the transverse axis. Let A and A’ be the vertices and let S and S’ be the foci. Now we will note two interesting properties: We know, $$\\frac{x^2}{a^2}-\\frac{y^2}{b^2}=1$$ Rearranging, we get $$\\frac{y^2}{b^2}=\\frac{x^2-a^2}{a^2}$$ So, $$\\frac{y^2}{(x-a)(x+a)}=\\frac{b^2}{a^2}$$ $$\\frac{\\overline{PN}^2}{\\overline{AN}\\cdot\\overline{A’N}}=\\frac{b^2}{a^2} … (1)$$ Let PMM’ be the perpendicular through P on the directrices. We know that $$\\frac{\\overline{SP}}{\\overline{PM}}=e$$ So, $$\\overline{SP}=e(x-\\frac{a}{e})$$ Similarly, $$\\overline{S’P}=e(x+\\frac{a}{e})$$ Hence, $$\\overline{S’P}-\\overline{SP}=a-ex+a+ex$$ So, we get $$\\overline{S’P}-\\overline{SP}=2a…(2)$$ Equation of a standard hyperbola with centre at \\((\\alpha,\\beta)\\): $$\\frac{(x-\\alpha)^2}{a^2}-\\frac{(y-\\beta)^2}{b^2}=1$$ Conjugate hyperbolas: Two hyperbolas are conjugates of each other if and only if the transverse and conjugate axis of one hyperbola is the conjugate and transverse axis, respectively, on the other hyperbola. Let one hyperbola be $$\\frac{x^2}{a^2}-\\frac{y^2}{b^2}=1$$ Then its conjugate is the hyperbola: $$\\frac{y^2}{b^2}-\\frac{x^2}{a^2}=1$$ If \\(e_1\\) and \\(e_2\\) are the eccentricities of two conjugate hyperbolas then $$\\frac{1}{e_1^2}+\\frac{1}{e_2^2}=1$$ Rectangular hyperbola: A hyperbola whose length of the transverse axis is equal to the length of the conjugate axis is called a rectangular hyperbola. Equation of such a hyperbola is $$\\frac{x^2}{a^2}-\\frac{y^2}{a^2}=1$$ Here, the eccentricity is $$e=\\sqrt{2}$$ General Equation of a Hyperbola: $$Ax^2+2Hxy+By^2+2Gx+2Fy+C$$ $$=0\\text{ ; }H^2>AB$$ To find if a point \\(P(x_1,y_1)\\) lies inside or outside a standard hyperbola: Let f be a function defined as $$f(x,y)= \\frac{x^2}{a^2}-\\frac{y^2}{b^2} $$ Now, P lies on the hyperbola if $$f(x_1,y_1)=1$$ P lies inside the hyperbola if $$f(x_1,y_1)>1$$ P lies outside the hyperbola if $$f(x_1,y_1)<1$$ Parametric equation of a standard hyperbola: $$x=a\\sec{\\phi},y=b\\tan{\\phi}$$ Parametric equation of a hyperbola with transverse axis along X-axis or Y-axis and having center at \\((\\alpha,\\beta)\\): $$x=\\alpha+a\\sec{\\phi}$$ $$y=\\beta+b\\tan{\\phi}$$ Again consider the standard hyperbola $$\\frac{x^2}{a^2}-\\frac{y^2}{b^2}=1$$Slope Form of a Tangent to a Hyperbola: Equation of tangents to the hyperbola, having a slope \\(m\\): $$y=mx\\pm\\sqrt{a^2m^2-b^2}$$ Point Form of a Tangent to a Hyperbola: Equation of a tangent through the point \\((x_1,y_1)\\): $$\\frac{xx_1}{a^2}-\\frac{yy_1}{b^2}=1$$ $$...$$");
    }
}