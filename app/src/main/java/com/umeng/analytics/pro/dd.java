package com.umeng.analytics.pro;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class dd extends dk {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final ei j = new ei("TApplicationException");
    private static final dy k = new dy("message", (byte) 11, 1);
    private static final dy l = new dy(g.y, (byte) 8, 2);
    private static final long m = 1;
    protected int i;

    public dd() {
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public void b(ed edVar) {
        edVar.a(j);
        if (getMessage() != null) {
            edVar.a(k);
            edVar.a(getMessage());
            edVar.c();
        }
        edVar.a(l);
        edVar.a(this.i);
        edVar.c();
        edVar.d();
        edVar.b();
    }

    public static dd a(ed edVar) {
        edVar.j();
        String strZ = null;
        int iW = 0;
        while (true) {
            dy dyVarL = edVar.l();
            byte b2 = dyVarL.b;
            if (b2 == 0) {
                edVar.k();
                return new dd(iW, strZ);
            }
            short s = dyVarL.c;
            if (s != 1) {
                if (s != 2) {
                    eg.a(edVar, b2);
                } else if (b2 == 8) {
                    iW = edVar.w();
                } else {
                    eg.a(edVar, b2);
                }
            } else if (b2 == 11) {
                strZ = edVar.z();
            } else {
                eg.a(edVar, b2);
            }
            edVar.m();
        }
    }

    public dd(int i) {
        this.i = i;
    }

    public dd(int i, String str) {
        super(str);
        this.i = i;
    }

    public dd(String str) {
        super(str);
        this.i = 0;
    }
}
