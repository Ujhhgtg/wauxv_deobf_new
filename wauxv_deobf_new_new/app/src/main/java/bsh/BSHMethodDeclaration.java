package bsh;

import java.lang.reflect.Array;
import okhttp3.HttpUrl;
import p000.C0527;
import p000.C1231;
import p000.C3581;

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

    private void evalNodes(C0527 c0527, RunnableC0008 runnableC0008) {
        insureNodesParsed();
        for (int i = this.firstThrowsClause; i < this.numThrows + this.firstThrowsClause; i++) {
            ((BSHAmbiguousName) jjtGetChild(i)).toClass(c0527, runnableC0008);
        }
        this.paramsNode.eval(c0527, runnableC0008);
        runnableC0008.getClass();
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        this.returnType = evalReturnType(c0527, runnableC0008);
        this.receiverType = evalReceiverType(c0527, runnableC0008);
        evalNodes(c0527, runnableC0008);
        C0012 c0012M2024 = c0527.m2024();
        BshMethod bshMethod = new BshMethod(this, c0012M2024, this.modifiers, this.isScriptedObject);
        boolean z = c0012M2024.f534;
        if (!z && !c0012M2024.f535) {
            runnableC0008.f505.m365().mo302(bshMethod);
        } else if (z && !this.paramsNode.isListener()) {
            runnableC0008.f505.m365().mo302(this.paramsNode);
            this.paramsNode.setListener(true);
        }
        c0012M2024.mo316(bshMethod);
        return Primitive.VOID;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[Catch: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x0022, TryCatch #0 {ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ -> 0x0022, blocks: (B:7:0x000d, B:9:0x0015, B:12:0x0025, B:13:0x0029, B:39:0x0085, B:44:0x0093, B:46:0x009e, B:47:0x00b4, B:15:0x002d, B:17:0x0035, B:18:0x0038, B:20:0x0040, B:21:0x0043, B:23:0x004b, B:24:0x004e, B:26:0x0056, B:27:0x0059, B:29:0x0061, B:30:0x0064, B:32:0x006c, B:33:0x006f, B:35:0x0077, B:36:0x007a, B:38:0x0082), top: B:52:0x000d }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Class<?> evalReceiverType(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
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
            } catch (C3581 e) {
                throw e.mo4677(this, c0527);
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
        Class<?> clsM363 = c0527.m2024().m363(strSubstring);
        if (clsM363 != null) {
            cls = clsM363;
            if (i == 0) {
                return cls;
            }
            return Array.newInstance(cls, new int[i]).getClass();
        }
        throw new C3581("Extension receiver type not found: " + strSubstring);
    }

    public Class<?> evalReturnType(C0527 c0527, RunnableC0008 runnableC0008) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType != null) {
            return bSHReturnType.evalReturnType(c0527, runnableC0008);
        }
        return null;
    }

    public String getReturnTypeDescriptor(C0527 c0527, RunnableC0008 runnableC0008, String str) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        return bSHReturnType.getTypeDescriptor(c0527, runnableC0008, str);
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
