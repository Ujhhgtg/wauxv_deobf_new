package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲈᛸᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2556 extends AbstractC0059 {
    public static final Parcelable.Creator<C2556> CREATOR = new C0058(7);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Parcelable f8127;

    public C2556(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8127 = parcel.readParcelable(classLoader == null ? AbstractC2546.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8127, 0);
    }
}
