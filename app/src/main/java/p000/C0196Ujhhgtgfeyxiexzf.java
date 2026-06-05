package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳᛴ能不能要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0196Ujhhgtgfeyxiexzf extends C2949feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f1422Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0196Ujhhgtgfeyxiexzf(int i) {
        this.f1422Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1258Ujhhgtgfeyxiexzf(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1422Ujhhgtgfeyxiexzf) {
            case 1:
                super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo1258Ujhhgtgfeyxiexzf(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo865Ujhhgtgfeyxiexzf(View view, C2963feyxiexzfUjhhgtg c2963feyxiexzfUjhhgtg) {
        int scrollRange;
        switch (this.f1422Ujhhgtgfeyxiexzf) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
                this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2963feyxiexzfUjhhgtg.f9272Ujhhgtgfeyxiexzf;
                this.f9251Ujhhgtgfeyxiexzf.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c2963feyxiexzfUjhhgtg.m4439Ujhhgtgfeyxiexzf(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo2.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9256Ujhhgtgfeyxiexzf);
                        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9261Ujhhgtgfeyxiexzf);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9255Ujhhgtgfeyxiexzf);
                        c2963feyxiexzfUjhhgtg.m4433Ujhhgtgfeyxiexzf(C2956feyxiexzfUjhhgtg.f9262Ujhhgtgfeyxiexzf);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // p000.C2949feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public boolean mo866Ujhhgtgfeyxiexzf(View view, int i, Bundle bundle) {
        int iMin;
        switch (this.f1422Ujhhgtgfeyxiexzf) {
            case 1:
                if (super.mo866Ujhhgtgfeyxiexzf(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i == 4096) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m89Ujhhgtgfeyxiexzf(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 8192 || i == 16908344) {
                        int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (iMax != nestedScrollView.getScrollY()) {
                            nestedScrollView.m89Ujhhgtgfeyxiexzf(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    } else if (i == 16908346) {
                        iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                        if (iMin != nestedScrollView.getScrollY()) {
                            nestedScrollView.m89Ujhhgtgfeyxiexzf(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.mo866Ujhhgtgfeyxiexzf(view, i, bundle);
        }
    }
}
