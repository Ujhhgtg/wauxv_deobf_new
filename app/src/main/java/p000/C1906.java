package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1906 extends AbstractC0052 {
    public static final Parcelable.Creator<C1906> CREATOR = new C0051(4);

    public boolean f6281;

    public C1906(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1906.class.getClassLoader();
        }
        this.f6281 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6281 ? 1 : 0);
    }
}
