package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳᛴ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3070Ujhhgtgfeyxiexzf implements InterfaceC3073Ujhhgtgfeyxiexzf, InterfaceC3077Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f9503Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3087Ujhhgtgfeyxiexzf f9504Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC3074Ujhhgtgfeyxiexzf f9505Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f9506Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f9507Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public List f9508Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public int f9509Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public volatile C0286Ujhhgtgfeyxiexzf f9510Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public File f9511Ujhhgtgfeyxiexzf;

    public C3070Ujhhgtgfeyxiexzf(List list, C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf, InterfaceC3074Ujhhgtgfeyxiexzf interfaceC3074Ujhhgtgfeyxiexzf) {
        this.f9503Ujhhgtgfeyxiexzf = list;
        this.f9504Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf;
        this.f9505Ujhhgtgfeyxiexzf = interfaceC3074Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    public final void cancel() {
        C0286Ujhhgtgfeyxiexzf c0286Ujhhgtgfeyxiexzf = this.f9510Ujhhgtgfeyxiexzf;
        if (c0286Ujhhgtgfeyxiexzf != null) {
            c0286Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.cancel();
        }
    }

    @Override // p000.InterfaceC3073Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2377Ujhhgtgfeyxiexzf() {
        while (true) {
            List list = this.f9508Ujhhgtgfeyxiexzf;
            boolean z = false;
            if (list != null && this.f9509Ujhhgtgfeyxiexzf < list.size()) {
                this.f9510Ujhhgtgfeyxiexzf = null;
                while (!z && this.f9509Ujhhgtgfeyxiexzf < this.f9508Ujhhgtgfeyxiexzf.size()) {
                    List list2 = this.f9508Ujhhgtgfeyxiexzf;
                    int i = this.f9509Ujhhgtgfeyxiexzf;
                    this.f9509Ujhhgtgfeyxiexzf = i + 1;
                    InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf = (InterfaceC0285Ujhhgtgfeyxiexzf) list2.get(i);
                    File file = this.f9511Ujhhgtgfeyxiexzf;
                    C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf = this.f9504Ujhhgtgfeyxiexzf;
                    this.f9510Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(file, c3087Ujhhgtgfeyxiexzf.f9551Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf.f9552Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf.f9555Ujhhgtgfeyxiexzf);
                    if (this.f9510Ujhhgtgfeyxiexzf != null && this.f9504Ujhhgtgfeyxiexzf.m4576Ujhhgtgfeyxiexzf(this.f9510Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1381Ujhhgtgfeyxiexzf()) != null) {
                        this.f9510Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf.mo1383Ujhhgtgfeyxiexzf(this.f9504Ujhhgtgfeyxiexzf.f9561Ujhhgtgfeyxiexzf, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f9506Ujhhgtgfeyxiexzf + 1;
            this.f9506Ujhhgtgfeyxiexzf = i2;
            if (i2 >= this.f9503Ujhhgtgfeyxiexzf.size()) {
                return false;
            }
            InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = (InterfaceC0156Ujhhgtgfeyxiexzf) this.f9503Ujhhgtgfeyxiexzf.get(this.f9506Ujhhgtgfeyxiexzf);
            C3087Ujhhgtgfeyxiexzf c3087Ujhhgtgfeyxiexzf2 = this.f9504Ujhhgtgfeyxiexzf;
            File fileMo3704Ujhhgtgfeyxiexzf = c3087Ujhhgtgfeyxiexzf2.f9554Ujhhgtgfeyxiexzf.m4818Ujhhgtgfeyxiexzf().mo3704Ujhhgtgfeyxiexzf(new C3069Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, c3087Ujhhgtgfeyxiexzf2.f9560Ujhhgtgfeyxiexzf));
            this.f9511Ujhhgtgfeyxiexzf = fileMo3704Ujhhgtgfeyxiexzf;
            if (fileMo3704Ujhhgtgfeyxiexzf != null) {
                this.f9507Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
                this.f9508Ujhhgtgfeyxiexzf = this.f9504Ujhhgtgfeyxiexzf.f9549Ujhhgtgfeyxiexzf.m5116Ujhhgtgfeyxiexzf().m2471Ujhhgtgfeyxiexzf(fileMo3704Ujhhgtgfeyxiexzf);
                this.f9509Ujhhgtgfeyxiexzf = 0;
            }
        }
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1799Ujhhgtgfeyxiexzf(Exception exc) {
        this.f9505Ujhhgtgfeyxiexzf.mo2717Ujhhgtgfeyxiexzf(this.f9507Ujhhgtgfeyxiexzf, exc, this.f9510Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf, 3);
    }

    @Override // p000.InterfaceC3077Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1801Ujhhgtgfeyxiexzf(Object obj) {
        this.f9505Ujhhgtgfeyxiexzf.mo2716Ujhhgtgfeyxiexzf(this.f9507Ujhhgtgfeyxiexzf, obj, this.f9510Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf, 3, this.f9507Ujhhgtgfeyxiexzf);
    }
}
