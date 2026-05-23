package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2130 extends AbstractC0052 {
    public static final Parcelable.Creator<C2130> CREATOR = new C0051(5);

    public Bundle f7060;

    public C2130(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7060 = parcel.readBundle(classLoader == null ? C2130.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f7060);
    }
}
