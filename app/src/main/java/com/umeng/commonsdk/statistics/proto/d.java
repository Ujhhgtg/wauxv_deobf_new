package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.db;
import com.umeng.analytics.pro.de;
import com.umeng.analytics.pro.dk;
import com.umeng.analytics.pro.dl;
import com.umeng.analytics.pro.dq;
import com.umeng.analytics.pro.dr;
import com.umeng.analytics.pro.dt;
import com.umeng.analytics.pro.dv;
import com.umeng.analytics.pro.dx;
import com.umeng.analytics.pro.dy;
import com.umeng.analytics.pro.ea;
import com.umeng.analytics.pro.ed;
import com.umeng.analytics.pro.ee;
import com.umeng.analytics.pro.eg;
import com.umeng.analytics.pro.ei;
import com.umeng.analytics.pro.ej;
import com.umeng.analytics.pro.ek;
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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d implements de<d, e>, Serializable, Cloneable {
    public static final Map<e, dq> d;
    private static final long e = 2846460275012375038L;
    private static final ei f = new ei("Imprint");
    private static final dy g = new dy("property", 13, 1);
    private static final dy h = new dy("version", (byte) 8, 2);
    private static final dy i = new dy("checksum", (byte) 11, 3);
    private static final Map<Class<? extends el>, em> j;
    private static final int k = 0;
    public Map<String, com.umeng.commonsdk.statistics.proto.e> a;
    public int b;
    public String c;
    private byte l;

    /* JADX INFO: compiled from: obf */
    public static class a extends en<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, d dVar) throws ee {
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
                        } else if (b == 11) {
                            dVar.c = edVar.z();
                            dVar.c(true);
                        } else {
                            eg.a(edVar, b);
                        }
                    } else if (b == 8) {
                        dVar.b = edVar.w();
                        dVar.b(true);
                    } else {
                        eg.a(edVar, b);
                    }
                } else if (b == 13) {
                    ea eaVarN = edVar.n();
                    dVar.a = new HashMap(eaVarN.c * 2);
                    for (int i = 0; i < eaVarN.c; i++) {
                        String strZ = edVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(edVar);
                        dVar.a.put(strZ, eVar);
                    }
                    edVar.o();
                    dVar.a(true);
                } else {
                    eg.a(edVar, b);
                }
                edVar.m();
            }
            edVar.k();
            if (!dVar.h()) {
                throw new ee("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            dVar.l();
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, d dVar) throws ee {
            dVar.l();
            edVar.a(d.f);
            if (dVar.a != null) {
                edVar.a(d.g);
                edVar.a(new ea((byte) 11, (byte) 12, dVar.a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                    edVar.a(entry.getKey());
                    entry.getValue().write(edVar);
                }
                edVar.e();
                edVar.c();
            }
            edVar.a(d.h);
            edVar.a(dVar.b);
            edVar.c();
            if (dVar.c != null) {
                edVar.a(d.i);
                edVar.a(dVar.c);
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
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class c extends eo<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, d dVar) {
            ej ejVar = (ej) edVar;
            ejVar.a(dVar.a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                ejVar.a(entry.getKey());
                entry.getValue().write(ejVar);
            }
            ejVar.a(dVar.b);
            ejVar.a(dVar.c);
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, d dVar) {
            ej ejVar = (ej) edVar;
            ea eaVar = new ea((byte) 11, (byte) 12, ejVar.w());
            dVar.a = new HashMap(eaVar.c * 2);
            for (int i = 0; i < eaVar.c; i++) {
                String strZ = ejVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(ejVar);
                dVar.a.put(strZ, eVar);
            }
            dVar.a(true);
            dVar.b = ejVar.w();
            dVar.b(true);
            dVar.c = ejVar.z();
            dVar.c(true);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class C0042d implements em {
        private C0042d() {
        }

        @Override // com.umeng.analytics.pro.em
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(en.class, new b());
        map.put(eo.class, new C0042d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(2846460275012375038L.PROPERTY, new dq("property", (byte) 1, new dt(13, new dr((byte) 11), new dv((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put(2846460275012375038L.VERSION, new dq("version", (byte) 1, new dr((byte) 8)));
        enumMap.put(2846460275012375038L.CHECKSUM, new dq("checksum", (byte) 1, new dr((byte) 11)));
        Map<e, dq> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        dq.a(d.class, mapUnmodifiableMap);
    }

    public d() {
        this.l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.de
    public d deepCopy() {
        return new d(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.a;
    }

    @Override // com.umeng.analytics.pro.de
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0;
        this.c = null;
    }

    public void d() {
        this.a = null;
    }

    public boolean e() {
        return this.a != null;
    }

    public int f() {
        return this.b;
    }

    public void g() {
        this.l = db.b(this.l, 0);
    }

    public boolean h() {
        return db.a(this.l, 0);
    }

    public String i() {
        return this.c;
    }

    public void j() {
        this.c = null;
    }

    public boolean k() {
        return this.c != null;
    }

    public void l() throws ee {
        if (this.a == null) {
            throw new ee("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.c != null) {
            return;
        }
        throw new ee("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        j.get(edVar.D()).b().b(edVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        j.get(edVar.D()).b().a(edVar, this);
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, eVar);
    }

    public void b(boolean z) {
        this.l = db.a(this.l, 0, z);
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    /* JADX INFO: compiled from: obf */
    public enum e implements dl {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");

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
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
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

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i2, String str) {
        this();
        this.a = map;
        this.b = i2;
        b(true);
        this.c = str;
    }

    @Override // com.umeng.analytics.pro.de
    public e fieldForId(int i2) {
        return 2846460275012375038L.a(i2);
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.a = map;
        return this;
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public d a(int i2) {
        this.b = i2;
        b(true);
        return this;
    }

    public d(d dVar) {
        this.l = (byte) 0;
        this.l = dVar.l;
        if (dVar.e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.a.entrySet()) {
                map.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.a = map;
        }
        this.b = dVar.b;
        if (dVar.k()) {
            this.c = dVar.c;
        }
    }

    public d a(String str) {
        this.c = str;
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new dx(new ep(objectOutputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.l = (byte) 0;
            read(new dx(new ep(objectInputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
