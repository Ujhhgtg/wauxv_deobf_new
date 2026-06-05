package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC3317feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class bw implements de<bw, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;
    public static final Map<e, dq> k;
    private static final long l = 420342210744516016L;
    private static final ei m = new ei("UMEnvelope");
    private static final dy n = new dy(cl.n, (byte) 11, 1);
    private static final dy o = new dy("address", (byte) 11, 2);
    private static final dy p = new dy(com.umeng.ccg.a.A, (byte) 11, 3);
    private static final dy q = new dy("serial_num", (byte) 8, 4);
    private static final dy r = new dy("ts_secs", (byte) 8, 5);
    private static final dy s = new dy("length", (byte) 8, 6);
    private static final dy t = new dy("entity", (byte) 11, 7);
    private static final dy u = new dy("guid", (byte) 11, 8);
    private static final dy v = new dy("checksum", (byte) 11, 9);
    private static final dy w = new dy("codex", (byte) 8, 10);
    private static final Map<Class<? extends el>, em> x;
    private static final int y = 0;
    private static final int z = 1;
    private byte C;
    private e[] D;
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    /* JADX INFO: compiled from: obf */
    public static class a extends en<bw> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ed edVar, bw bwVar) throws ee {
            edVar.j();
            while (true) {
                dy dyVarL = edVar.l();
                byte b = dyVarL.b;
                if (b == 0) {
                    edVar.k();
                    if (!bwVar.m()) {
                        throw new ee("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bwVar.p()) {
                        throw new ee("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (!bwVar.s()) {
                        throw new ee("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                    bwVar.G();
                    return;
                }
                switch (dyVarL.c) {
                    case 1:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.a = edVar.z();
                            bwVar.a(true);
                        }
                        break;
                    case 2:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.b = edVar.z();
                            bwVar.b(true);
                        }
                        break;
                    case 3:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.c = edVar.z();
                            bwVar.c(true);
                        }
                        break;
                    case 4:
                        if (b != 8) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.d = edVar.w();
                            bwVar.d(true);
                        }
                        break;
                    case 5:
                        if (b != 8) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.e = edVar.w();
                            bwVar.e(true);
                        }
                        break;
                    case 6:
                        if (b != 8) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.f = edVar.w();
                            bwVar.f(true);
                        }
                        break;
                    case 7:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.g = edVar.A();
                            bwVar.g(true);
                        }
                        break;
                    case 8:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.h = edVar.z();
                            bwVar.h(true);
                        }
                        break;
                    case 9:
                        if (b != 11) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.i = edVar.z();
                            bwVar.i(true);
                        }
                        break;
                    case 10:
                        if (b != 8) {
                            eg.a(edVar, b);
                        } else {
                            bwVar.j = edVar.w();
                            bwVar.j(true);
                        }
                        break;
                    default:
                        eg.a(edVar, b);
                        break;
                }
                edVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ed edVar, bw bwVar) throws ee {
            bwVar.G();
            edVar.a(bw.m);
            if (bwVar.a != null) {
                edVar.a(bw.n);
                edVar.a(bwVar.a);
                edVar.c();
            }
            if (bwVar.b != null) {
                edVar.a(bw.o);
                edVar.a(bwVar.b);
                edVar.c();
            }
            if (bwVar.c != null) {
                edVar.a(bw.p);
                edVar.a(bwVar.c);
                edVar.c();
            }
            edVar.a(bw.q);
            edVar.a(bwVar.d);
            edVar.c();
            edVar.a(bw.r);
            edVar.a(bwVar.e);
            edVar.c();
            edVar.a(bw.s);
            edVar.a(bwVar.f);
            edVar.c();
            if (bwVar.g != null) {
                edVar.a(bw.t);
                edVar.a(bwVar.g);
                edVar.c();
            }
            if (bwVar.h != null) {
                edVar.a(bw.u);
                edVar.a(bwVar.h);
                edVar.c();
            }
            if (bwVar.i != null) {
                edVar.a(bw.v);
                edVar.a(bwVar.i);
                edVar.c();
            }
            if (bwVar.F()) {
                edVar.a(bw.w);
                edVar.a(bwVar.j);
                edVar.c();
            }
            edVar.d();
            edVar.b();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b implements em {
        private b() {
        }

        @Override // com.umeng.analytics.pro.em
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class c extends eo<bw> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, bw bwVar) {
            ej ejVar = (ej) edVar;
            ejVar.a(bwVar.a);
            ejVar.a(bwVar.b);
            ejVar.a(bwVar.c);
            ejVar.a(bwVar.d);
            ejVar.a(bwVar.e);
            ejVar.a(bwVar.f);
            ejVar.a(bwVar.g);
            ejVar.a(bwVar.h);
            ejVar.a(bwVar.i);
            BitSet bitSet = new BitSet();
            if (bwVar.F()) {
                bitSet.set(0);
            }
            ejVar.a(bitSet, 1);
            if (bwVar.F()) {
                ejVar.a(bwVar.j);
            }
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, bw bwVar) {
            ej ejVar = (ej) edVar;
            bwVar.a = ejVar.z();
            bwVar.a(true);
            bwVar.b = ejVar.z();
            bwVar.b(true);
            bwVar.c = ejVar.z();
            bwVar.c(true);
            bwVar.d = ejVar.w();
            bwVar.d(true);
            bwVar.e = ejVar.w();
            bwVar.e(true);
            bwVar.f = ejVar.w();
            bwVar.f(true);
            bwVar.g = ejVar.A();
            bwVar.g(true);
            bwVar.h = ejVar.z();
            bwVar.h(true);
            bwVar.i = ejVar.z();
            bwVar.i(true);
            if (ejVar.b(1).get(0)) {
                bwVar.j = ejVar.w();
                bwVar.j(true);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class d implements em {
        private d() {
        }

        @Override // com.umeng.analytics.pro.em
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        x = map;
        map.put(en.class, new b());
        map.put(eo.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new dq(cl.n, (byte) 1, new dr((byte) 11)));
        enumMap.put(e.ADDRESS, new dq("address", (byte) 1, new dr((byte) 11)));
        enumMap.put(e.SIGNATURE, new dq(com.umeng.ccg.a.A, (byte) 1, new dr((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new dq("serial_num", (byte) 1, new dr((byte) 8)));
        enumMap.put(e.TS_SECS, new dq("ts_secs", (byte) 1, new dr((byte) 8)));
        enumMap.put(e.LENGTH, new dq("length", (byte) 1, new dr((byte) 8)));
        enumMap.put(e.ENTITY, new dq("entity", (byte) 1, new dr((byte) 11, true)));
        enumMap.put(e.GUID, new dq("guid", (byte) 1, new dr((byte) 11)));
        enumMap.put(e.CHECKSUM, new dq("checksum", (byte) 1, new dr((byte) 11)));
        enumMap.put(e.CODEX, new dq("codex", (byte) 2, new dr((byte) 8)));
        Map<e, dq> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        k = mapUnmodifiableMap;
        dq.a(bw.class, mapUnmodifiableMap);
    }

    public bw() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public String A() {
        return this.i;
    }

    public void B() {
        this.i = null;
    }

    public boolean C() {
        return this.i != null;
    }

    public int D() {
        return this.j;
    }

    public void E() {
        this.C = db.b(this.C, 3);
    }

    public boolean F() {
        return db.a(this.C, 3);
    }

    public void G() throws ee {
        if (this.a == null) {
            throw new ee("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.b == null) {
            throw new ee("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.c == null) {
            throw new ee("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.g == null) {
            throw new ee("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.h == null) {
            throw new ee("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.i != null) {
            return;
        }
        throw new ee("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.de
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bw deepCopy() {
        return new bw(this);
    }

    public String b() {
        return this.a;
    }

    public void c() {
        this.a = null;
    }

    @Override // com.umeng.analytics.pro.de
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0;
        e(false);
        this.e = 0;
        f(false);
        this.f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public boolean d() {
        return this.a != null;
    }

    public String e() {
        return this.b;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
    }

    public String h() {
        return this.c;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public int k() {
        return this.d;
    }

    public void l() {
        this.C = db.b(this.C, 0);
    }

    public boolean m() {
        return db.a(this.C, 0);
    }

    public int n() {
        return this.e;
    }

    public void o() {
        this.C = db.b(this.C, 1);
    }

    public boolean p() {
        return db.a(this.C, 1);
    }

    public int q() {
        return this.f;
    }

    public void r() {
        this.C = db.b(this.C, 2);
    }

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        x.get(edVar.D()).b().b(edVar, this);
    }

    public boolean s() {
        return db.a(this.C, 2);
    }

    public byte[] t() {
        a(df.c(this.g));
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            df.a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    public ByteBuffer u() {
        return this.g;
    }

    public void v() {
        this.g = null;
    }

    public boolean w() {
        return this.g != null;
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        x.get(edVar.D()).b().a(edVar, this);
    }

    public String x() {
        return this.h;
    }

    public void y() {
        this.h = null;
    }

    public boolean z() {
        return this.h != null;
    }

    public bw a(String str) {
        this.a = str;
        return this;
    }

    public bw b(String str) {
        this.b = str;
        return this;
    }

    public bw c(String str) {
        this.c = str;
        return this;
    }

    public void d(boolean z2) {
        this.C = db.a(this.C, 0, z2);
    }

    public void e(boolean z2) {
        this.C = db.a(this.C, 1, z2);
    }

    public void f(boolean z2) {
        this.C = db.a(this.C, 2, z2);
    }

    public void g(boolean z2) {
        if (z2) {
            return;
        }
        this.g = null;
    }

    public void h(boolean z2) {
        if (z2) {
            return;
        }
        this.h = null;
    }

    public void i(boolean z2) {
        if (z2) {
            return;
        }
        this.i = null;
    }

    public void j(boolean z2) {
        this.C = db.a(this.C, 3, z2);
    }

    public void a(boolean z2) {
        if (z2) {
            return;
        }
        this.a = null;
    }

    public void b(boolean z2) {
        if (z2) {
            return;
        }
        this.b = null;
    }

    public void c(boolean z2) {
        if (z2) {
            return;
        }
        this.c = null;
    }

    public bw d(String str) {
        this.h = str;
        return this;
    }

    public bw e(String str) {
        this.i = str;
        return this;
    }

    public bw(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        d(true);
        this.e = i2;
        e(true);
        this.f = i3;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }

    public bw a(int i) {
        this.d = i;
        d(true);
        return this;
    }

    public bw b(int i) {
        this.e = i;
        e(true);
        return this;
    }

    public bw c(int i) {
        this.f = i;
        f(true);
        return this;
    }

    public bw d(int i) {
        this.j = i;
        j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.de
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.a(i);
    }

    public bw a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public bw a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new dx(new ep(objectOutputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum e implements dl {
        VERSION(1, cl.n),
        ADDRESS(2, "address"),
        SIGNATURE(3, com.umeng.ccg.a.A),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");

        private static final Map<String, e> k = new HashMap();
        private final short l;
        private final String m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                k.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.l = s;
            this.m = str;
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4796Ujhhgtgfeyxiexzf(i, "Field ", " doesn't exist!"));
        }

        @Override // com.umeng.analytics.pro.dl
        public String b() {
            return this.m;
        }

        public static e a(String str) {
            return k.get(str);
        }

        @Override // com.umeng.analytics.pro.dl
        public short a() {
            return this.l;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.C = (byte) 0;
            read(new dx(new ep(objectInputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public bw(bw bwVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bwVar.C;
        if (bwVar.d()) {
            this.a = bwVar.a;
        }
        if (bwVar.g()) {
            this.b = bwVar.b;
        }
        if (bwVar.j()) {
            this.c = bwVar.c;
        }
        this.d = bwVar.d;
        this.e = bwVar.e;
        this.f = bwVar.f;
        if (bwVar.w()) {
            this.g = df.d(bwVar.g);
        }
        if (bwVar.z()) {
            this.h = bwVar.h;
        }
        if (bwVar.C()) {
            this.i = bwVar.i;
        }
        this.j = bwVar.j;
    }
}
