package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0134;
import p000.C3547;
import p000.InterfaceC3548;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0134(7);

    public final InterfaceC3548 f457;

    public ParcelImpl(Parcel parcel) {
        this.f457 = new C3547(parcel).m5139();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C3547(parcel).m5141(this.f457);
    }
}
