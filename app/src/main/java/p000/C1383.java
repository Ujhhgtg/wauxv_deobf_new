package p000;

import android.net.Uri;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1383 {

    public final Uri f4978;

    public final int f4979;

    public final int f4980;

    public final boolean f4981;

    public final String f4982;

    public final int f4983;

    public C1383(Uri uri, int i, int i2, boolean z, String str, int i3) {
        
        this.f4978 = uri;
        this.f4979 = i;
        this.f4980 = i2;
        this.f4981 = z;
        this.f4982 = str;
        this.f4983 = i3;
    }

    public C1383(String str, String str2) {
        this.f4978 = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f4979 = 0;
        this.f4980 = 400;
        this.f4981 = false;
        this.f4982 = str2;
        this.f4983 = 0;
    }
}
