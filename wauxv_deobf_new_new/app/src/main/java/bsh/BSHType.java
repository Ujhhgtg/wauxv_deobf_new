package bsh;

import java.lang.reflect.Array;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.InterfaceC0455;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHType extends SimpleNode implements InterfaceC0455 {
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

    @Override // p000.InterfaceC0455
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

    public Class<?> getType(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
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
                this.baseType = ((BSHAmbiguousName) typeNode).toClass(c0527, runnableC0008);
            } catch (C1231 e) {
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
                throw new C1232("Couldn't construct array type", this, c0527, e2);
            }
        } else {
            this.type = this.baseType;
        }
        if (!this.isListener) {
            runnableC0008.f505.m365().mo302(this);
            this.isListener = true;
        }
        return this.type;
    }

    public String getTypeDescriptor(C0527 c0527, RunnableC0008 runnableC0008, String str) {
        String strM4786;
        String str2 = this.descriptor;
        if (str2 != null) {
            return str2;
        }
        Node typeNode = getTypeNode();
        if (typeNode instanceof BSHPrimitiveType) {
            strM4786 = getTypeDescriptor(((BSHPrimitiveType) typeNode).type);
        } else {
            String strReplace = ((BSHAmbiguousName) typeNode).text;
            String str3 = (String) c0527.m2024().f524.get(strReplace);
            Class<?> cls = null;
            if (str3 == null) {
                try {
                    cls = ((BSHAmbiguousName) typeNode).toClass(c0527, runnableC0008);
                } catch (C1231 unused) {
                    if (strReplace.length() == 1) {
                        strReplace = "java.lang.Object";
                    }
                }
            } else {
                strReplace = str3.replace('.', '$');
            }
            if (cls != null) {
                strM4786 = getTypeDescriptor(cls);
            } else if (str == null || C0010.m350(strReplace)) {
                strM4786 = "L" + strReplace.replace('.', '/') + ";";
            } else {
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', '/'));
                sb.append("/");
                strM4786 = AbstractC2844.m4786(sb, strReplace, ";");
            }
        }
        for (int i = 0; i < this.arrayDims; i++) {
            strM4786 = AbstractC2844.m4790("[", strM4786);
        }
        this.descriptor = strM4786;
        return strM4786;
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
