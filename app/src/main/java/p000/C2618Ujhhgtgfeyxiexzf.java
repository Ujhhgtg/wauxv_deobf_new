package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2618Ujhhgtgfeyxiexzf implements InterfaceC3078Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8439Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2618Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f8438Ujhhgtgfeyxiexzf = i;
        this.f8439Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
        int i = this.f8438Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        switch (this.f8438Ujhhgtgfeyxiexzf) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f8439Ujhhgtgfeyxiexzf.getClass();
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        int i = this.f8438Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) {
        switch (this.f8438Ujhhgtgfeyxiexzf) {
            case 0:
                try {
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(AbstractC2648Ujhhgtgfeyxiexzf.m3978Ujhhgtgfeyxiexzf((File) this.f8439Ujhhgtgfeyxiexzf));
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e);
                    return;
                }
                break;
            default:
                interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(this.f8439Ujhhgtgfeyxiexzf);
                break;
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        switch (this.f8438Ujhhgtgfeyxiexzf) {
        }
        return 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    private final void m3923Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    private final void m3924Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    private final void m3925Ujhhgtgfeyxiexzf() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    private final void m3926Ujhhgtgfeyxiexzf() {
    }
}
