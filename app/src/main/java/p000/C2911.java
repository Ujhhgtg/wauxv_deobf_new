package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2911 extends AbstractC0052 {
    public static final Parcelable.Creator<C2911> CREATOR = new C0051(9);

    public CharSequence f9360;

    public boolean f9361;

    public C2911(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9360 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9361 = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9360) + "}";
    }

    @Override // p000.AbstractC0052, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f9360, parcel, i);
        parcel.writeInt(this.f9361 ? 1 : 0);
    }
}
