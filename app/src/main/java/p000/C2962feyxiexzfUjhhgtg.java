package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2962feyxiexzfUjhhgtg implements InterfaceC3106Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C2962feyxiexzfUjhhgtg f9269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Object f9271Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2962feyxiexzfUjhhgtg(int i, Object obj) {
        this.f9270Ujhhgtgfeyxiexzf = i;
        this.f9271Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C2962feyxiexzfUjhhgtg m4428Ujhhgtgfeyxiexzf(int i, int i2, int i3) {
        return new C2962feyxiexzfUjhhgtg(0, AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C2962feyxiexzfUjhhgtg m4429Ujhhgtgfeyxiexzf(int i, int i2, int i3, int i4, boolean z) {
        return new C2962feyxiexzfUjhhgtg(1, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public String toString() {
        String str;
        switch (this.f9270Ujhhgtgfeyxiexzf) {
            case 3:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.f9271Ujhhgtgfeyxiexzf != null) {
                    str = "value=" + this.f9271Ujhhgtgfeyxiexzf;
                } else {
                    str = "value not initialized yet";
                }
                return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, str, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Object m4430Ujhhgtgfeyxiexzf(InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf) {
        Object obj = this.f9271Ujhhgtgfeyxiexzf;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Property "), ((AbstractC2646feyxiexzfUjhhgtg) interfaceC0150Ujhhgtgfeyxiexzf).f8497Ujhhgtgfeyxiexzf, " should be initialized before get."));
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public Object mo753Ujhhgtgfeyxiexzf() {
        return this.f9271Ujhhgtgfeyxiexzf;
    }

    public C2962feyxiexzfUjhhgtg(int i) {
        this.f9270Ujhhgtgfeyxiexzf = i;
        switch (i) {
            case 4:
                this.f9271Ujhhgtgfeyxiexzf = new Object();
                new Handler(Looper.getMainLooper(), new C3577Ujhhgtgfeyxiexzf(1, this));
                break;
        }
    }

    @Override // p000.InterfaceC3106Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo752Ujhhgtgfeyxiexzf() {
    }
}
