package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᤝᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1933 extends AbstractC0059 {
    public static final Parcelable.Creator<C1933> CREATOR = new C0058(4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f6360;

    public C1933(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1933.class.getClassLoader();
        }
        this.f6360 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6360 ? 1 : 0);
    }
}
