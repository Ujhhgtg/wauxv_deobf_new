package bsh;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC1687;
import p000.AbstractC2240;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0278;
import p000.C0458;
import p000.C0461;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1328_InputStreamReader_UTF8;
import p000.C1684;
import p000.C2573;
import p000.C3581;
import p000.InterfaceC0455;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0012 implements Serializable, InterfaceC0455, Cloneable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static final C0012 f519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f520;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0012 f521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public HashMap f522 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public HashMap f523 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public HashMap f524 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ArrayList f525 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f526 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ArrayList f527 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ArrayList f528 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public String f529;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public transient C0458 f530;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public This f531;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public HashMap f532;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public Node f533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public boolean f534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public boolean f536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public boolean f537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public Class f538;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public Object f539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public transient HashMap f540;

    static {
        C0012 c0012 = new C0012(null, null, "Called from compiled Java code.");
        f519 = c0012;
        c0012.f534 = true;
    }

    public C0012(C0012 c0012, C0458 c0458, String str) {
        new ArrayList();
        this.f532 = new HashMap();
        this.f540 = new HashMap();
        this.f520 = str;
        this.f521 = c0012;
        if (c0012 == null) {
            m383();
        }
        this.f530 = c0458;
        m365().mo302(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f540 = new HashMap();
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.f532.clear();
        objectOutputStream.defaultWriteObject();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m361(List list, Class cls, ArrayList arrayList) {
        Class<?> cls2;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BshMethod bshMethod = (BshMethod) it.next();
            if (bshMethod.isExtension && (cls2 = bshMethod.receiverType) != null && AbstractC0017.m573(cls2, cls)) {
                arrayList.add(bshMethod);
            }
        }
    }

    @Override // p000.InterfaceC0455
    public final void classLoaderChanged() {
        m385();
    }

    public final void clear() {
        this.f522.clear();
        this.f523.clear();
        this.f524.clear();
        this.f525.clear();
        this.f526.clear();
        this.f527.clear();
        if (this.f521 == null) {
            m383();
        }
        this.f540.clear();
        this.f532.clear();
    }

    public final String toString() {
        String strM4786;
        StringBuilder sb = new StringBuilder("NameSpace: ");
        if (this.f520 == null) {
            strM4786 = super.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f520);
            sb2.append(" (");
            strM4786 = AbstractC2844.m4786(sb2, super.toString(), ")");
        }
        sb.append(strM4786);
        sb.append(this.f535 ? " (class) " : "");
        sb.append(this.f536 ? " (interface) " : "");
        sb.append(this.f537 ? " (enum) " : "");
        sb.append(this.f534 ? " (method) " : "");
        sb.append(this.f538 != null ? " (class static) " : "");
        sb.append(this.f539 != null ? " (class instance) " : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0012 m362() {
        try {
            C0012 c0012 = (C0012) clone();
            HashMap map = null;
            c0012.f531 = null;
            HashMap map2 = this.f522;
            c0012.f522 = map2 == null ? null : new HashMap(map2);
            HashMap map3 = this.f523;
            c0012.f523 = map3 == null ? null : new HashMap(map3);
            HashMap map4 = this.f524;
            c0012.f524 = map4 == null ? null : new HashMap(map4);
            ArrayList arrayList = this.f525;
            c0012.f525 = arrayList == null ? null : new ArrayList(arrayList);
            ArrayList arrayList2 = this.f526;
            c0012.f526 = arrayList2 == null ? null : new ArrayList(arrayList2);
            ArrayList arrayList3 = this.f527;
            c0012.f527 = arrayList3 == null ? null : new ArrayList(arrayList3);
            ArrayList arrayList4 = this.f528;
            c0012.f528 = arrayList4 == null ? null : new ArrayList(arrayList4);
            HashMap map5 = this.f532;
            if (map5 != null) {
                map = new HashMap(map5);
            }
            c0012.f532 = map;
            return c0012;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[EDGE_INSN: B:18:0x004f->B:30:0x009a BREAK  A[LOOP:1: B:20:0x0057->B:65:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a A[RETURN] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Class m363(String str) {
        Class clsMo303;
        String strMo307;
        Class clsMo304;
        Class<?> clsLoadClass;
        if (this.f540.containsKey(str)) {
            clsMo303 = (Class) this.f540.get(str);
        } else if (C0010.m350(str)) {
            clsMo303 = m365().mo303(str);
            if (clsMo303 == null) {
                RunnableC0008.m333("getClass(): ", str, " not found in ", this);
                clsMo303 = null;
            }
        } else {
            String str2 = (String) this.f524.get(str);
            if (str2 == null) {
                Iterator it = this.f525.iterator();
                do {
                    if (!it.hasNext()) {
                        C0458 c0458M365 = m365();
                        if (c0458M365.mo309() && (strMo307 = c0458M365.mo307(str)) != null) {
                            clsMo304 = m365().mo303(strMo307);
                            break;
                        }
                        clsMo304 = null;
                        break;
                    }
                    clsMo304 = m365().mo303(((String) it.next()) + "." + str);
                } while (clsMo304 == null);
            } else {
                clsMo304 = m365().mo303(str2);
                if (clsMo304 == null) {
                    if (C0010.m350(str2)) {
                        try {
                            clsMo304 = m372(str2).m358();
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    RunnableC0008.m333("imported unpackaged name not found:", str2);
                    if (clsMo304 == null) {
                        clsMo304 = null;
                        break;
                    }
                    m365().m1830(clsMo304, str2);
                }
            }
            clsMo303 = clsMo304 == null ? m365().mo303(str) : clsMo304;
            if (clsMo303 != null) {
                this.f540.put(str, clsMo303);
            } else {
                clsMo303 = m365().mo303(str);
                if (clsMo303 == null) {
                    RunnableC0008.m333("getClass(): ", str, " not found in ", this);
                    clsMo303 = null;
                }
            }
        }
        if (clsMo303 != null) {
            return clsMo303;
        }
        C0012 c0012 = this.f521;
        if (c0012 != null) {
            return c0012.m363(str);
        }
        Iterator it2 = ((HashSet) this.f530.f2068.f1117).iterator();
        while (it2.hasNext()) {
            try {
                clsLoadClass = ((ClassLoader) it2.next()).loadClass(str);
                if (clsLoadClass != null) {
                    return clsLoadClass;
                }
                return null;
            } catch (ClassNotFoundException unused2) {
            }
        }
        System.err.println("[BeanShell] GetLoaderClass: " + str + " is null");
        clsLoadClass = null;
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object m364() throws C3581 {
        Object obj = this.f539;
        if (obj != null) {
            return obj;
        }
        if (this.f538 != null) {
            throw new C3581("Can't refer to class instance from static context.");
        }
        throw new C1684("Can't resolve class instance 'this' in: " + this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0458 m365() {
        C0458 c0458 = this.f530;
        if (c0458 != null) {
            return c0458;
        }
        C0012 c0012 = this.f521;
        if (c0012 != null && c0012 != f519) {
            return c0012.m365();
        }
        C0458 c0458M1829 = C0458.m1829(null);
        this.f530 = c0458M1829;
        return c0458M1829;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object m366(String str, Class[] clsArr, RunnableC0008 runnableC0008) {
        String str2;
        Class[] clsArr2;
        RunnableC0008 runnableC0009;
        String strM4786;
        RunnableC0008.m333("Get command: ", str);
        C0458 c0458M365 = runnableC0008.f505.m365();
        for (String str3 : this.f526) {
            String str4 = str3.equals("/") ? str3 + str + ".bsh" : str3 + "/" + str + ".bsh";
            RunnableC0008.m333(AbstractC2844.m4790("searching for script: ", str4));
            URL urlMo308 = c0458M365.mo308(str4);
            if (urlMo308 != null) {
                try {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC0009 = runnableC0008;
                    try {
                        return m384((InputStream) urlMo308.getContent(), str2, clsArr2, str4, runnableC0009);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC0009 = runnableC0008;
                }
            } else {
                str2 = str;
                clsArr2 = clsArr;
                runnableC0009 = runnableC0008;
            }
            if (str3.equals("/")) {
                strM4786 = str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str3.substring(1).replace('/', '.'));
                strM4786 = AbstractC2844.m4786(sb, ".", str2);
            }
            RunnableC0008.m333(AbstractC2844.m4790("searching for class: ", strM4786));
            Class clsMo303 = c0458M365.mo303(strM4786);
            if (clsMo303 != null) {
                return clsMo303;
            }
            str = str2;
            clsArr = clsArr2;
            runnableC0008 = runnableC0009;
        }
        String str5 = str;
        Class[] clsArr3 = clsArr;
        RunnableC0008 runnableC00010 = runnableC0008;
        C0012 c0012 = this.f521;
        if (c0012 != null) {
            return c0012.m366(str5, clsArr3, runnableC00010);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final BshMethod m367(Class cls, String str, Class[] clsArr) {
        int iIntValue;
        Class<?> cls2;
        Class<?> cls3;
        ArrayList arrayList = new ArrayList();
        for (C0012 c0012 = this; c0012 != null; c0012 = c0012.f521) {
            m361((List) c0012.f523.get(str), cls, arrayList);
            for (Object obj : c0012.f527) {
                if (obj != null) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && AbstractC0016.m546(superclass); superclass = superclass.getSuperclass()) {
                        This thisM526 = AbstractC0016.m526(obj, superclass.getSimpleName());
                        if (thisM526 != null) {
                            m361((List) thisM526.getNameSpace().f523.get(str), cls, arrayList);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object[] objArr = AbstractC0016.f568;
        RunnableC0008.m333("find most specific extension method for: receiver: " + cls + " args: " + Arrays.toString(clsArr));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            BshMethod bshMethod = (BshMethod) arrayList.get(i);
            if (bshMethod.isExtension && (cls3 = bshMethod.receiverType) != null && AbstractC0017.m573(cls3, cls)) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        if (arrayList2.isEmpty()) {
            iIntValue = -1;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                Integer num = (Integer) arrayList2.get(i2);
                Class<?> cls4 = ((BshMethod) arrayList.get(num.intValue())).receiverType;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i2 != i3 && cls4 != (cls2 = ((BshMethod) arrayList.get(((Integer) arrayList2.get(i3)).intValue())).receiverType) && cls4.isAssignableFrom(cls2)) {
                        arrayList3.remove(num);
                        break;
                    }
                }
            }
            if (arrayList3.size() == 1) {
                iIntValue = ((Integer) arrayList3.get(0)).intValue();
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add((BshMethod) arrayList.get(((Integer) it.next()).intValue()));
                }
                int iM523 = AbstractC0016.m523(clsArr, arrayList4);
                iIntValue = iM523 >= 0 ? ((Integer) arrayList3.get(iM523)).intValue() : ((Integer) arrayList3.get(0)).intValue();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        return (BshMethod) arrayList.get(iIntValue);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final This m368(RunnableC0008 runnableC0008) {
        C0012 c0012 = this.f521;
        return c0012 != null ? c0012.m368(runnableC0008) : mo313(runnableC0008);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final BshMethod m369(String str, Class[] clsArr) {
        for (Object obj : this.f527) {
            AbstractC1687 abstractC1687M551 = AbstractC0016.m551(obj.getClass(), str, clsArr, false);
            if (abstractC1687M551 != null) {
                return new BshMethod(abstractC1687M551, obj);
            }
        }
        Iterator it = this.f528.iterator();
        while (it.hasNext()) {
            AbstractC1687 abstractC1687M552 = AbstractC0016.m551((Class) it.next(), str, clsArr, true);
            if (abstractC1687M552 != null) {
                return new BshMethod(abstractC1687M552, (Object) null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final BshMethod m370(String str, Class[] clsArr, boolean z) {
        C0012 c0012;
        RunnableC0008.m333("Get method: ", str, " ", this);
        BshMethod bshMethod = null;
        BshMethod bshMethodM369 = (!this.f535 || this.f537 || z) ? null : m369(str, clsArr);
        if (bshMethodM369 == null && this.f523.containsKey(str)) {
            List<BshMethod> list = (List) this.f523.get(str);
            ArrayList arrayList = new ArrayList(list.size());
            for (BshMethod bshMethod2 : list) {
                if (!bshMethod2.isExtension) {
                    arrayList.add(bshMethod2);
                }
            }
            if (!arrayList.isEmpty()) {
                Object[] objArr = AbstractC0016.f568;
                RunnableC0008.m333("find most specific BshMethod for: " + Arrays.toString(clsArr));
                int iM523 = AbstractC0016.m523(clsArr, arrayList);
                if (iM523 != -1) {
                    bshMethod = (BshMethod) arrayList.get(iM523);
                }
            }
            bshMethodM369 = bshMethod;
        }
        if (bshMethodM369 == null && !this.f535 && !z) {
            bshMethodM369 = m369(str, clsArr);
        }
        return (bshMethodM369 != null || z || (c0012 = this.f521) == null) ? bshMethodM369 : c0012.m370(str, clsArr, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final BshMethod[] m371() {
        return (BshMethod[]) this.f523.values().stream().flatMap(new C0278(15)).toArray(new C0461(6));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0010 m372(String str) {
        if (!this.f532.containsKey(str)) {
            HashMap map = this.f532;
            C0010 c0010 = new C0010();
            c0010.f511 = this;
            c0010.f512 = str;
            map.put(str, c0010);
        }
        return (C0010) this.f532.get(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Node m373() {
        Node node = this.f533;
        if (node != null) {
            return node;
        }
        C0012 c0012 = this.f521;
        if (c0012 != null) {
            return c0012.m373();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String m374() {
        String str = this.f529;
        if (str != null) {
            return str;
        }
        C0012 c0012 = this.f521;
        if (c0012 != null) {
            return c0012.m374();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Object m375(String str, RunnableC0008 runnableC0008) throws C3581 {
        String strM521 = AbstractC0016.m521("get", str);
        Class[] clsArr = AbstractC0016.f569;
        BshMethod bshMethodM370 = m370(strM521, clsArr, false);
        try {
            if (bshMethodM370 != null) {
                return bshMethodM370.invoke(null, runnableC0008);
            }
            BshMethod bshMethodM371 = m370(AbstractC0016.m521("is", str), clsArr, false);
            return (bshMethodM371 == null || bshMethodM371.getReturnType() != Boolean.TYPE) ? Primitive.VOID : bshMethodM371.invoke(null, runnableC0008);
        } catch (C1231 e) {
            throw new C3581("'This' property accessor threw exception: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public This mo312(RunnableC0008 runnableC0008) {
        Class cls;
        if (this.f535 && (cls = this.f538) != null) {
            Class superclass = cls.getSuperclass();
            if (AbstractC0016.m546(superclass)) {
                return AbstractC0016.m526(this.f539, superclass.getSimpleName());
            }
        }
        C0012 c0012 = this.f521;
        if (c0012 != null) {
            return c0012.f535 ? c0012.mo312(runnableC0008) : c0012.mo313(runnableC0008);
        }
        return mo313(runnableC0008);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public This mo313(RunnableC0008 runnableC0008) {
        if (this.f531 == null) {
            this.f531 = This.getThis(this, runnableC0008);
        }
        return this.f531;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final Object m376(String str, boolean z) {
        Variable variableM377 = m377(str, z);
        RunnableC0008.m333("Get variable: ", str, " = ", variableM377);
        return variableM377 == null ? Primitive.VOID : variableM377.getValue();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final Variable m377(String str, boolean z) {
        AbstractC1687 abstractC1687M549;
        C0012 c0012;
        AbstractC1687 abstractC1687M5410;
        This thisM526;
        if (this.f522.containsKey(str)) {
            return (Variable) this.f522.get(str);
        }
        Iterator it = this.f527.iterator();
        Variable variable = null;
        Variable variable2 = null;
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = this.f528.iterator();
                while (it2.hasNext()) {
                    try {
                        abstractC1687M549 = AbstractC0016.m549((Class) it2.next(), str, true);
                    } catch (C2573 unused) {
                        abstractC1687M549 = null;
                    }
                    if (abstractC1687M549 != null) {
                        variable2 = new Variable(str, (Class<?>) abstractC1687M549.mo2461(), new LHS(abstractC1687M549));
                        this.f522.put(str, variable2);
                    }
                }
                break;
            }
            Object next = it.next();
            try {
                abstractC1687M5410 = AbstractC0016.m549(next.getClass(), str, false);
            } catch (C2573 unused2) {
                abstractC1687M5410 = null;
            }
            if (abstractC1687M5410 != null) {
                variable2 = new Variable(str, (Class<?>) abstractC1687M5410.mo2461(), new LHS(next, abstractC1687M5410));
            } else if (this.f535) {
                Class<?> superclass = next.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!AbstractC0016.m546(superclass) || ((thisM526 = AbstractC0016.m526(next, superclass.getSimpleName())) != null && (variable2 = (Variable) thisM526.getNameSpace().f522.get(str)) != null)) {
                        break;
                    }
                }
            }
            if (variable2 != null) {
                this.f522.put(str, variable2);
            }
            variable = variable2;
            break;
        }
        return (z && variable == null && (c0012 = this.f521) != null) ? c0012.m377(str, z) : variable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final Variable[] m378() {
        return (Variable[]) this.f522.values().stream().toArray(new C0461(4));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public void mo314(String str) {
        this.f524.put(C0010.m352(1, str), str);
        m385();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public void mo315(String str) {
        this.f525.remove(str);
        this.f525.add(0, str);
        m385();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void m379(Class cls) {
        this.f528.remove(cls);
        this.f528.add(0, cls);
        m385();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final Object m380(String str, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean z) throws C1231 {
        String str2;
        C0527 c0528;
        Node node2;
        Class[] clsArrM564 = AbstractC0017.m564(objArr);
        try {
            Object objM366 = m366(str, clsArrM564, runnableC0008);
            if (objM366 != null) {
                if (objM366 instanceof BshMethod) {
                    return ((BshMethod) objM366).invoke(objArr, runnableC0008, c0527, node);
                }
                try {
                    return AbstractC0016.m543((Class) objM366, objArr, runnableC0008, c0527, node);
                } catch (C3581 e) {
                    throw e.mo4678("Error invoking compiled command: ", node, c0527);
                }
            }
            if (z) {
                str2 = str;
                c0528 = c0527;
                node2 = node;
            } else {
                boolean[] zArr = new boolean[1];
                str2 = str;
                c0528 = c0527;
                node2 = node;
                Object objM381 = m381(str2, objArr, runnableC0008, c0528, node2, zArr);
                if (zArr[0]) {
                    return objM381;
                }
            }
            throw new C1232("Command not found: " + AbstractC2240.m4261(str2, clsArrM564), node2, c0528);
        } catch (C3581 e2) {
            throw e2.mo4678("Error loading command: ", node, c0527);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final Object m381(String str, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node, boolean[] zArr) {
        try {
            BshMethod bshMethodM370 = m370("invoke", new Class[]{null, null}, false);
            boolean z = bshMethodM370 != null;
            zArr[0] = z;
            if (z) {
                return bshMethodM370.invoke(new Object[]{str, objArr}, runnableC0008, c0527, node);
            }
            return null;
        } catch (C3581 e) {
            throw e.mo4678("Local method invocation", node, c0527);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m382(C0012 c0012) {
        C0012 c0013 = this.f521;
        if (c0013 != null) {
            return c0013.equals(c0012) || this.f521.m382(c0012);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public final void m383() {
        mo315("org.json");
        mo315("android.widget");
        mo315("android.view");
        mo315("android.text");
        mo315("android.os");
        mo315("android.graphics");
        mo315("android.content");
        mo315("android.app");
        mo315("java.util.stream");
        mo315("java.util.regex");
        mo315("java.util.function");
        mo315("java.util");
        mo315("java.net");
        mo315("java.math");
        mo315("java.io");
        mo315("java.lang");
        String strReplace = "/bsh/commands".replace('.', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        if (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = AbstractC2844.m4778(1, 0, strReplace);
        }
        this.f526.remove(strReplace);
        this.f526.add(0, strReplace);
        m385();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final BshMethod m384(InputStream inputStream, String str, Class[] clsArr, String str2, RunnableC0008 runnableC0008) throws C3581 {
        try {
            C1328_InputStreamReader_UTF8 c1328 = new C1328_InputStreamReader_UTF8(inputStream);
            try {
                runnableC0008.m339(c1328, this, str2);
                c1328.close();
                return m370(str, clsArr, false);
            } catch (Throwable th) {
                try {
                    c1328.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | C1231 e) {
            RunnableC0008.m333(e.toString());
            throw new C3581("Error loading script: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void m385() {
        this.f540.clear();
        this.f532.clear();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public void mo316(BshMethod bshMethod) {
        String name = bshMethod.getName();
        if (!this.f523.containsKey(name)) {
            this.f523.put(name, new ArrayList(1));
        }
        ((List) this.f523.get(name)).remove(bshMethod);
        ((List) this.f523.get(name)).add(0, bshMethod);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m386(String str, Class cls, Object obj, Modifiers modifiers) {
        Variable variableM377 = m377(str, false);
        if (variableM377 == null || variableM377.getType() == null) {
            this.f522.put(str, new Variable(str, (Class<?>) cls, obj, modifiers));
            return;
        }
        if (variableM377.getType() != cls) {
            StringBuilder sbM4625 = AbstractC2647.m4625("Typed variable: ", str, " was previously declared with type: ");
            sbM4625.append(variableM377.getType());
            throw new C3581(sbM4625.toString());
        }
        if (variableM377.modifiers == null) {
            variableM377.modifiers = modifiers;
        }
        variableM377.setValue(obj, 0);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public Variable mo317(String str, Object obj, boolean z) {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        Variable variableM377 = m377(str, z);
        if (variableM377 != null) {
            variableM377.setValue(obj, 1);
            return variableM377;
        }
        Variable variable = new Variable(str, (Class<?>) null, obj, (Modifiers) null);
        this.f522.put(str, variable);
        m385();
        return variable;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m387(Variable variable) {
        if (this.f522.containsKey(variable.getName())) {
            return;
        }
        this.f522.put(variable.getName(), variable);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m388(String str, Object obj, boolean z, boolean z2) throws C3581 {
        if (obj == null) {
            throw new C1684("null variable value");
        }
        Variable variableM377 = m377(str, z2);
        if (variableM377 != null) {
            try {
                variableM377.setValue(obj, 1);
                return;
            } catch (C3581 e) {
                StringBuilder sbM4625 = AbstractC2647.m4625("Variable assignment: ", str, ": ");
                sbM4625.append(e.getMessage());
                throw new C3581(sbM4625.toString(), e);
            }
        }
        if (z) {
            throw new C3581(AbstractC2844.m4790("(Strict Java mode) Assignment to undeclared variable: ", str));
        }
        This r10 = this.f531;
        RunnableC0008 runnableC0008 = r10 != null ? r10.declaringInterpreter : null;
        String strM521 = AbstractC0016.m521("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (m370(strM521, new Class[]{objUnwrap == null ? null : objUnwrap.getClass()}, false) == null) {
            this.f522.put(str, new Variable(str, (Class<?>) null, obj, (Modifiers) null));
            m385();
            return;
        }
        try {
            mo313(runnableC0008).invokeMethod(strM521, new Object[]{obj}, runnableC0008, null, null, false);
        } catch (C1231 e2) {
            throw new C3581("'This' property accessor threw exception: " + e2.getMessage(), e2);
        }
    }
}
