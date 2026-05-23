package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1018 {

    public final Executor f3722;

    public final InterfaceC2409 f3723;

    public final byte[] f3724;

    public final File f3725;

    public final String f3726;

    public boolean f3727 = false;

    public C1027[] f3728;

    public byte[] f3729;

    public C1018(AssetManager assetManager, Executor executor, InterfaceC2409 interfaceC2409, String str, File file) {
        this.f3722 = executor;
        this.f3723 = interfaceC2409;
        this.f3726 = str;
        this.f3725 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 27:
                    bArr = AbstractC2207.f7178;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC2207.f7177;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC2207.f7176;
                    break;
            }
        }
        this.f3724 = bArr;
    }

    public final FileInputStream m2592(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3723.mo3484();
            return null;
        }
    }

    public final void m2593(int i, Serializable serializable) {
        this.f3722.execute(new RunnableC1017(this, i, serializable, 0));
    }
}
