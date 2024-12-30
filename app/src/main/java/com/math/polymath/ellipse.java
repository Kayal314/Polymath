package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ellipse#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ellipse extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ellipse() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ellipse.
     */
    // TODO: Rename and change types and number of parameters
    public static ellipse newInstance(String param1, String param2) {
        ellipse fragment = new ellipse();
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
        return inflater.inflate(R.layout.fragment_ellipse, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("Definition of an Ellipse: If a point P moves on a plane in such a way that the ratio of its distance from a fixed point S and its shortest distance from a fixed line L is constant, and if this ratio is less than unity, then the locus of the point is called an ellipse. Terms: Point S is called the focus, the fixed line L is called the directrix, and the constant ratio is called eccentricity (e) of the ellipse. Note: An ellipse has two focii and two directrices. The standard equation of an ellipse is: $$\\frac{x^2}{a^2}+\\frac{y^2}{b^2}=1$$ Here, \\(a\\) is the length of the semi-major axis and \\(b\\) is the length of the semi-minor axis of the ellipse if a > b (that is, ellipse has major axis along the X-axis), and \\(b\\) is the semi-major axis and \\(a\\) is the semi-minor ellipse of the ellipse if a > b (that is, ellipse has major axis along the Y-axis). For further explanations, we are taking the ellipse to have major axis along X-axis (a > b) although results are similar for both cases. Here $$e=\\sqrt{1-\\frac{b^2}{a^2}}$$ Assuming O is the origin (also, the geometric centre of the above ellipse), $$OS=OS’=ae$$ Let the directices L and L’ intersect the X-axis at Z and Z’ respectively, then $$OZ=OZ’=\\frac{a}{e}$$ The chord of an ellipse through its one focus and perpendicular to the major axis (or parallel to the directrix) is called the latus rectum of the ellipse. Let the latus rectum pass through the points \\(L_1\\) and \\(L_2\\) of the ellipse. Let $$\\overline{SL_1}=l$$ So, coordinates of \\(L_1\\) is (ae, l). Since this point lies on the ellipse, so: $$\\frac{a^2e^2}{a^2}+\\frac{l^2}{b^2}=1$$ $$\\implies \\frac{l^2}{b^2}=1-e^2$$ Since, $$b^2=a^2(1-e^2)$$ Hence, $$l^2=\\frac{b^4}{a^2}$$ $$\\implies l=\\pm\\frac{b^2}{a}$$ So, length of latus rectum is $$2l=\\frac{2b^2}{a}$$ Equations of the latera recta: $$x=\\pm ae$$ Let AA’ denote the major axis and BB’ denote the minor axis. Let P(x, y) be any point on the ellipse. Let \\(\\overline{PN}\\) and \\(\\overline{PN’}\\) be perpendiculars from P upon the major and minor axes respectively. Now we will note three interesting properties: We know, $$\\frac{x^2}{a^2}+\\frac{y^2}{b^2}=1$$ Rearranging, we get $$\\frac{y^2}{b^2}=\\frac{a^2-x^2}{a^2}$$ So, $$\\frac{y^2}{(a-x)(a+x)}=\\frac{b^2}{a^2}$$ $$\\frac{\\overline{PN}^2}{\\overline{AN}\\cdot\\overline{A’N}}=\\frac{b^2}{a^2} … (1)$$ Similarly we can prove $$\\frac{\\overline{PN’}^2}{\\overline{BN’}\\cdot\\overline{B’N’}}=\\frac{a^2}{b^2}…(2)$$ Let MPM’ be the perpendicular through P on the directrices. We know that $$\\frac{\\overline{SP}}{\\overline{PM}}=e$$ So, $$\\overline{SP}=e(\\frac{a}{e}-x)$$ Similarly, $$\\overline{S’P}=e(\\frac{a}{e}+x)$$ Hence, $$\\overline{SP}+\\overline{S’P}=a-ex+a+ex$$ So, we get $$\\overline{SP}+\\overline{S’P}=2a…(3)$$ Equation of a standard ellipse with centre at \\((\\alpha,\\beta)\\): $$\\frac{(x-\\alpha)^2}{a^2}+\\frac{(y-\\beta)^2}{b^2}=1$$ General Equation of an Ellipse: $$Ax^2+2Hxy+By^2+2Gx+2Fy+C$$ $$=0\\text{ ; }H^2 < AB$$ To find if a point \\(P(x_1,y_1)\\) lies inside or outside a standard ellipse: Let f be a function defined as $$f(x,y)= \\frac{x^2}{a^2}+\\frac{y^2}{b^2}$$ Now, P lies on the ellipse if $$f(x_1,y_1)=1$$ P lies inside the ellipse if $$f(x_1,y_1)<1$$ P lies outside the ellipse if $$f(x_1,y_1)>1$$ Parametric equation of a standard ellipse: $$x=a\\cos{\\phi},y=b\\sin{\\phi}$$ Parametric equation of an ellipse with major axis along X-axis or Y-axis and having center at \\((\\alpha,\\beta)\\): $$x=\\alpha+a\\cos{\\phi}$$ $$y=\\beta+b\\sin{\\phi}$$ Again consider the standard ellipse $$\\frac{x^2}{a^2}+\\frac{y^2}{b^2}=1$$Slope Form of a Tangent to an Ellipse: Equation of tangents to the ellipse, having a slope \\(m\\): $$y=mx\\pm\\sqrt{a^2m^2+b^2}$$ Such a line touches the ellipse at $$(\\frac{\\pm a^2m}{\\sqrt{a^2m^2+b^2}},\\frac{\\pm b^2}{\\sqrt{a^2m^2+b^2}})$$ Point form of a tangent to an ellipse: Equation of a tangent through the point \\((x_1,y_1)\\): $$\\frac{xx_1}{a^2}+\\frac{yy_1}{b^2}=1$$ $$...$$");
    }
}