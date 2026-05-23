package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᲀᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3546 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0264 f11137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0264 f11138;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0264 f11139;

    public AbstractC3546(C0264 c0264, C0264 c0265, C0264 c0266) {
        this.f11137 = c0264;
        this.f11138 = c0265;
        this.f11139 = c0266;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public abstract C3547 mo5133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Class m5134(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0264 c0264 = this.f11139;
        Class cls2 = (Class) c0264.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0264.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Method m5135(String str) throws NoSuchMethodException {
        C0264 c0264 = this.f11137;
        Method method = (Method) c0264.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3546.class.getClassLoader()).getDeclaredMethod("read", AbstractC3546.class);
        c0264.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Method m5136(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0264 c0264 = this.f11138;
        Method method = (Method) c0264.get(name);
        if (method != null) {
            return method;
        }
        Class clsM5134 = m5134(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM5134.getDeclaredMethod("write", cls, AbstractC3546.class);
        c0264.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public abstract boolean mo5137(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Parcelable m5138(Parcelable parcelable, int i) {
        if (!mo5137(i)) {
            return parcelable;
        }
        return ((C3547) this).f11141.readParcelable(C3547.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3548 m5139() {
        String string = ((C3547) this).f11141.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC3548) m5135(string).invoke(null, mo5133());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public abstract void mo5140(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m5141(InterfaceC3548 interfaceC3548) {
        if (interfaceC3548 == null) {
            ((C3547) this).f11141.writeString(null);
            return;
        }
        try {
            ((C3547) this).f11141.writeString(m5134(interfaceC3548.getClass()).getName());
            C3547 c3547Mo5133 = mo5133();
            try {
                m5136(interfaceC3548.getClass()).invoke(null, interfaceC3548, c3547Mo5133);
                Parcel parcel = c3547Mo5133.f11141;
                int i = c3547Mo5133.f11145;
                if (i >= 0) {
                    int i2 = c3547Mo5133.f11140.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC3548.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
