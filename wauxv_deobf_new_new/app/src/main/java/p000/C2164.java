package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᲁᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2164 extends AbstractC0059 {
    public static final Parcelable.Creator<C2164> CREATOR = new C0058(5);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Bundle f7184;

    public C2164(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7184 = parcel.readBundle(classLoader == null ? C2164.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0059, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f7184);
    }
}
