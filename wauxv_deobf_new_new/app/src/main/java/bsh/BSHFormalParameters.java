package bsh;

import p000.C0527;
import p000.InterfaceC0455;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameters extends SimpleNode implements InterfaceC0455 {
    private static final long serialVersionUID = 1;
    boolean isVarArgs;
    private boolean listener;
    int numArgs;
    private Modifiers[] paramModifiers;
    private String[] paramNames;
    Class<?>[] paramTypes;
    String[] typeDescriptors;

    public BSHFormalParameters(int i) {
        super(i);
    }

    @Override // p000.InterfaceC0455
    public void classLoaderChanged() {
        this.paramTypes = null;
    }

    public Modifiers[] getParamModifiers() {
        insureParsed();
        return this.paramModifiers;
    }

    public String[] getParamNames() {
        insureParsed();
        return this.paramNames;
    }

    public String[] getTypeDescriptors(C0527 c0527, RunnableC0008 runnableC0008, String str) {
        String[] strArr = this.typeDescriptors;
        if (strArr != null) {
            return strArr;
        }
        insureParsed();
        String[] strArr2 = new String[this.numArgs];
        for (int i = 0; i < this.numArgs; i++) {
            strArr2[i] = ((BSHFormalParameter) jjtGetChild(i)).getTypeDescriptor(c0527, runnableC0008, str);
        }
        this.typeDescriptors = strArr2;
        return strArr2;
    }

    public void insureParsed() {
        if (this.paramNames != null) {
            return;
        }
        int iJjtGetNumChildren = jjtGetNumChildren();
        this.numArgs = iJjtGetNumChildren;
        String[] strArr = new String[iJjtGetNumChildren];
        Modifiers[] modifiersArr = new Modifiers[iJjtGetNumChildren];
        for (int i = 0; i < this.numArgs; i++) {
            BSHFormalParameter bSHFormalParameter = (BSHFormalParameter) jjtGetChild(i);
            this.isVarArgs = bSHFormalParameter.isVarArgs;
            strArr[i] = bSHFormalParameter.name;
            Modifiers modifiers = new Modifiers(4);
            modifiersArr[i] = modifiers;
            if (bSHFormalParameter.isFinal) {
                modifiers.addModifier("final");
            }
        }
        this.paramNames = strArr;
        this.paramModifiers = modifiersArr;
    }

    public boolean isListener() {
        return this.listener;
    }

    public void setListener(boolean z) {
        this.listener = z;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Class<?>[] eval(C0527 c0527, RunnableC0008 runnableC0008) {
        Class<?>[] clsArr = this.paramTypes;
        if (clsArr != null) {
            return clsArr;
        }
        insureParsed();
        Class<?>[] clsArr2 = new Class[this.numArgs];
        for (int i = 0; i < this.numArgs; i++) {
            clsArr2[i] = (Class) ((BSHFormalParameter) jjtGetChild(i)).eval(c0527, runnableC0008);
        }
        this.paramTypes = clsArr2;
        return clsArr2;
    }
}
