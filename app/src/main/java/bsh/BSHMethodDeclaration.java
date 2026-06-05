package bsh;

import java.lang.reflect.Array;
import okhttp3.HttpUrl;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    BSHBlock blockNode;
    int firstThrowsClause;
    boolean isExtension;
    private boolean isScriptedObject;
    boolean isVarArgs;
    public Modifiers modifiers;
    public String name;
    int numThrows;
    BSHFormalParameters paramsNode;
    String receiverText;
    Class<?> receiverType;
    Class<?> returnType;
    BSHReturnType returnTypeNode;

    public BSHMethodDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(2);
        this.numThrows = 0;
    }

    private void evalNodes(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        insureNodesParsed();
        for (int i = this.firstThrowsClause; i < this.numThrows + this.firstThrowsClause; i++) {
            ((BSHAmbiguousName) jjtGetChild(i)).toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        this.paramsNode.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        runnableC0026Ujhhgtgfeyxiexzf.getClass();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        this.returnType = evalReturnType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        this.receiverType = evalReceiverType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        evalNodes(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        Modifiers modifiers = this.modifiers;
        boolean z = this.isScriptedObject;
        String str = this.name;
        Class<?> cls = this.returnType;
        String[] paramNames = this.paramsNode.getParamNames();
        BSHFormalParameters bSHFormalParameters = this.paramsNode;
        C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf = new C0021Ujhhgtgfeyxiexzf(str, cls, paramNames, bSHFormalParameters.paramTypes, bSHFormalParameters.getParamModifiers(), this.blockNode, c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf, modifiers, this.isVarArgs);
        c0021Ujhhgtgfeyxiexzf.f480Ujhhgtgfeyxiexzf = z;
        c0021Ujhhgtgfeyxiexzf.f481Ujhhgtgfeyxiexzf = this.isExtension;
        c0021Ujhhgtgfeyxiexzf.f482Ujhhgtgfeyxiexzf = this.receiverType;
        boolean z2 = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf;
        if (!z2 && !c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
            runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf().m4131Ujhhgtgfeyxiexzf(c0021Ujhhgtgfeyxiexzf);
        } else if (z2 && !this.paramsNode.isListener()) {
            runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf().m4131Ujhhgtgfeyxiexzf(this.paramsNode);
            this.paramsNode.setListener(true);
        }
        c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.mo302feyxiexzfUjhhgtg(c0021Ujhhgtgfeyxiexzf);
        return Primitive.VOID;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[Catch: 上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x0022, TryCatch #0 {上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ -> 0x0022, blocks: (B:7:0x000d, B:9:0x0015, B:12:0x0025, B:13:0x0029, B:39:0x0085, B:44:0x0093, B:46:0x009e, B:47:0x00b4, B:15:0x002d, B:17:0x0035, B:18:0x0038, B:20:0x0040, B:21:0x0043, B:23:0x004b, B:24:0x004e, B:26:0x0056, B:27:0x0059, B:29:0x0061, B:30:0x0064, B:32:0x006c, B:33:0x006f, B:35:0x0077, B:36:0x007a, B:38:0x0082), top: B:52:0x000d }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Class<?> evalReceiverType(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        String strSubstring;
        Class<?> cls;
        insureNodesParsed();
        if (!this.isExtension || (strSubstring = this.receiverText) == null) {
            return null;
        }
        int i = 0;
        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            try {
                i++;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        }
        switch (strSubstring.hashCode()) {
            case -1325958191:
                if (strSubstring.equals("double")) {
                    cls = Double.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 104431:
                if (strSubstring.equals("int")) {
                    cls = Integer.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 3039496:
                if (strSubstring.equals("byte")) {
                    cls = Byte.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 3052374:
                if (strSubstring.equals("char")) {
                    cls = Character.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 3327612:
                if (strSubstring.equals("long")) {
                    cls = Long.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 64711720:
                if (strSubstring.equals("boolean")) {
                    cls = Boolean.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 97526364:
                if (strSubstring.equals("float")) {
                    cls = Float.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
            case 109413500:
                if (strSubstring.equals("short")) {
                    cls = Short.TYPE;
                }
                if (i == 0) {
                    return cls;
                }
                return Array.newInstance(cls, new int[i]).getClass();
        }
        Class<?> clsM362Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().m362Ujhhgtgfeyxiexzf(strSubstring);
        if (clsM362Ujhhgtgfeyxiexzf != null) {
            cls = clsM362Ujhhgtgfeyxiexzf;
            if (i == 0) {
                return cls;
            }
            return Array.newInstance(cls, new int[i]).getClass();
        }
        throw new C1863Ujhhgtgfeyxiexzf("Extension receiver type not found: " + strSubstring);
    }

    public Class<?> evalReturnType(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType != null) {
            return bSHReturnType.evalReturnType(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        return null;
    }

    public String getReturnTypeDescriptor(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        return bSHReturnType.getTypeDescriptor(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, str);
    }

    public BSHReturnType getReturnTypeNode() {
        insureNodesParsed();
        return this.returnTypeNode;
    }

    public synchronized void insureNodesParsed() {
        int i;
        try {
            if (this.paramsNode != null) {
                return;
            }
            Node nodeJjtGetChild = jjtGetChild(0);
            if (nodeJjtGetChild instanceof BSHReturnType) {
                this.returnTypeNode = (BSHReturnType) nodeJjtGetChild;
                nodeJjtGetChild = jjtGetChild(1);
                i = 1;
            } else {
                i = 0;
            }
            if (nodeJjtGetChild instanceof BSHAmbiguousName) {
                String str = ((BSHAmbiguousName) nodeJjtGetChild).text;
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    this.isExtension = true;
                    this.receiverText = str.substring(0, iLastIndexOf);
                    this.name = str.substring(iLastIndexOf + 1);
                } else {
                    this.isExtension = false;
                    this.receiverText = null;
                    this.name = str;
                }
                i++;
            }
            this.paramsNode = (BSHFormalParameters) jjtGetChild(i);
            int i2 = i + 1;
            this.firstThrowsClause = i2;
            int iJjtGetNumChildren = jjtGetNumChildren();
            int i3 = this.numThrows;
            if (iJjtGetNumChildren > i2 + i3) {
                this.blockNode = (BSHBlock) jjtGetChild(i2 + i3);
            }
            BSHBlock bSHBlock = this.blockNode;
            if (bSHBlock != null && bSHBlock.jjtGetNumChildren() > 0) {
                BSHBlock bSHBlock2 = this.blockNode;
                Node nodeJjtGetChild2 = bSHBlock2.jjtGetChild(bSHBlock2.jjtGetNumChildren() - 1);
                if (nodeJjtGetChild2 instanceof BSHReturnStatement) {
                    while (nodeJjtGetChild2.hasNext()) {
                        nodeJjtGetChild2 = nodeJjtGetChild2.next();
                        if (nodeJjtGetChild2 instanceof BSHAmbiguousName) {
                            this.isScriptedObject = ((BSHAmbiguousName) nodeJjtGetChild2).text.startsWith("this");
                        }
                    }
                }
            }
            this.paramsNode.insureParsed();
            this.isVarArgs = this.paramsNode.isVarArgs;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
