package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲇᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3604 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0274 f11286;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0274 f11287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0274 f11288;

    public AbstractC3604(C0274 c0274, C0274 c0275, C0274 c0276) {
        this.f11286 = c0274;
        this.f11287 = c0275;
        this.f11288 = c0276;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public abstract C3605 mo5139();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Class m5140(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0274 c0274 = this.f11288;
        Class cls2 = (Class) c0274.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0274.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Method m5141(String str) throws NoSuchMethodException {
        C0274 c0274 = this.f11286;
        Method method = (Method) c0274.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3604.class.getClassLoader()).getDeclaredMethod("read", AbstractC3604.class);
        c0274.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Method m5142(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0274 c0274 = this.f11287;
        Method method = (Method) c0274.get(name);
        if (method != null) {
            return method;
        }
        Class clsM5140 = m5140(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM5140.getDeclaredMethod("write", cls, AbstractC3604.class);
        c0274.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public abstract boolean mo5143(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Parcelable m5144(Parcelable parcelable, int i) {
        if (!mo5143(i)) {
            return parcelable;
        }
        return ((C3605) this).f11290.readParcelable(C3605.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3606 m5145() {
        String string = ((C3605) this).f11290.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC3606) m5141(string).invoke(null, mo5139());
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
    public abstract void mo5146(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final void m5147(InterfaceC3606 interfaceC3606) {
        if (interfaceC3606 == null) {
            ((C3605) this).f11290.writeString(null);
            return;
        }
        try {
            ((C3605) this).f11290.writeString(m5140(interfaceC3606.getClass()).getName());
            C3605 c3605Mo5139 = mo5139();
            try {
                m5142(interfaceC3606.getClass()).invoke(null, interfaceC3606, c3605Mo5139);
                Parcel parcel = c3605Mo5139.f11290;
                int i = c3605Mo5139.f11294;
                if (i >= 0) {
                    int i2 = c3605Mo5139.f11289.get(i);
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
            throw new RuntimeException(interfaceC3606.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
