package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.cl;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1194;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class b implements de<b, e>, Serializable, Cloneable {
    public static final Map<e, dq> d;
    private static final long e = -6496538196005191531L;
    private static final ei f = new ei("IdSnapshot");
    private static final dy g = new dy("identity", (byte) 11, 1);
    private static final dy h = new dy("ts", (byte) 10, 2);
    private static final dy i = new dy("version", (byte) 8, 3);
    private static final Map<Class<? extends el>, em> j;
    private static final int k = 0;
    private static final int l = 1;
    public String a;
    public long b;
    public int c;
    private byte m;

    /* JADX INFO: compiled from: obf */
    public static class a extends en<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ed edVar, b bVar) throws ee {
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
                            eg.a(edVar, b);
                        } else if (b == 8) {
                            bVar.c = edVar.w();
                            bVar.c(true);
                        } else {
                            eg.a(edVar, b);
                        }
                    } else if (b == 10) {
                        bVar.b = edVar.x();
                        bVar.b(true);
                    } else {
                        eg.a(edVar, b);
                    }
                } else if (b == 11) {
                    bVar.a = edVar.z();
                    bVar.a(true);
                } else {
                    eg.a(edVar, b);
                }
                edVar.m();
            }
            edVar.k();
            if (!bVar.g()) {
                throw new ee("Required field 'ts' was not found in serialized data! Struct: " + toString());
            }
            if (bVar.j()) {
                bVar.k();
            } else {
                throw new ee("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ed edVar, b bVar) throws ee {
            bVar.k();
            edVar.a(b.f);
            if (bVar.a != null) {
                edVar.a(b.g);
                edVar.a(bVar.a);
                edVar.c();
            }
            edVar.a(b.h);
            edVar.a(bVar.b);
            edVar.c();
            edVar.a(b.i);
            edVar.a(bVar.c);
            edVar.c();
            edVar.d();
            edVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: obf */
    public static class C0040b implements em {
        private C0040b() {
        }

        @Override // com.umeng.analytics.pro.em
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class c extends eo<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, b bVar) {
            ej ejVar = (ej) edVar;
            ejVar.a(bVar.a);
            ejVar.a(bVar.b);
            ejVar.a(bVar.c);
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, b bVar) {
            ej ejVar = (ej) edVar;
            bVar.a = ejVar.z();
            bVar.a(true);
            bVar.b = ejVar.x();
            bVar.b(true);
            bVar.c = ejVar.w();
            bVar.c(true);
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
        j = map;
        map.put(en.class, new C0040b());
        map.put(eo.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((-6496538196005191531L).IDENTITY, new dq("identity", (byte) 1, new dr((byte) 11)));
        enumMap.put((-6496538196005191531L).TS, new dq("ts", (byte) 1, new dr((byte) 10)));
        enumMap.put((-6496538196005191531L).VERSION, new dq("version", (byte) 1, new dr((byte) 8)));
        Map<e, dq> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        dq.a(b.class, mapUnmodifiableMap);
    }

    public b() {
        this.m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.de
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
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
        b(false);
        this.b = 0L;
        c(false);
        this.c = 0;
    }

    public boolean d() {
        return this.a != null;
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.m = db.b(this.m, 0);
    }

    public boolean g() {
        return db.a(this.m, 0);
    }

    public int h() {
        return this.c;
    }

    public void i() {
        this.m = db.b(this.m, 1);
    }

    public boolean j() {
        return db.a(this.m, 1);
    }

    public void k() throws ee {
        if (this.a != null) {
            return;
        }
        throw new ee("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        j.get(edVar.D()).b().b(edVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(identity:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("version:");
        return AbstractC2784.m4751(sb, this.c, ")");
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        j.get(edVar.D()).b().a(edVar, this);
    }

    public b a(String str) {
        this.a = str;
        return this;
    }

    public void b(boolean z) {
        this.m = db.a(this.m, 0, z);
    }

    public void c(boolean z) {
        this.m = db.a(this.m, 1, z);
    }

    /* JADX INFO: compiled from: obf */
    public enum e implements dl {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");

        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                d.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Field ", " doesn't exist!"));
        }

        public static e a(String str) {
            return d.get(str);
        }

        @Override // com.umeng.analytics.pro.dl
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.dl
        public String b() {
            return this.f;
        }
    }

    public b(String str, long j2, int i2) {
        this();
        this.a = str;
        this.b = j2;
        b(true);
        this.c = i2;
        c(true);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    @Override // com.umeng.analytics.pro.de
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return (-6496538196005191531L).a(i2);
    }

    public b a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public b a(int i2) {
        this.c = i2;
        c(true);
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new dx(new ep(objectOutputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.a = bVar.a;
        }
        this.b = bVar.b;
        this.c = bVar.c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.m = (byte) 0;
            read(new dx(new ep(objectInputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
