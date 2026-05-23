package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0685 extends AbstractC0052 {
    public static final Parcelable.Creator<C0685> CREATOR = new C0051(2);

    public boolean f2569;

    public C0685(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2569 = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2569 ? 1 : 0);
    }
}
