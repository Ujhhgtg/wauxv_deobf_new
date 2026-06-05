package p000;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ能不能ᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0794feyxiexzfUjhhgtg extends Observable {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m2130Ujhhgtgfeyxiexzf() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2131Ujhhgtgfeyxiexzf() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0813feyxiexzfUjhhgtg) ((Observable) this).mObservers.get(size)).f3220Ujhhgtgfeyxiexzf;
            recyclerView.m207Ujhhgtgfeyxiexzf(null);
            recyclerView.f412feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
            recyclerView.m244Ujhhgtgfeyxiexzf(true);
            if (!recyclerView.f361Ujhhgtgfeyxiexzf.m4484Ujhhgtgfeyxiexzf()) {
                recyclerView.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2132Ujhhgtgfeyxiexzf(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0813feyxiexzfUjhhgtg c0813feyxiexzfUjhhgtg = (C0813feyxiexzfUjhhgtg) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0813feyxiexzfUjhhgtg.f3220Ujhhgtgfeyxiexzf;
            recyclerView.m207Ujhhgtgfeyxiexzf(null);
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = recyclerView.f361Ujhhgtgfeyxiexzf;
            ArrayList arrayList = (ArrayList) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf;
            if (i != i2) {
                arrayList.add(c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(null, 8, i, i2));
                c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf |= 8;
                if (arrayList.size() == 1) {
                    c0813feyxiexzfUjhhgtg.m2159Ujhhgtgfeyxiexzf();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2133Ujhhgtgfeyxiexzf(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C0813feyxiexzfUjhhgtg c0813feyxiexzfUjhhgtg = (C0813feyxiexzfUjhhgtg) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c0813feyxiexzfUjhhgtg.f3220Ujhhgtgfeyxiexzf;
            recyclerView.m207Ujhhgtgfeyxiexzf(null);
            C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = recyclerView.f361Ujhhgtgfeyxiexzf;
            ArrayList arrayList = (ArrayList) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf;
            if (i2 >= 1) {
                arrayList.add(c3017Ujhhgtgfeyxiexzf.m4486feyxiexzfUjhhgtg(null, 4, i, i2));
                c3017Ujhhgtgfeyxiexzf.f9376Ujhhgtgfeyxiexzf |= 4;
                if (arrayList.size() == 1) {
                    c0813feyxiexzfUjhhgtg.m2159Ujhhgtgfeyxiexzf();
                }
            }
        }
    }
}
