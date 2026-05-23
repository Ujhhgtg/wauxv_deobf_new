package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3417 extends AbstractC0052 {
    public static final Parcelable.Creator<C3417> CREATOR = new C0051(10);

    public int f10761;

    public boolean f10762;

    public C3417(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10761 = parcel.readInt();
        this.f10762 = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10761);
        parcel.writeInt(this.f10762 ? 1 : 0);
    }
}
