package com.umeng.analytics.pro;

import com.umeng.analytics.pro.Cdo;
import com.umeng.analytics.pro.dl;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.AbstractC2784;

/* JADX INFO: renamed from: com.umeng.analytics.pro.do, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cdo<T extends Cdo<?, ?>, F extends dl> implements de<T, F> {
    private static final Map<Class<? extends el>, em> c;
    protected Object a;
    protected F b;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.do$a */
    /* JADX INFO: compiled from: obf */
    public static class a extends en<Cdo> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ed edVar, Cdo cdo) {
            cdo.b = null;
            cdo.a = null;
            edVar.j();
            dy dyVarL = edVar.l();
            Object objA = cdo.a(edVar, dyVarL);
            cdo.a = objA;
            if (objA != null) {
                cdo.b = (F) cdo.a(dyVarL.c);
            }
            edVar.m();
            edVar.l();
            edVar.k();
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ed edVar, Cdo cdo) throws ee {
            if (cdo.a() == null || cdo.b() == null) {
                throw new ee("Cannot write a TUnion with no set value!");
            }
            edVar.a(cdo.d());
            edVar.a(cdo.c(cdo.b));
            cdo.a(edVar);
            edVar.c();
            edVar.d();
            edVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.do$b */
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

    /* JADX INFO: renamed from: com.umeng.analytics.pro.do$c */
    /* JADX INFO: compiled from: obf */
    public static class c extends eo<Cdo> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ed edVar, Cdo cdo) {
            cdo.b = null;
            cdo.a = null;
            short sV = edVar.v();
            Object objA = cdo.a(edVar, sV);
            cdo.a = objA;
            if (objA != null) {
                cdo.b = (F) cdo.a(sV);
            }
        }

        @Override // com.umeng.analytics.pro.el
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ed edVar, Cdo cdo) throws ee {
            if (cdo.a() == null || cdo.b() == null) {
                throw new ee("Cannot write a TUnion with no set value!");
            }
            edVar.a(cdo.b.a());
            cdo.b(edVar);
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.do$d */
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
        c = map;
        map.put(en.class, new b());
        map.put(eo.class, new d());
    }

    public Cdo() {
        this.b = null;
        this.a = null;
    }

    private static Object a(Object obj) {
        if (obj instanceof de) {
            return ((de) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return df.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    public abstract F a(short s);

    public abstract Object a(ed edVar, dy dyVar);

    public abstract Object a(ed edVar, short s);

    public abstract void a(ed edVar);

    public Object b() {
        return this.a;
    }

    public abstract void b(F f, Object obj);

    public abstract void b(ed edVar);

    public abstract dy c(F f);

    public boolean c() {
        return this.b != null;
    }

    @Override // com.umeng.analytics.pro.de
    public final void clear() {
        this.b = null;
        this.a = null;
    }

    public abstract ei d();

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        c.get(edVar.D()).b().b(edVar, this);
    }

    public String toString() {
        StringBuilder sbM4753 = AbstractC2784.m4753("<");
        sbM4753.append(getClass().getSimpleName());
        sbM4753.append(" ");
        if (a() != null) {
            Object objB = b();
            sbM4753.append(c(a()).a);
            sbM4753.append(":");
            if (objB instanceof ByteBuffer) {
                df.a((ByteBuffer) objB, sbM4753);
            } else {
                sbM4753.append(objB.toString());
            }
        }
        sbM4753.append(">");
        return sbM4753.toString();
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        c.get(edVar.D()).b().a(edVar, this);
    }

    public boolean b(F f) {
        return this.b == f;
    }

    public boolean b(int i) {
        return b(a((short) i));
    }

    public Cdo(F f, Object obj) {
        a(f, obj);
    }

    public Cdo(Cdo<T, F> cdo) {
        if (cdo.getClass().equals(getClass())) {
            this.b = cdo.b;
            this.a = a(cdo.a);
            return;
        }
        throw new ClassCastException();
    }

    private static Map a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(a(entry.getKey()), a(entry.getValue()));
        }
        return map2;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.b;
    }

    public Object a(F f) {
        if (f == this.b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.b);
    }

    public Object a(int i) {
        return a(a((short) i));
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.b = f;
        this.a = obj;
    }

    public void a(int i, Object obj) {
        a(a((short) i), obj);
    }
}
