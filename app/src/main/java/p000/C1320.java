package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1320 implements InterfaceC0955 {

    public final String f4766;

    public final AssetManager f4767;

    public Object f4768;

    public final /* synthetic */ int f4769;

    public C1320(AssetManager assetManager, String str, int i) {
        this.f4769 = i;
        this.f4767 = assetManager;
        this.f4766 = str;
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        switch (this.f4769) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1855() {
        Object obj = this.f4768;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f4769) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000.InterfaceC0955
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f4767;
            String str = this.f4766;
            switch (this.f4769) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f4768 = objOpenFd;
            interfaceC0954.mo1883(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC0954.mo1882(e);
        }
    }

    @Override // p000.InterfaceC0955
    public final int mo1857() {
        return 1;
    }

    @Override // p000.InterfaceC0955
    public final void cancel() {
    }
}
