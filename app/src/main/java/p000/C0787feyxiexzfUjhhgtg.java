package p000;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0787feyxiexzfUjhhgtg implements InterfaceC3157feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f3094Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0787feyxiexzfUjhhgtg(RecyclerView recyclerView) {
        this.f3094Ujhhgtgfeyxiexzf = recyclerView;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m2096Ujhhgtgfeyxiexzf(C3016Ujhhgtgfeyxiexzf c3016Ujhhgtgfeyxiexzf) {
        int i = c3016Ujhhgtgfeyxiexzf.f9371Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        if (i == 1) {
            recyclerView.f370Ujhhgtgfeyxiexzf.mo131feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
            return;
        }
        if (i == 2) {
            recyclerView.f370Ujhhgtgfeyxiexzf.mo134feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
        } else if (i == 4) {
            recyclerView.f370Ujhhgtgfeyxiexzf.mo135feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f370Ujhhgtgfeyxiexzf.mo133feyxiexzfUjhhgtg(c3016Ujhhgtgfeyxiexzf.f9372Ujhhgtgfeyxiexzf, c3016Ujhhgtgfeyxiexzf.f9374Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public AbstractC0821feyxiexzfUjhhgtg m2097Ujhhgtgfeyxiexzf(int i) {
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        int iM4087Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = null;
        for (int i2 = 0; i2 < iM4087Ujhhgtgfeyxiexzf; i2++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(recyclerView.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i2));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf == i) {
                if (!((ArrayList) recyclerView.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
                    abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg;
                    break;
                }
                abstractC0821feyxiexzfUjhhgtg = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg;
            }
        }
        if (abstractC0821feyxiexzfUjhhgtg != null) {
            if (!((ArrayList) recyclerView.f362Ujhhgtgfeyxiexzf.f8836Ujhhgtgfeyxiexzf).contains(abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf)) {
                return abstractC0821feyxiexzfUjhhgtg;
            }
            if (RecyclerView.f349feyxiexzfUjhhgtg) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void m2098Ujhhgtgfeyxiexzf(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        int iM4087Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM4087Ujhhgtgfeyxiexzf; i6++) {
            View viewM4086Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i6);
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(viewM4086Ujhhgtgfeyxiexzf);
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && (i4 = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf) >= i && i4 < i5) {
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(2);
                if (obj == null) {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(1024);
                } else if ((1024 & abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3250Ujhhgtgfeyxiexzf) == 0) {
                    if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3251Ujhhgtgfeyxiexzf == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3251Ujhhgtgfeyxiexzf = arrayList;
                        abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3252Ujhhgtgfeyxiexzf = Collections.unmodifiableList(arrayList);
                    }
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3251Ujhhgtgfeyxiexzf.add(obj);
                }
                ((C0825feyxiexzfUjhhgtg) viewM4086Ujhhgtgfeyxiexzf.getLayoutParams()).f3281Ujhhgtgfeyxiexzf = true;
            }
        }
        C0831feyxiexzfUjhhgtg c0831feyxiexzfUjhhgtg = recyclerView.f359Ujhhgtgfeyxiexzf;
        ArrayList arrayList2 = c0831feyxiexzfUjhhgtg.f3294Ujhhgtgfeyxiexzf;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList2.get(size);
            if (abstractC0821feyxiexzfUjhhgtg != null && (i3 = abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf) >= i && i3 < i5) {
                abstractC0821feyxiexzfUjhhgtg.m2170Ujhhgtgfeyxiexzf(2);
                c0831feyxiexzfUjhhgtg.m2235Ujhhgtgfeyxiexzf(size);
            }
        }
        recyclerView.f416Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public boolean mo2013Ujhhgtgfeyxiexzf(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        if (recyclerView.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.m261Ujhhgtgfeyxiexzf();
        return recyclerView.m229feyxiexzfUjhhgtg(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public float mo2014Ujhhgtgfeyxiexzf() {
        float f;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        if (recyclerView.f370Ujhhgtgfeyxiexzf.mo153Ujhhgtgfeyxiexzf()) {
            f = recyclerView.f407Ujhhgtgfeyxiexzf;
        } else {
            if (!recyclerView.f370Ujhhgtgfeyxiexzf.mo152Ujhhgtgfeyxiexzf()) {
                return 0.0f;
            }
            f = recyclerView.f406Ujhhgtgfeyxiexzf;
        }
        return -f;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public void m2099Ujhhgtgfeyxiexzf(int i, int i2) {
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        int iM4087Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        for (int i3 = 0; i3 < iM4087Ujhhgtgfeyxiexzf; i3++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(recyclerView.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i3));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && !abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2186Ujhhgtgfeyxiexzf() && abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf >= i) {
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg + " now at position " + (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf + i2));
                }
                abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i2, false);
                recyclerView.f412feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
            }
        }
        ArrayList arrayList = recyclerView.f359Ujhhgtgfeyxiexzf.f3294Ujhhgtgfeyxiexzf;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i4);
            if (abstractC0821feyxiexzfUjhhgtg != null && abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf >= i) {
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC0821feyxiexzfUjhhgtg + " now at position " + (abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf + i2));
                }
                abstractC0821feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f415Ujhhgtgfeyxiexzf = true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void m2100Ujhhgtgfeyxiexzf(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        int iM4087Ujhhgtgfeyxiexzf = recyclerView.f362Ujhhgtgfeyxiexzf.m4087Ujhhgtgfeyxiexzf();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iM4087Ujhhgtgfeyxiexzf; i11++) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg = RecyclerView.m204feyxiexzfUjhhgtg(recyclerView.f362Ujhhgtgfeyxiexzf.m4086Ujhhgtgfeyxiexzf(i11));
            if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg != null && (i10 = abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf) >= i4 && i10 <= i3) {
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg);
                }
                if (abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf == i) {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i2 - i, false);
                } else {
                    abstractC0821feyxiexzfUjhhgtgM204feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i5, false);
                }
                recyclerView.f412feyxiexzfUjhhgtg.f3210Ujhhgtgfeyxiexzf = true;
            }
        }
        ArrayList arrayList = recyclerView.f359Ujhhgtgfeyxiexzf.f3294Ujhhgtgfeyxiexzf;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg = (AbstractC0821feyxiexzfUjhhgtg) arrayList.get(i12);
            if (abstractC0821feyxiexzfUjhhgtg != null && (i9 = abstractC0821feyxiexzfUjhhgtg.f3243Ujhhgtgfeyxiexzf) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    abstractC0821feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i2 - i, z);
                } else {
                    abstractC0821feyxiexzfUjhhgtg.m2183Ujhhgtgfeyxiexzf(i8, z);
                }
                if (RecyclerView.f349feyxiexzfUjhhgtg) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC0821feyxiexzfUjhhgtg);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.f415Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC3157feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public void mo2016Ujhhgtgfeyxiexzf() {
        this.f3094Ujhhgtgfeyxiexzf.m261Ujhhgtgfeyxiexzf();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void m2101Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf2) {
        boolean zM4645Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        recyclerView.getClass();
        abstractC0821feyxiexzfUjhhgtg.m2185Ujhhgtgfeyxiexzf(false);
        C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = (C3116Ujhhgtgfeyxiexzf) recyclerView.f395feyxiexzfUjhhgtg;
        if (c0431Ujhhgtgfeyxiexzf != null) {
            c3116Ujhhgtgfeyxiexzf.getClass();
            int i = c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf;
            int i2 = c0431Ujhhgtgfeyxiexzf2.f2289Ujhhgtgfeyxiexzf;
            if (i == i2 && c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf == c0431Ujhhgtgfeyxiexzf2.f2290Ujhhgtgfeyxiexzf) {
                c3116Ujhhgtgfeyxiexzf.m4649Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
                abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setAlpha(0.0f);
                c3116Ujhhgtgfeyxiexzf.f9684Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg);
                zM4645Ujhhgtgfeyxiexzf = true;
            } else {
                zM4645Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf.m4645Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, i, c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf, i2, c0431Ujhhgtgfeyxiexzf2.f2290Ujhhgtgfeyxiexzf);
            }
        } else {
            c3116Ujhhgtgfeyxiexzf.m4649Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
            abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setAlpha(0.0f);
            c3116Ujhhgtgfeyxiexzf.f9684Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg);
            zM4645Ujhhgtgfeyxiexzf = true;
        }
        if (zM4645Ujhhgtgfeyxiexzf) {
            recyclerView.m242feyxiexzfUjhhgtg();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void m2102Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf, C0431Ujhhgtgfeyxiexzf c0431Ujhhgtgfeyxiexzf2) {
        boolean zM4645Ujhhgtgfeyxiexzf;
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        recyclerView.f359Ujhhgtgfeyxiexzf.m2240Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        recyclerView.m205Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
        abstractC0821feyxiexzfUjhhgtg.m2185Ujhhgtgfeyxiexzf(false);
        C3116Ujhhgtgfeyxiexzf c3116Ujhhgtgfeyxiexzf = (C3116Ujhhgtgfeyxiexzf) recyclerView.f395feyxiexzfUjhhgtg;
        c3116Ujhhgtgfeyxiexzf.getClass();
        int i = c0431Ujhhgtgfeyxiexzf.f2289Ujhhgtgfeyxiexzf;
        int i2 = c0431Ujhhgtgfeyxiexzf.f2290Ujhhgtgfeyxiexzf;
        View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
        int left = c0431Ujhhgtgfeyxiexzf2 == null ? view.getLeft() : c0431Ujhhgtgfeyxiexzf2.f2289Ujhhgtgfeyxiexzf;
        int top = c0431Ujhhgtgfeyxiexzf2 == null ? view.getTop() : c0431Ujhhgtgfeyxiexzf2.f2290Ujhhgtgfeyxiexzf;
        if (abstractC0821feyxiexzfUjhhgtg.m2179Ujhhgtgfeyxiexzf() || (i == left && i2 == top)) {
            c3116Ujhhgtgfeyxiexzf.m4649Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg);
            c3116Ujhhgtgfeyxiexzf.f9683Ujhhgtgfeyxiexzf.add(abstractC0821feyxiexzfUjhhgtg);
            zM4645Ujhhgtgfeyxiexzf = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM4645Ujhhgtgfeyxiexzf = c3116Ujhhgtgfeyxiexzf.m4645Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, i, i2, left, top);
        }
        if (zM4645Ujhhgtgfeyxiexzf) {
            recyclerView.m242feyxiexzfUjhhgtg();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public void m2103Ujhhgtgfeyxiexzf(int i) {
        RecyclerView recyclerView = this.f3094Ujhhgtgfeyxiexzf;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m212Ujhhgtgfeyxiexzf(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
