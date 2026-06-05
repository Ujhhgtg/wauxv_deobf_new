package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛲᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3263feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Executor f10245Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0850feyxiexzfUjhhgtg f10246Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final byte[] f10247Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final File f10248Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f10249Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f10250Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C3272feyxiexzfUjhhgtg[] f10251Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public byte[] f10252Ujhhgtgfeyxiexzf;

    public C3263feyxiexzfUjhhgtg(AssetManager assetManager, Executor executor, InterfaceC0850feyxiexzfUjhhgtg interfaceC0850feyxiexzfUjhhgtg, String str, File file) {
        byte[] bArr;
        this.f10245Ujhhgtgfeyxiexzf = executor;
        this.f10246Ujhhgtgfeyxiexzf = interfaceC0850feyxiexzfUjhhgtg;
        this.f10249Ujhhgtgfeyxiexzf = str;
        this.f10248Ujhhgtgfeyxiexzf = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = AbstractC1264feyxiexzfUjhhgtg.f4633Ujhhgtgfeyxiexzf;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1264feyxiexzfUjhhgtg.f4632Ujhhgtgfeyxiexzf;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC1264feyxiexzfUjhhgtg.f4631Ujhhgtgfeyxiexzf;
        }
        this.f10247Ujhhgtgfeyxiexzf = bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final FileInputStream m4771Ujhhgtgfeyxiexzf(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f10246Ujhhgtgfeyxiexzf.mo1737Ujhhgtgfeyxiexzf();
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4772Ujhhgtgfeyxiexzf(int i, Serializable serializable) {
        this.f10245Ujhhgtgfeyxiexzf.execute(new RunnableC3262feyxiexzfUjhhgtg(this, i, serializable, 0));
    }
}
