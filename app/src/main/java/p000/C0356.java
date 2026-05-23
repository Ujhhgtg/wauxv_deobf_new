package p000;

import bsh.C0006;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0356 extends AbstractC2707 implements InterfaceC0480 {

    public Class f1666;

    public int f1667;

    public Class f1668;

    public boolean f1669;

    public String f1670;

    public C0356() {
        super(11);
        this.f1669 = false;
    }

    public static String m1466(Class cls) {
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

    @Override // p000.InterfaceC0480
    public final void mo343() {
        this.f1668 = null;
        this.f1666 = null;
    }

    public final Class m1467(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        Class cls = this.f1668;
        if (cls != null) {
            return cls;
        }
        InterfaceC2225 interfaceC2225 = this.f8721[0];
        Class<Object> cls2 = Object.class;
        if (interfaceC2225 instanceof C0350) {
            this.f1666 = ((C0350) interfaceC2225).f1659;
        } else {
            try {
                this.f1666 = ((C0326) interfaceC2225).m1432(c0550);
            } catch (C1229 e) {
                if (interfaceC2225.getText().trim().length() != 1 || !(e.getCause() instanceof ClassNotFoundException)) {
                    throw e;
                }
                this.f1666 = cls2;
            }
        }
        int i = this.f1667;
        if (i > 0) {
            try {
                int[] iArr = new int[i];
                Class<Object> cls3 = this.f1666;
                if (cls3 != null) {
                    cls2 = cls3;
                }
                this.f1668 = Array.newInstance((Class<?>) cls2, iArr).getClass();
            } catch (Exception e2) {
                throw new C1230("Couldn't construct array type", this, c0550, e2);
            }
        } else {
            this.f1668 = this.f1666;
        }
        if (!this.f1669) {
            runnableC1668.f5634.m346().mo296(this);
            this.f1669 = true;
        }
        return this.f1668;
    }

    public final String m1468(RunnableC1668 runnableC1668, C0550 c0550, String str) {
        String strM4752;
        String str2 = this.f1670;
        if (str2 != null) {
            return str2;
        }
        InterfaceC2225 interfaceC2225 = this.f8721[0];
        if (interfaceC2225 instanceof C0350) {
            strM4752 = m1466(((C0350) interfaceC2225).f1659);
        } else {
            String strReplace = ((C0326) interfaceC2225).f1577;
            String str3 = (String) c0550.m1929().f497.get(strReplace);
            Class clsM1432 = null;
            if (str3 == null) {
                try {
                    clsM1432 = ((C0326) interfaceC2225).m1432(c0550);
                } catch (C1229 unused) {
                    if (strReplace.length() == 1) {
                        strReplace = "java.lang.Object";
                    }
                }
            } else {
                strReplace = str3.replace('.', '$');
            }
            if (clsM1432 != null) {
                strM4752 = m1466(clsM1432);
            } else if (str == null || C0006.m329(strReplace)) {
                strM4752 = "L" + strReplace.replace('.', '/') + ";";
            } else {
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', '/'));
                sb.append("/");
                strM4752 = AbstractC2784.m4752(sb, strReplace, ";");
            }
        }
        for (int i = 0; i < this.f1667; i++) {
            strM4752 = AbstractC2784.m4757("[", strM4752);
        }
        this.f1670 = strM4752;
        return strM4752;
    }
}
