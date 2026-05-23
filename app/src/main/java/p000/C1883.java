package p000;

import bsh.AbstractC0009;
import bsh.Primitive;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲇᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1883 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashSet f6229;

    public C1883() {
        HashSet hashSet = new HashSet();
        this.f6229 = hashSet;
        hashSet.add(new C1882());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3663(Class cls, Object[] objArr) throws C2644 {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2645) it.next()).mo3659(cls)) {
                int i = 0;
                throw new C2644("Can't call this construct: new " + cls.getName() + "(" + C2644.m4640(objArrUnwrap) + ")");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3664() {
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3665(Class cls, String str) {
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2645) it.next()).mo3658(cls, str)) {
                int i = 0;
                throw new C2644("Can't get this static field: " + cls.getTypeName() + "." + str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m3666(Object obj, String str, Object[] objArr) {
        Object[] objArr2;
        Object[] objArrCopyOfRange;
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2645) it.next()).mo3662(obj)) {
                int i = 0;
                String typeName = obj.getClass().getTypeName();
                String strM4640 = C2644.m4640(objArrUnwrap);
                StringBuilder sb = new StringBuilder("Can't invoke this method: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append("(");
                throw new C2644(AbstractC2784.m4752(sb, strM4640, ")"));
            }
        }
        if (str.equals("set") && objArrUnwrap.length == 2 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            Object obj2 = objArrUnwrap[1];
            Object[] objArr3 = AbstractC0009.f516;
            if (Modifier.isStatic(field.getModifiers())) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    m3669(obj2, declaringClass, name);
                } catch (C2644 unused) {
                    int i2 = 0;
                    String typeName2 = declaringClass.getTypeName();
                    String strM4641 = C2644.m4640(new Object[]{obj2});
                    StringBuilder sb2 = new StringBuilder("Can't set this static field using reflection: ");
                    sb2.append(typeName2);
                    sb2.append(".");
                    sb2.append(name);
                    sb2.append(" (");
                    throw new C2644(AbstractC2784.m4752(sb2, strM4641, ")"));
                }
            } else {
                Object obj3 = objArrUnwrap[0];
                try {
                    m3668(obj3, name, obj2);
                } catch (C2644 unused2) {
                    int i3 = 0;
                    String typeName3 = obj3.getClass().getTypeName();
                    String strM4642 = C2644.m4640(new Object[]{obj2});
                    StringBuilder sb3 = new StringBuilder("Can't set this field using reflection: ");
                    sb3.append(typeName3);
                    sb3.append(".");
                    sb3.append(name);
                    sb3.append(" (");
                    throw new C2644(AbstractC2784.m4752(sb3, strM4642, ")"));
                }
            }
        }
        if (str.equals("get") && objArrUnwrap.length == 1 && (obj instanceof Field)) {
            Field field2 = (Field) obj;
            String name2 = field2.getName();
            Object[] objArr4 = AbstractC0009.f516;
            if (Modifier.isStatic(field2.getModifiers())) {
                Class<?> declaringClass2 = field2.getDeclaringClass();
                try {
                    m3665(declaringClass2, name2);
                } catch (C2644 unused3) {
                    int i4 = 0;
                    throw new C2644("Can't get this static field using reflection: " + declaringClass2.getTypeName() + "." + name2);
                }
            } else {
                Object obj4 = objArrUnwrap[0];
                try {
                    m3664();
                } catch (C2644 unused4) {
                    throw C2644.m4642(obj4, name2);
                }
            }
        }
        if ((obj instanceof Class) && str.equals("newInstance")) {
            Class cls = (Class) obj;
            Object[] objArr5 = new Object[0];
            try {
                m3663(cls, objArr5);
            } catch (C2644 unused5) {
                throw C2644.m4641(cls, objArr5);
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
                m3663(declaringClass3, objArr2);
            } catch (C2644 unused6) {
                throw C2644.m4641(declaringClass3, objArr2);
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
                    objArrCopyOfRange = Arrays.copyOfRange(objArrUnwrap, 1, 2);
                }
            } else {
                objArrCopyOfRange = Arrays.copyOfRange(objArrUnwrap, 1, objArrUnwrap.length);
            }
            Object[] objArr6 = AbstractC0009.f516;
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> declaringClass4 = method.getDeclaringClass();
                try {
                    m3667(declaringClass4, name3, objArrCopyOfRange);
                    return;
                } catch (C2644 unused7) {
                    int i5 = 0;
                    String typeName4 = declaringClass4.getTypeName();
                    String strM4643 = C2644.m4640(objArrCopyOfRange);
                    StringBuilder sb4 = new StringBuilder("Can't invoke this static method using reflection: ");
                    sb4.append(typeName4);
                    sb4.append(".");
                    sb4.append(name3);
                    sb4.append("(");
                    throw new C2644(AbstractC2784.m4752(sb4, strM4643, ")"));
                }
            }
            Object obj7 = objArrUnwrap[0];
            try {
                m3666(obj7, name3, objArrCopyOfRange);
            } catch (C2644 unused8) {
                int i6 = 0;
                String typeName5 = obj7.getClass().getTypeName();
                String strM4644 = C2644.m4640(objArrCopyOfRange);
                StringBuilder sb5 = new StringBuilder("Can't invoke this method using reflection: ");
                sb5.append(typeName5);
                sb5.append(".");
                sb5.append(name3);
                sb5.append("(");
                throw new C2644(AbstractC2784.m4752(sb5, strM4644, ")"));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m3667(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            
        }
        if (str.equals("getLength") && objArrUnwrap.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArrUnwrap[0];
            try {
                m3664();
            } catch (C2644 unused) {
                throw C2644.m4642(obj, "length");
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3668(Object obj, String str, Object obj2) throws C2644 {
        Object objUnwrap = Primitive.unwrap(obj2);
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2645) it.next()).mo3660(obj)) {
                int i = 0;
                String typeName = obj.getClass().getTypeName();
                String strM4640 = C2644.m4640(new Object[]{objUnwrap});
                StringBuilder sb = new StringBuilder("Can't set this field: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append(" (");
                throw new C2644(AbstractC2784.m4752(sb, strM4640, ")"));
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3669(Object obj, Class cls, String str) throws C2644 {
        Object objUnwrap = Primitive.unwrap(obj);
        Iterator it = this.f6229.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC2645) it.next()).mo3661(cls, str)) {
                int i = 0;
                String typeName = cls.getTypeName();
                String strM4640 = C2644.m4640(new Object[]{objUnwrap});
                StringBuilder sb = new StringBuilder("Can't set this static field: ");
                sb.append(typeName);
                sb.append(".");
                sb.append(str);
                sb.append(" (");
                throw new C2644(AbstractC2784.m4752(sb, strM4640, ")"));
            }
        }
    }
}
