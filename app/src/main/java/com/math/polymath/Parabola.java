package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Parabola#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Parabola extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Parabola() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Parabola.
     */
    // TODO: Rename and change types and number of parameters
    public static Parabola newInstance(String param1, String param2) {
        Parabola fragment = new Parabola();
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
        return inflater.inflate(R.layout.fragment_parabola, container, false);
    }
    @Override
    public void onResume() {
        super.onResume();
        MathView mathView = requireView().findViewById(R.id.formula_space);
        mathView.setText("Definition of a Parabola: If a point P moves on a plane in such a way that the ratio of its distance from a fixed point S and its shortest distance from a fixed line L is constant, and if this ratio is equal to unity, then the locus of the point is called a parabola. This fixed point S is called its focus and the line L is called the directrix. The standard equation of a parabola is: $$y^2=4ax$$ Such a parabola has its vertex at the origin, directrix parallel to the Y-axis, and is directed along the X-axis if a > 0 and along the – X-axis if a < 0. Distance between the focus(S) and the vertex(V): $$\\overline{SV}=a$$The chord of a parabola through its focus and perpendicular to the axis (or parallel to the directrix) is called the latus rectum of the parabola. Putting \\(x=a\\) is the above equation, we get $$y^2=4a\\cdot a$$ $$\\implies y=\\pm 2a$$ Hence, the length of the latus rectum is $$l=4a$$ Geometrical interpretation of the equation: The area of a square on the ordinate of any point on the parabola is equal to the area of the rectangle formed by its latus rectum and the abscissa of the point. $$$$ The parametric equation of the standard parabola is $$\\begin{pmatrix}x\\\\y\\end{pmatrix}=\\begin{pmatrix}at^2\\\\2at\\end{pmatrix}$$ The equation of the directrix is $$x+a=0$$ Note: All results are similar and symmetrical for the parabola $$x^2=4ay$$ Equation of a standard parabola (directrix parallel to the Y-axis) with vertex at \\((\\alpha,\\beta)\\): $$(y-\\beta)^2=4a(x-\\alpha)$$ For such a parabola, the equation of the directrix is $$x+a=\\alpha$$ Coordinates of the focus: $$(a+\\alpha,\\beta)$$ Coordinates of the ends of the Latus Rectum: $$(\\alpha+a,\\beta\\pm 2a)$$ General Equation of a Parabola: $$Ax^2+2Hxy+By^2+2Gx+2Fy+C$$ $$=0\\text{ ; }H^2=AB$$ To find if a point \\(P(x_1,y_1)\\) lies inside or outside a standard parabola: Let f be a function defined as $$f(x,y)= y^2-4ax $$ Now, P lies on the parabola if $$f(x_1,y_1)=0$$ P lies within the parabola if $$f(x_1,y_1)<0$$ P lies outside the parabola if $$f(x_1,y_1)>0$$ Some Interesting Properties of Parabolas: Let the extremities of a focal chord of a parabola be \\((at_1^2,2at_1)\\) and \\((at_2^2,2at_2)\\). Then, $$t_1\\cdot t_2=-1$$ The equation of the chord of the parabola \\(y^2=4ax\\) through the points \\((x_1,y_1)\\) and \\((x_2,y_2)\\) on it is $$(y-y_1)(y-y_2)=y^2-4ax$$ The length of a chord of the parabola \\(y^2=4ax\\)  passing through its vertex and making an angle \\(\\theta\\) with the positive X-axis is $$l=4a\\csc{\\theta}\\cot{\\theta}$$ Given a parabola \\(y^2=4ax\\), the equation of the tangent through the point \\((x_1,y_1)\\) is $$yy_1=2a(x+x_1)$$ The equation of the tangent with slope m is given as $$y=mx+\\frac{a}{m}$$ The point of contact of such a tangent is $$(\\frac{a}{m^2},\\frac{2a}{m})$$ An interesting property about tangents to parabolas is that the orthocentre of the triangle formed by the three tangents to a parabola lies on the directrix $$...$$");
    }
}