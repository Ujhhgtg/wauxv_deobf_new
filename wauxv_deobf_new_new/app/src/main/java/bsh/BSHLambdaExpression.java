package bsh;

import p000.AbstractC0472;
import p000.C0471;
import p000.C0527;

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

    private void initValues(C0527 c0527, RunnableC0008 runnableC0008) {
        if (this.initializedValues) {
            return;
        }
        if (jjtGetNumChildren() == 2) {
            BSHFormalParameters bSHFormalParameters = (BSHFormalParameters) jjtGetChild(0);
            this.paramsTypes = bSHFormalParameters.eval(c0527, runnableC0008);
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
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        initValues(c0527, runnableC0008);
        C0012 c0012M2024 = c0527.m2024();
        Modifiers[] modifiersArr = this.paramsModifiers;
        Class<?>[] clsArr = this.paramsTypes;
        String[] strArr = this.paramsNames;
        Node node = this.body;
        C0471 c0471 = AbstractC0472.f2103;
        return new C0003(this, c0012M2024, modifiersArr, clsArr, strArr, node);
    }
}
