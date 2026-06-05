package bsh;

import java.lang.reflect.Array;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC2573Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHType extends SimpleNode implements InterfaceC2573Ujhhgtgfeyxiexzf {
    private static final long serialVersionUID = 1;
    private int arrayDims;
    private Class<?> baseType;
    String descriptor;
    private boolean isListener;
    private Class<?> type;

    public BSHType(int i) {
        super(i);
        this.isListener = false;
    }

    public void addArrayDimension() {
        this.arrayDims++;
    }

    @Override // p000.InterfaceC2573Ujhhgtgfeyxiexzf
    public void classLoaderChanged() {
        this.type = null;
        this.baseType = null;
    }

    public int getArrayDims() {
        return this.arrayDims;
    }

    public Class<?> getBaseType() {
        return this.baseType;
    }

    public Class<?> getType(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        Class<?> cls = this.type;
        if (cls != null) {
            return cls;
        }
        Node typeNode = getTypeNode();
        Class<?> cls2 = Object.class;
        if (typeNode instanceof BSHPrimitiveType) {
            this.baseType = ((BSHPrimitiveType) typeNode).getType();
        } else {
            try {
                this.baseType = ((BSHAmbiguousName) typeNode).toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            } catch (C3353Ujhhgtgfeyxiexzf e) {
                if (typeNode.getText().trim().length() != 1 || !(e.getCause() instanceof ClassNotFoundException)) {
                    throw e;
                }
                this.baseType = cls2;
            }
        }
        int i = this.arrayDims;
        if (i > 0) {
            try {
                int[] iArr = new int[i];
                Class<?> cls3 = this.baseType;
                if (cls3 != null) {
                    cls2 = cls3;
                }
                this.type = Array.newInstance(cls2, iArr).getClass();
            } catch (Exception e2) {
                throw new C3354Ujhhgtgfeyxiexzf("Couldn't construct array type", this, c2637feyxiexzfUjhhgtg, e2);
            }
        } else {
            this.type = this.baseType;
        }
        if (!this.isListener) {
            runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf().m4131Ujhhgtgfeyxiexzf(this);
            this.isListener = true;
        }
        return this.type;
    }

    public String getTypeDescriptor(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str) {
        String strM2706Ujhhgtgfeyxiexzf;
        String str2 = this.descriptor;
        if (str2 != null) {
            return str2;
        }
        Node typeNode = getTypeNode();
        if (typeNode instanceof BSHPrimitiveType) {
            strM2706Ujhhgtgfeyxiexzf = getTypeDescriptor(((BSHPrimitiveType) typeNode).type);
        } else {
            String strReplace = ((BSHAmbiguousName) typeNode).text;
            String str3 = (String) c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().f538Ujhhgtgfeyxiexzf.get(strReplace);
            Class<?> cls = null;
            if (str3 == null) {
                try {
                    cls = ((BSHAmbiguousName) typeNode).toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
                } catch (C3353Ujhhgtgfeyxiexzf unused) {
                    if (strReplace.length() == 1) {
                        strReplace = "java.lang.Object";
                    }
                }
            } else {
                strReplace = str3.replace('.', '$');
            }
            if (cls != null) {
                strM2706Ujhhgtgfeyxiexzf = getTypeDescriptor(cls);
            } else if (str == null || C0028Ujhhgtgfeyxiexzf.m348Ujhhgtgfeyxiexzf(strReplace)) {
                strM2706Ujhhgtgfeyxiexzf = "L" + strReplace.replace('.', '/') + ";";
            } else {
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', '/'));
                sb.append("/");
                strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, strReplace, ";");
            }
        }
        for (int i = 0; i < this.arrayDims; i++) {
            strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("[", strM2706Ujhhgtgfeyxiexzf);
        }
        this.descriptor = strM2706Ujhhgtgfeyxiexzf;
        return strM2706Ujhhgtgfeyxiexzf;
    }

    public Node getTypeNode() {
        return jjtGetChild(0);
    }

    public static String getTypeDescriptor(Class<?> cls) {
        if (cls == Boolean.TYPE) {
            return "Z";
        }
        if (cls == Character.TYPE) {
            return "C";
        }
        if (cls == Byte.TYPE) {
            return "B";
        }
        if (cls == Short.TYPE) {
            return "S";
        }
        if (cls == Integer.TYPE) {
            return "I";
        }
        if (cls == Long.TYPE) {
            return "J";
        }
        if (cls == Float.TYPE) {
            return "F";
        }
        if (cls == Double.TYPE) {
            return "D";
        }
        if (cls == Void.TYPE) {
            return "V";
        }
        String strReplace = cls.getName().replace('.', '/');
        if (strReplace.startsWith("[") || strReplace.endsWith(";")) {
            return strReplace;
        }
        return "L" + strReplace.replace('.', '/') + ";";
    }
}
