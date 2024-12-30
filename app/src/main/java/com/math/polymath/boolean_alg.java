package com.math.polymath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.kexanie.library.MathView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link boolean_alg#newInstance} factory method to
 * create an instance of this fragment.
 */
public class boolean_alg extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public boolean_alg() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment boolean_alg.
     */
    // TODO: Rename and change types and number of parameters
    public static boolean_alg newInstance(String param1, String param2) {
        boolean_alg fragment = new boolean_alg();
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
        return inflater.inflate(R.layout.fragment_boolean_alg, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        MathView mathView=requireView().findViewById(R.id.formula_space);
        mathView.setText("A proposition is defined as a declarative statement which is either true (denoted by 1) or false (denoted by 0). Connectives are Boolean operators which join simple propositions to form compound propositions. Some common connectives are given below: $$$$ Negation (NOT): If \\(p\\) is a proposition, then its negation is denoted as \\(\\neg p\\). The truth table is given below $$p\\hspace{2cm}\\neg p$$ $$0\\hspace{2cm}1$$ $$1\\hspace{2cm}0$$ Disjunction (OR): If p and q are two propositions, their disjunction is denoted as \\(f=p\\vee q\\). The truth table is given below $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}0$$ $$0\\hspace{2cm}1\\hspace{2cm}1$$ $$1\\hspace{2cm}0\\hspace{2cm}1$$ $$1\\hspace{2cm}1\\hspace{2cm}1$$ Conjunction (AND): If p and q are two propositions, their conjunction is denoted as \\(f=p\\wedge q\\). The truth table is given below $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}0$$ $$0\\hspace{2cm}1\\hspace{2cm}0$$ $$1\\hspace{2cm}0\\hspace{2cm}0$$ $$1\\hspace{2cm}1\\hspace{2cm}1$$ Implication (If-Then): If p and q are two propositions, their p implies q is denoted as \\(f=p\\implies q\\). The truth table is given below $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}1$$ $$0\\hspace{2cm}1\\hspace{2cm}1$$ $$1\\hspace{2cm}0\\hspace{2cm}0$$ $$1\\hspace{2cm}1\\hspace{2cm}1$$ Equivalence (If-and-only-If): If p and q are two propositions, their equivalence is denoted as \\(f=p\\iff q\\) or \\(f=p\\odot q\\). The truth table is given below $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}1$$ $$0\\hspace{2cm}1\\hspace{2cm}0$$ $$1\\hspace{2cm}0\\hspace{2cm}0$$ $$1\\hspace{2cm}1\\hspace{2cm}1$$ Terms related to proposition: Tautology: A compound proposition which is always true for all combinations of its elementary propositions (i.e. its truth table has only 1’s) is a tautology. Fallacy/ Contradiction: A compound proposition which is always false for all combinations of its elementary propositions (i.e. its truth table has only 0’s) is a fallacy. Contingency: A proposition which is neither a tautology nor a fallacy (i.e. its truth table has both 0’s and 1’s) is a contingency. Consistent Propositions: Two propositions are consistent if and only if their conjunction is not a fallacy. $$$$ Some equivalence laws and properties: Property of 0: $$0\\vee p=p$$ $$0\\wedge p=0$$ Property of 1: $$1\\vee p=1$$ $$1\\wedge p=p$$ Absorption Law: $$p\\vee(p\\wedge q)=p$$ $$p\\wedge(p\\vee q)=p$$ Involution Law: $$\\neg(\\neg p)=p$$ Complementarity law: $$p\\vee(\\neg p)=p$$ $$p\\wedge(\\neg p)=0$$ Commutative Property of AND and OR: $$p\\wedge q=q\\wedge p$$ $$p\\vee q=q\\vee p$$ Associative Property of AND and OR: $$(p\\wedge q)\\wedge r=p\\wedge(q\\wedge r)$$ $$(p\\vee q)\\vee r=p\\vee(q\\vee r)$$ Distributive Property of AND and OR: $$p\\wedge(q\\vee r)=(p\\wedge q)\\vee(p\\wedge r)$$ $$p\\vee(q\\wedge r)=(p\\vee q)\\wedge(p\\vee r)$$ De Morgan’s Laws: $$\\neg(p\\vee q)=\\neg p\\wedge\\neg q$$ $$\\neg(p\\wedge q)=\\neg p\\vee\\neg q$$ Conditional Elimination: $$p\\implies q=\\neg p\\vee q$$ Bi-conditional Elimination: $$p\\iff q=(p\\implies q)\\wedge(q\\implies p)$$ Transposition Rule: $$p\\implies q=\\neg q\\implies \\neg p$$ Some special Boolean operators: Exclusive Or (XOR): It is denoted by the symbol \\(f=p\\oplus q\\). It produces an output of 1 only when then number of 1’s in the input is odd. The truth table is given below: $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}0$$ $$0\\hspace{2cm}1\\hspace{2cm}1$$ $$1\\hspace{2cm}0\\hspace{2cm}1$$ $$1\\hspace{2cm}1\\hspace{2cm}0$$ Negated AND (NAND): It is basically a negated AND operator. $$p\\text{ }NAND\\text{ }q=\\neg(p\\wedge q)$$ Its truth table is given below: $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}1$$ $$0\\hspace{2cm}1\\hspace{2cm}1$$ $$1\\hspace{2cm}0\\hspace{2cm}1$$ $$1\\hspace{2cm}1\\hspace{2cm}0$$ Negated OR (NOR): It is basically a negated OR operator. $$p\\text{ }NOR\\text{ }q=\\neg(p\\vee q)$$ Its truth table is given below: $$p\\hspace{2cm}q\\hspace{2cm}f$$ $$0\\hspace{2cm}0\\hspace{2cm}1$$ $$0\\hspace{2cm}1\\hspace{2cm}0$$ $$1\\hspace{2cm}0\\hspace{2cm}0$$ $$1\\hspace{2cm}1\\hspace{2cm}0$$ Converse, Inverse, and Contrapositive of a statement: Consider an implication $$s:\\text{  }p\\implies q$$ Its converse is: $$c:\\text{  }q\\implies p$$ Its inverse is: $$i:\\text{  }\\neg p\\implies \\neg q$$ Its contrapositive is: $$t:\\text{  }\\neg q\\implies \\neg p$$ NAND and NOR gates as Universal Gates: For the purpose of conciseness, we will denote the NAND operator with the symbol \\(\\bar{\\wedge}\\) and NOR with the symbol \\(\\bar{\\vee}\\) $$\\neg p=p\\bar{\\wedge}p$$ $$p\\wedge q=(p\\bar{\\wedge}q)\\bar{\\wedge}(p\\bar{\\wedge}q)$$ $$p\\vee q=(p\\bar{\\wedge}p)\\bar{\\wedge}(q\\bar{\\wedge}q)$$ $$\\neg p=p\\bar{\\vee}p$$ $$p\\vee q=(p\\bar{\\vee}q)\\bar{\\vee}(p\\bar{\\vee}q)$$ $$p\\wedge q=(p\\bar{\\vee}p)\\bar{\\vee}(q\\bar{\\vee}q)$$ $$...$$");
    }
}