package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.Primitive;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ要点脸能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0168Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashSet f1352Ujhhgtgfeyxiexzf;

    public C0168Ujhhgtgfeyxiexzf() {
        HashSet hashSet = new HashSet();
        this.f1352Ujhhgtgfeyxiexzf = hashSet;
        hashSet.add(new C0165Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m1215Ujhhgtgfeyxiexzf(Class cls, Object[] objArr) throws C1091feyxiexzfUjhhgtg {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1087feyxiexzfUjhhgtg) it.next()).mo1211Ujhhgtgfeyxiexzf(cls)) {
                int i = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                throw new C1091feyxiexzfUjhhgtg("Can't call this construct: new " + cls.getName() + "(" + C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(objArrUnwrap) + ")");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1216Ujhhgtgfeyxiexzf() {
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((InterfaceC1087feyxiexzfUjhhgtg) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m1217Ujhhgtgfeyxiexzf(Class cls, String str) {
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1087feyxiexzfUjhhgtg) it.next()).mo1210Ujhhgtgfeyxiexzf(cls, str)) {
                int i = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                throw new C1091feyxiexzfUjhhgtg("Can't get this static field: " + cls.getTypeName() + "." + str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m1218Ujhhgtgfeyxiexzf(Object obj, String str, Object[] objArr) {
        Object[] objArr2;
        Object[] objArrCopyOfRange;
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1087feyxiexzfUjhhgtg) it.next()).mo1214Ujhhgtgfeyxiexzf(obj)) {
                int i = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                String typeName = obj.getClass().getTypeName();
                String strM2566Ujhhgtgfeyxiexzf = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(objArrUnwrap);
                StringBuilder sb = new StringBuilder("Can't invoke this method: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append("(");
                throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, strM2566Ujhhgtgfeyxiexzf, ")"));
            }
        }
        if (str.equals("set") && objArrUnwrap.length == 2 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            Object obj2 = objArrUnwrap[1];
            Object[] objArr3 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (Modifier.isStatic(field.getModifiers())) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    m1221Ujhhgtgfeyxiexzf(obj2, declaringClass, name);
                } catch (C1091feyxiexzfUjhhgtg unused) {
                    int i2 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                    String typeName2 = declaringClass.getTypeName();
                    String strM2566Ujhhgtgfeyxiexzf2 = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(new Object[]{obj2});
                    StringBuilder sb2 = new StringBuilder("Can't set this static field using reflection: ");
                    sb2.append(typeName2);
                    sb2.append(".");
                    sb2.append(name);
                    sb2.append(" (");
                    throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb2, strM2566Ujhhgtgfeyxiexzf2, ")"));
                }
            } else {
                Object obj3 = objArrUnwrap[0];
                try {
                    m1220Ujhhgtgfeyxiexzf(obj3, name, obj2);
                } catch (C1091feyxiexzfUjhhgtg unused2) {
                    int i3 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                    String typeName3 = obj3.getClass().getTypeName();
                    String strM2566Ujhhgtgfeyxiexzf3 = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(new Object[]{obj2});
                    StringBuilder sb3 = new StringBuilder("Can't set this field using reflection: ");
                    sb3.append(typeName3);
                    sb3.append(".");
                    sb3.append(name);
                    sb3.append(" (");
                    throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb3, strM2566Ujhhgtgfeyxiexzf3, ")"));
                }
            }
        }
        if (str.equals("get") && objArrUnwrap.length == 1 && (obj instanceof Field)) {
            Field field2 = (Field) obj;
            String name2 = field2.getName();
            Object[] objArr4 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (Modifier.isStatic(field2.getModifiers())) {
                Class<?> declaringClass2 = field2.getDeclaringClass();
                try {
                    m1217Ujhhgtgfeyxiexzf(declaringClass2, name2);
                } catch (C1091feyxiexzfUjhhgtg unused3) {
                    int i4 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                    throw new C1091feyxiexzfUjhhgtg("Can't get this static field using reflection: " + declaringClass2.getTypeName() + "." + name2);
                }
            } else {
                Object obj4 = objArrUnwrap[0];
                try {
                    m1216Ujhhgtgfeyxiexzf();
                } catch (C1091feyxiexzfUjhhgtg unused4) {
                    throw C1091feyxiexzfUjhhgtg.m2568Ujhhgtgfeyxiexzf(obj4, name2);
                }
            }
        }
        if ((obj instanceof Class) && str.equals("newInstance")) {
            Class cls = (Class) obj;
            Object[] objArr5 = new Object[0];
            try {
                m1215Ujhhgtgfeyxiexzf(cls, objArr5);
            } catch (C1091feyxiexzfUjhhgtg unused5) {
                throw C1091feyxiexzfUjhhgtg.m2567Ujhhgtgfeyxiexzf(cls, objArr5);
            }
        } else if ((obj instanceof Constructor) && str.equals("newInstance")) {
            Class declaringClass3 = ((Constructor) obj).getDeclaringClass();
            if (objArrUnwrap.length == 1) {
                Object obj5 = objArrUnwrap[0];
                if (obj5 instanceof Object[]) {
                    objArr2 = (Object[]) obj5;
                } else {
                    objArr2 = objArrUnwrap;
                }
            } else {
                objArr2 = objArrUnwrap;
            }
            try {
                m1215Ujhhgtgfeyxiexzf(declaringClass3, objArr2);
            } catch (C1091feyxiexzfUjhhgtg unused6) {
                throw C1091feyxiexzfUjhhgtg.m2567Ujhhgtgfeyxiexzf(declaringClass3, objArr2);
            }
        }
        if (str.equals("invoke") && objArrUnwrap.length != 0 && (obj instanceof Method)) {
            Method method = (Method) obj;
            String name3 = method.getName();
            if (objArrUnwrap.length == 2) {
                Object obj6 = objArrUnwrap[1];
                if (obj6 instanceof Object[]) {
                    objArrCopyOfRange = (Object[]) obj6;
                } else {
                    objArrCopyOfRange = Arrays.copyOfRange(objArrUnwrap, 1, objArrUnwrap.length);
                }
            } else {
                objArrCopyOfRange = Arrays.copyOfRange(objArrUnwrap, 1, objArrUnwrap.length);
            }
            Object[] objArr6 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> declaringClass4 = method.getDeclaringClass();
                try {
                    m1219Ujhhgtgfeyxiexzf(declaringClass4, name3, objArrCopyOfRange);
                    return;
                } catch (C1091feyxiexzfUjhhgtg unused7) {
                    int i5 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                    String typeName4 = declaringClass4.getTypeName();
                    String strM2566Ujhhgtgfeyxiexzf4 = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(objArrCopyOfRange);
                    StringBuilder sb4 = new StringBuilder("Can't invoke this static method using reflection: ");
                    sb4.append(typeName4);
                    sb4.append(".");
                    sb4.append(name3);
                    sb4.append("(");
                    throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb4, strM2566Ujhhgtgfeyxiexzf4, ")"));
                }
            }
            Object obj7 = objArrUnwrap[0];
            try {
                m1218Ujhhgtgfeyxiexzf(obj7, name3, objArrCopyOfRange);
            } catch (C1091feyxiexzfUjhhgtg unused8) {
                int i6 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                String typeName5 = obj7.getClass().getTypeName();
                String strM2566Ujhhgtgfeyxiexzf5 = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(objArrCopyOfRange);
                StringBuilder sb5 = new StringBuilder("Can't invoke this method using reflection: ");
                sb5.append(typeName5);
                sb5.append(".");
                sb5.append(name3);
                sb5.append("(");
                throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb5, strM2566Ujhhgtgfeyxiexzf5, ")"));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m1219Ujhhgtgfeyxiexzf(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((InterfaceC1087feyxiexzfUjhhgtg) it.next()).getClass();
        }
        if (str.equals("getLength") && objArrUnwrap.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArrUnwrap[0];
            try {
                m1216Ujhhgtgfeyxiexzf();
            } catch (C1091feyxiexzfUjhhgtg unused) {
                throw C1091feyxiexzfUjhhgtg.m2568Ujhhgtgfeyxiexzf(obj, "length");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1220Ujhhgtgfeyxiexzf(Object obj, String str, Object obj2) throws C1091feyxiexzfUjhhgtg {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1087feyxiexzfUjhhgtg) it.next()).mo1212Ujhhgtgfeyxiexzf(obj)) {
                int i = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                String typeName = obj.getClass().getTypeName();
                String strM2566Ujhhgtgfeyxiexzf = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(new Object[]{objUnwrap});
                StringBuilder sb = new StringBuilder("Can't set this field: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append(" (");
                throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, strM2566Ujhhgtgfeyxiexzf, ")"));
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1221Ujhhgtgfeyxiexzf(Object obj, Class cls, String str) throws C1091feyxiexzfUjhhgtg {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator it = this.f1352Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC1087feyxiexzfUjhhgtg) it.next()).mo1213Ujhhgtgfeyxiexzf(cls, str)) {
                int i = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                String typeName = cls.getTypeName();
                String strM2566Ujhhgtgfeyxiexzf = C1091feyxiexzfUjhhgtg.m2566Ujhhgtgfeyxiexzf(new Object[]{objUnwrap});
                StringBuilder sb = new StringBuilder("Can't set this static field: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append(" (");
                throw new C1091feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, strM2566Ujhhgtgfeyxiexzf, ")"));
            }
        }
    }
}
