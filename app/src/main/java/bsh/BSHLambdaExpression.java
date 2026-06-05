package bsh;

import p000.AbstractC2584feyxiexzfUjhhgtg;
import p000.C2581feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHLambdaExpression extends SimpleNode {
    private static final long serialVersionUID = 1;
    private Node body;
    private boolean initializedValues;
    private Modifiers[] paramsModifiers;
    private String[] paramsNames;
    private Class<?>[] paramsTypes;
    String singleParamName;

    public BSHLambdaExpression(int i) {
        super(i);
        this.initializedValues = false;
    }

    private void initValues(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        if (this.initializedValues) {
            return;
        }
        if (jjtGetNumChildren() == 2) {
            BSHFormalParameters bSHFormalParameters = (BSHFormalParameters) jjtGetChild(0);
            this.paramsTypes = bSHFormalParameters.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            this.paramsModifiers = bSHFormalParameters.getParamModifiers();
            this.paramsNames = bSHFormalParameters.getParamNames();
            this.body = jjtGetChild(1);
        } else {
            this.paramsTypes = new Class[]{null};
            this.paramsModifiers = new Modifiers[]{null};
            this.paramsNames = new String[]{this.singleParamName};
            this.body = jjtGetChild(0);
        }
        this.initializedValues = true;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        initValues(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        Modifiers[] modifiersArr = this.paramsModifiers;
        Class<?>[] clsArr = this.paramsTypes;
        String[] strArr = this.paramsNames;
        Node node = this.body;
        C2581feyxiexzfUjhhgtg c2581feyxiexzfUjhhgtg = AbstractC2584feyxiexzfUjhhgtg.f8356Ujhhgtgfeyxiexzf;
        return new C0020Ujhhgtgfeyxiexzf(this, c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf, modifiersArr, clsArr, strArr, node);
    }
}
