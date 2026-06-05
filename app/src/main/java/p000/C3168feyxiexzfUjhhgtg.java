package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3168feyxiexzfUjhhgtg implements InterfaceC3078Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Resources.Theme f9801Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Resources f9802Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3167feyxiexzfUjhhgtg f9803Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f9804Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Object f9805Ujhhgtgfeyxiexzf;

    public C3168feyxiexzfUjhhgtg(Resources.Theme theme, Resources resources, C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg, int i) {
        this.f9801Ujhhgtgfeyxiexzf = theme;
        this.f9802Ujhhgtgfeyxiexzf = resources;
        this.f9803Ujhhgtgfeyxiexzf = c3167feyxiexzfUjhhgtg;
        this.f9804Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        switch (this.f9803Ujhhgtgfeyxiexzf.f9799Ujhhgtgfeyxiexzf) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        Object obj = this.f9805Ujhhgtgfeyxiexzf;
        if (obj != null) {
            try {
                switch (this.f9803Ujhhgtgfeyxiexzf.f9799Ujhhgtgfeyxiexzf) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) {
        Object objOpenRawResourceFd;
        try {
            C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg = this.f9803Ujhhgtgfeyxiexzf;
            Resources.Theme theme = this.f9801Ujhhgtgfeyxiexzf;
            Resources resources = this.f9802Ujhhgtgfeyxiexzf;
            int i = this.f9804Ujhhgtgfeyxiexzf;
            switch (c3167feyxiexzfUjhhgtg.f9799Ujhhgtgfeyxiexzf) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = c3167feyxiexzfUjhhgtg.f9800Ujhhgtgfeyxiexzf;
                    objOpenRawResourceFd = AbstractC3612feyxiexzfUjhhgtg.m5236Ujhhgtgfeyxiexzf(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f9805Ujhhgtgfeyxiexzf = objOpenRawResourceFd;
            interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e);
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        return 1;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
    }
}
