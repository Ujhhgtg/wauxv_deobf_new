package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.db;
import com.umeng.analytics.pro.de;
import com.umeng.analytics.pro.dk;
import com.umeng.analytics.pro.dl;
import com.umeng.analytics.pro.dq;
import com.umeng.analytics.pro.dr;
import com.umeng.analytics.pro.dx;
import com.umeng.analytics.pro.dy;
import com.umeng.analytics.pro.ed;
import com.umeng.analytics.pro.ee;
import com.umeng.analytics.pro.eg;
import com.umeng.analytics.pro.ei;
import com.umeng.analytics.pro.ej;
import com.umeng.analytics.pro.el;
import com.umeng.analytics.pro.em;
import com.umeng.analytics.pro.en;
import com.umeng.analytics.pro.eo;
import com.umeng.analytics.pro.ep;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class a implements de<a, e>, Serializable, Cloneable {
    public static final Map<e, dq> e;
    private static final long f = 9132678615281394583L;
    private static final ei g = new ei("IdJournal");
    private static final dy h = new dy("domain", (byte) 11, 1);
    private static final dy i = new dy("old_id", (byte) 11, 2);
    private static final dy j = new dy("new_id", (byte) 11, 3);
    private static final dy k = new dy("ts", (byte) 10, 4);
    private static final Map<Class<? extends el>, em> l;
    private static final int m = 0;
    public String a;
    public String b;
    public String c;
    public long d;
    private byte n;
    private e[] o;

    /* JADX INFO: compiled from: obf */
    public static class C0039a extends en<a> {
        private C0039a() {
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, a aVar) throws ee {
            edVar.j();
            while (true) {
                dy dyVarL = edVar.l();
                byte b = dyVarL.b;
                if (b == 0) {
                    break;
                }
                short s = dyVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                eg.a(edVar, b);
                            } else if (b == 10) {
                                aVar.d = edVar.x();
                                aVar.d(true);
                            } else {
                                eg.a(edVar, b);
                            }
                        } else if (b == 11) {
                            aVar.c = edVar.z();
                            aVar.c(true);
                        } else {
                            eg.a(edVar, b);
                        }
                    } else if (b == 11) {
                        aVar.b = edVar.z();
                        aVar.b(true);
                    } else {
                        eg.a(edVar, b);
                    }
                } else if (b == 11) {
                    aVar.a = edVar.z();
                    aVar.a(true);
                } else {
                    eg.a(edVar, b);
                }
                edVar.m();
            }
            edVar.k();
            if (aVar.m()) {
                aVar.n();
            } else {
                throw new ee("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, a aVar) throws ee {
            aVar.n();
            edVar.a(a.g);
            if (aVar.a != null) {
                edVar.a(a.h);
                edVar.a(aVar.a);
                edVar.c();
            }
            if (aVar.b != null && aVar.g()) {
                edVar.a(a.i);
                edVar.a(aVar.b);
                edVar.c();
            }
            if (aVar.c != null) {
                edVar.a(a.j);
                edVar.a(aVar.c);
                edVar.c();
            }
            edVar.a(a.k);
            edVar.a(aVar.d);
            edVar.c();
            edVar.d();
            edVar.b();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b implements em {
        private b() {
        }

        @Override // com.umeng.analytics.pro.em
        public C0039a b() {
            return new C0039a();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class c extends eo<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, a aVar) {
            ej ejVar = (ej) edVar;
            ejVar.a(aVar.a);
            ejVar.a(aVar.c);
            ejVar.a(aVar.d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            ejVar.a(bitSet, 1);
            if (aVar.g()) {
                ejVar.a(aVar.b);
            }
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, a aVar) {
            ej ejVar = (ej) edVar;
            aVar.a = ejVar.z();
            aVar.a(true);
            aVar.c = ejVar.z();
            aVar.c(true);
            aVar.d = ejVar.x();
            aVar.d(true);
            if (ejVar.b(1).get(0)) {
                aVar.b = ejVar.z();
                aVar.b(true);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class d implements em {
        private d() {
        }

        @Override // com.umeng.analytics.pro.em
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        l = map;
        map.put(en.class, new b());
        map.put(eo.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new dq("domain", (byte) 1, new dr((byte) 11)));
        enumMap.put(e.OLD_ID, new dq("old_id", (byte) 2, new dr((byte) 11)));
        enumMap.put(e.NEW_ID, new dq("new_id", (byte) 1, new dr((byte) 11)));
        enumMap.put(e.TS, new dq("ts", (byte) 1, new dr((byte) 10)));
        Map<e, dq> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        e = mapUnmodifiableMap;
        dq.a(a.class, mapUnmodifiableMap);
    }

    public a() {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.de
    public a deepCopy() {
        return new a(this);
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
        this.d = 0L;
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

    public long k() {
        return this.d;
    }

    public void l() {
        this.n = db.b(this.n, 0);
    }

    public boolean m() {
        return db.a(this.n, 0);
    }

    public void n() throws ee {
        if (this.a == null) {
            throw new ee("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new ee("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        l.get(edVar.D()).b().b(edVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(domain:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        l.get(edVar.D()).b().a(edVar, this);
    }

    public a a(String str) {
        this.a = str;
        return this;
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public a c(String str) {
        this.c = str;
        return this;
    }

    public void d(boolean z) {
        this.n = db.a(this.n, 0, z);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.b = null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    /* JADX INFO: compiled from: obf */
    public enum e implements dl {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");

        private static final Map<String, e> e = new HashMap();
        private final short f;
        private final String g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                e.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Field ", " doesn't exist!"));
        }

        public static e a(String str) {
            return e.get(str);
        }

        @Override // com.umeng.analytics.pro.dl
        public short a() {
            return this.f;
        }

        @Override // com.umeng.analytics.pro.dl
        public String b() {
            return this.g;
        }
    }

    public a(String str, String str2, long j2) {
        this();
        this.a = str;
        this.c = str2;
        this.d = j2;
        d(true);
    }

    public a a(long j2) {
        this.d = j2;
        d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.de
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new dx(new ep(objectOutputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.a = aVar.a;
        }
        if (aVar.g()) {
            this.b = aVar.b;
        }
        if (aVar.j()) {
            this.c = aVar.c;
        }
        this.d = aVar.d;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.n = (byte) 0;
            read(new dx(new ep(objectInputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
