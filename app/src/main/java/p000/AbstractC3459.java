package p000;

import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.view.WindowInsets;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3459 {
    public static /* bridge */ /* synthetic */ CellIdentityNr m5022(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr m5023(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ CellInfoTdscdma m5024(CellInfo cellInfo) {
        return (CellInfoTdscdma) cellInfo;
    }

    public static /* synthetic */ WindowInsets.Builder m5025() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder m5026(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean m5035(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }
}
