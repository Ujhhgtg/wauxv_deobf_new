package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1831 implements InterfaceC0955 {

    public final boolean f6115;

    public final Uri f6116;

    public final ContentResolver f6117;

    public Object f6118;

    public AbstractC1831(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f6117 = contentResolver;
        this.f6116 = uri;
        this.f6115 = z;
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        Object obj = this.f6118;
        if (obj != null) {
            try {
                mo1392(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        try {
            Object objMo1393 = mo1393(this.f6117, this.f6116);
            this.f6118 = objMo1393;
            interfaceC0954.mo1883(objMo1393);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            interfaceC0954.mo1882(e);
        }
    }

    public abstract void mo1392(Object obj);

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        return 1;
    }

    public abstract Object mo1393(ContentResolver contentResolver, Uri uri);

    @Override // p000.InterfaceC0955
    public final void cancel() {
    }
}
