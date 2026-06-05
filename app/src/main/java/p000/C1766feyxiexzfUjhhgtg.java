package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛱfeyxiexzfᛱ要点脸ᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1766feyxiexzfUjhhgtg implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f5937Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Iterator f5938Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f5939Ujhhgtgfeyxiexzf;

    public C1766feyxiexzfUjhhgtg(C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf) {
        this.f5937Ujhhgtgfeyxiexzf = 1;
        this.f5939Ujhhgtgfeyxiexzf = new ArrayList();
        this.f5938Ujhhgtgfeyxiexzf = c2930Ujhhgtgfeyxiexzf;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5937Ujhhgtgfeyxiexzf) {
            case 0:
                break;
        }
        return this.f5938Ujhhgtgfeyxiexzf.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5937Ujhhgtgfeyxiexzf) {
            case 0:
                return ((C3455feyxiexzfUjhhgtg) this.f5939Ujhhgtgfeyxiexzf).f10744Ujhhgtgfeyxiexzf.invoke(this.f5938Ujhhgtgfeyxiexzf.next());
            default:
                Object next = this.f5938Ujhhgtgfeyxiexzf.next();
                ArrayList arrayList = (ArrayList) this.f5939Ujhhgtgfeyxiexzf;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C2930Ujhhgtgfeyxiexzf c2930Ujhhgtgfeyxiexzf = viewGroup != null ? new C2930Ujhhgtgfeyxiexzf(7, viewGroup) : null;
                if (c2930Ujhhgtgfeyxiexzf == null || !c2930Ujhhgtgfeyxiexzf.hasNext()) {
                    while (!this.f5938Ujhhgtgfeyxiexzf.hasNext() && !arrayList.isEmpty()) {
                        this.f5938Ujhhgtgfeyxiexzf = (Iterator) AbstractC2856feyxiexzfUjhhgtg.m4244feyxiexzfUjhhgtg(arrayList);
                        AbstractC2862feyxiexzfUjhhgtg.m4269feyxiexzfUjhhgtg(arrayList);
                    }
                } else {
                    arrayList.add(this.f5938Ujhhgtgfeyxiexzf);
                    this.f5938Ujhhgtgfeyxiexzf = c2930Ujhhgtgfeyxiexzf;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5937Ujhhgtgfeyxiexzf) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1766feyxiexzfUjhhgtg(C3455feyxiexzfUjhhgtg c3455feyxiexzfUjhhgtg) {
        this.f5937Ujhhgtgfeyxiexzf = 0;
        this.f5939Ujhhgtgfeyxiexzf = c3455feyxiexzfUjhhgtg;
        this.f5938Ujhhgtgfeyxiexzf = c3455feyxiexzfUjhhgtg.f10743Ujhhgtgfeyxiexzf.iterator();
    }
}
