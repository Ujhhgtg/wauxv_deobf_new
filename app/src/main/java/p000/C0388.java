package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0388 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0388> CREATOR = new C0134(2);

    public float f1794;

    public float f1795;

    public ArrayList f1796;

    public float f1797;

    public boolean f1798;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f1794);
        parcel.writeFloat(this.f1795);
        parcel.writeList(this.f1796);
        parcel.writeFloat(this.f1797);
        parcel.writeBooleanArray(new boolean[]{this.f1798});
    }
}
